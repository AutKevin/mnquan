package cn.mnquan.controller;

import cn.mnquan.manager.IOrderManager;
import cn.mnquan.manager.IRecvManager;
import cn.mnquan.manager.IUserManager;
import cn.mnquan.mapper.TbMnAdzoneMapper;
import cn.mnquan.model.TbMnAdzoneDo;
import cn.mnquan.model.TbMnAdzoneDoExample;
import cn.mnquan.model.TbMnUserDo;
import cn.mnquan.model.TbMnUserDoExample;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.naming.Context;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
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
    @Autowired
    private IRecvManager recvManager;
    @Autowired
    private TbMnAdzoneMapper tbMnAdzoneMapper;

    /**
     * 用户管理中心入口
     * @return
     */
    @RequestMapping("/app/user/centre.do")
    public String userCenter(HttpSession session, Model model){
        //如果sessionz中有值，跳转到用户中心
        try {
            Object accountNo = session.getAttribute("accountNo");
            double totalAmt = 0;//总金额
            double daiTotalAmt = 0;//待结算
            double hasRecvTotalAmt = 0;//已领取的金额
            if(accountNo != null){
                //查出用户信息
                TbMnUserDo tbMnUserDo = userManager.queryUserByAccountNo(String.valueOf(accountNo));
                model.addAttribute("userDo",tbMnUserDo);
                //获取用户的总金额
                totalAmt = orderManager.getTotalAmt(tbMnUserDo);
                //获取用户待结算的总金额
                daiTotalAmt = orderManager.getDaiTotalAmt(tbMnUserDo);
                //用户可提现余额=总金额-已经提现的额度
                hasRecvTotalAmt = recvManager.getHasReceiveAmt(tbMnUserDo.getId());
            }
            model.addAttribute("totalAmt",totalAmt);
            model.addAttribute("daiTotalAmt",daiTotalAmt);
            model.addAttribute("canRecvAmt",new BigDecimal(Double.toString(totalAmt)).subtract(new BigDecimal(Double.toString(hasRecvTotalAmt))).doubleValue());
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

    /**
     * 换绑提现账号
     * @return
     */
    @RequestMapping("/app/user/resetAccount.do")
    public void resetAccount(HttpServletResponse response, TbMnUserDo tbMnUserDo,HttpSession session){
        boolean flag = false;
        try {
            Object accountNo = session.getAttribute("accountNo");
            if(accountNo != null){
                tbMnUserDo.setAccount(String.valueOf(accountNo));
                userManager.resetAccount(tbMnUserDo);
                sendMessages(response, JSON.toJSONString(tbMnUserDo.getBindAccount()));
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        sendMessages(response, JSON.toJSONString(flag));
    }

    /**
     * 联系我们
     * @return
     */
    @RequestMapping("/app/user/contact.do")
    public String contact(){
        return "page/contact";
    }

    /**
     * 联系我们
     * @return
     */
    @RequestMapping("/app/user/invite.do")
    public String invite(HttpSession session,Model model){
        try {
            Object accountNo = session.getAttribute("accountNo");
            if(accountNo != null){
                TbMnAdzoneDoExample example = new TbMnAdzoneDoExample();
                example.createCriteria().andAccountEqualTo(String.valueOf(accountNo));

                List<TbMnAdzoneDo> list = tbMnAdzoneMapper.selectByExample(example);
                if(null != list && list.size() > 0){
                    model.addAttribute("inviteCode",list.get(0).getRegisterCode());
                    return "page/invite";
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "page/invite";
    }

    /**
     * 下载页面
     * @return
     */
    @RequestMapping("/app/apk/download.do")
    public String download(){
        return "page/download";
    }

    /**
     * 我的团队
     * @return
     */
    @RequestMapping("/app/user/team.do")
    public String team(HttpSession session,Model model){
        int teamCount = 0;
        try {
            Object accountNo = session.getAttribute("accountNo");
            if(accountNo != null){
                //查出用户信息
                TbMnUserDo tbMnUserDo = userManager.queryUserByAccountNo(String.valueOf(accountNo));
                //根据用户信息查出团队人数
                teamCount = userManager.queryTeamCount(tbMnUserDo);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        model.addAttribute("teamCount",teamCount);
        return "page/team";
    }
}
