package cn.mnquan.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * <p>
 * 描述
 * </p>
 * User: wangkecheng Date: 2018/10/15
 */
@Controller
@Slf4j
public class OrderController extends BaseController{

    /**
     * 跳转到我的订单
     * @return
     */
    @RequestMapping("/app/order/order.do")
    public String orderList(){

        return "page/order_list";
    }
}
