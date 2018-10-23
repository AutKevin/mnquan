package cn.mnquan.controller;

import cn.mnquan.manager.IOrderManager;
import cn.mnquan.manager.IUserManager;
import cn.mnquan.model.TbMnUserDo;
import cn.mnquan.model.TbMnUserDoExample;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.List;

/**
 * <p>
 * 用户管理中心
 * </p>
 * User: wangkecheng Date: 2018/10/13
 */
@Controller
@Slf4j
public class UserController extends BaseController {

    @Autowired
    private IUserManager userManager;
    @Autowired
    private IOrderManager orderManager;

    /**
     * 用户管理中心入口
     * @return
     */
    @RequestMapping("/app/user/centre.do")
    public String userCenter(HttpSession session, Model model){
        //如果sessionz中有值，跳转到用户中心
        try {
            Object accountNo = session.getAttribute("accountNo");
            double ownAmt = 0;
            double teadAmt = 0;
            double daiOwnAmt = 0;
            double daiTeadAmt = 0;
            if(accountNo != null){
                //查出用户信息
                TbMnUserDo tbMnUserDo = userManager.queryUserByAccountNo(String.valueOf(accountNo));
                model.addAttribute("userDo",tbMnUserDo);
                //获取用户累计收益=自己收益*55%+团队收益*5
                ownAmt = orderManager.getownAmt(tbMnUserDo);
                ownAmt = new BigDecimal(ownAmt).multiply(new BigDecimal(55)).divide(new BigDecimal(100)).doubleValue();
                daiOwnAmt = orderManager.getdaiOwnAmt(tbMnUserDo);
                daiOwnAmt = new BigDecimal(daiOwnAmt).multiply(new BigDecimal(55)).divide(new BigDecimal(100)).doubleValue();
                List<TbMnUserDo> userDos = userManager.queryUserList(tbMnUserDo);
                if(null != userDos && userDos.size() > 0){
                    teadAmt = orderManager.getTeadAmt(userDos);
                    daiTeadAmt = orderManager.getDaiTeadAmt(userDos);
                    teadAmt = new BigDecimal(teadAmt).multiply(new BigDecimal(5)).divide(new BigDecimal(100)).doubleValue();
                    daiTeadAmt = new BigDecimal(daiTeadAmt).multiply(new BigDecimal(5)).divide(new BigDecimal(100)).doubleValue();

                }
            }
            model.addAttribute("totalAmt",new BigDecimal(ownAmt).add(new BigDecimal(teadAmt)).setScale(2, BigDecimal.ROUND_DOWN).doubleValue());
            model.addAttribute("daiTotalAmt",new BigDecimal(daiOwnAmt).add(new BigDecimal(daiTeadAmt)).setScale(2, BigDecimal.ROUND_DOWN).doubleValue());
        } catch (Exception e) {
            log.error(e.getMessage(),e);
        }
        return "page/centre";
    }

    /**
     * 用户注册
     * @return
     */
    @RequestMapping("/app/user/register.do")
    public void register(HttpServletResponse response, TbMnUserDo tbMnUserDo,HttpSession session){
        String result = userManager.addUser(tbMnUserDo);
        if("4".equals(result)){
            session.setAttribute("accountNo",tbMnUserDo.getAccount());
        }
        sendMessages(response, JSON.toJSONString(result));
    }

    /**
     * 退出登陆
     * @return
     */
    @RequestMapping("/app/user/logout.do")
    public String logout(HttpSession session){
       session.removeAttribute("accountNo");
       return "page/centre";
    }
}
