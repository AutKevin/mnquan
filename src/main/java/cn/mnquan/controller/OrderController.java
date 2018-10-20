package cn.mnquan.controller;

import cn.mnquan.manager.IOrderManager;
import cn.mnquan.manager.IUserManager;
import cn.mnquan.model.TbMnOrderDo;
import cn.mnquan.model.TbMnUserDo;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 描述
 * </p>
 * User: wangkecheng Date: 2018/10/15
 */
@Controller
@Slf4j
public class OrderController extends BaseController{

    @Autowired
    private IOrderManager orderManager;
    @Autowired
    private IUserManager userManager;

    /**
     * 跳转到我的订单
     * @return
     */
    @RequestMapping("/app/order/queryOrderCheckLoginStats.do")
    public void queryOrderCheckLoginStats(HttpSession session,HttpServletResponse response){
        Object accountNo = session.getAttribute("accountNo");
        if(accountNo != null){//用户已经登陆
            sendMessages(response, JSON.toJSONString("true"));
        }else {//未登陆
            sendMessages(response, JSON.toJSONString("false"));
        }
    }

    /**
     * 跳转到我的订单
     * @return
     */
    @RequestMapping("/app/order/skipOrderPage.do")
    public String skipOrderPage(TbMnOrderDo tbMnOrderDo,Model model){
        model.addAttribute("tbMnOrderDo",tbMnOrderDo);
        return "page/order_list";
    }
    /**
     * 订单查询
     * @return
     */
    @RequestMapping("/app/order/queryOrders.do")
    public void queryOrders(TbMnOrderDo tbMnOrderDo,HttpServletResponse response,HttpSession session){
        //获取当前登陆的账号，查出广告位id
        Object accountNo = session.getAttribute("accountNo");
        TbMnUserDo tbMnUserDo = userManager.queryUserByAccountNo(String.valueOf(accountNo));
        List<String> adzoneIds = new ArrayList<String>();
        adzoneIds.add(tbMnUserDo.getId());
        if("2".equals(tbMnUserDo.getIsAgency())){//如果是代理，则需要查询出团队的订单
            List<TbMnUserDo> list = userManager.queryUserList(tbMnUserDo);
            for(TbMnUserDo userDo : list){
                adzoneIds.add(userDo.getId());//获取团队广告位id
            }
        }
        tbMnOrderDo.setAdzoneId(tbMnUserDo.getAgencyId());
        List<TbMnOrderDo> list = orderManager.queryOrderByStatus(tbMnOrderDo,adzoneIds);
        sendMessages(response, JSON.toJSONString(list));
    }
}
