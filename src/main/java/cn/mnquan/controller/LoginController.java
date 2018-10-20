package cn.mnquan.controller;

import cn.mnquan.manager.ILoginManager;
import cn.mnquan.model.TbMnUserDo;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * <p>
 * 登陆
 * </p>
 * User: wangkecheng Date: 2018/10/13
 */
@Controller
@Slf4j
public class LoginController extends BaseController {

    @Autowired
    private ILoginManager loginManager;

    /**
     * app优惠券入口
     * @return
     */
    @RequestMapping("/app/login/login.do")
    public void login(HttpSession session, HttpServletResponse response, TbMnUserDo tbMnUserDo){
        String result = null;
        if(null == tbMnUserDo.getAccount() || null == tbMnUserDo.getPwd()){
            result = "1";//用户名或密码不能为空！
            sendMessages(response, JSON.toJSONString(result));
            return;
        }
        boolean flag = loginManager.checkAccountAndPwd(tbMnUserDo);
        if(!flag){
            result = "2";//用户名或密码错误！
            sendMessages(response, JSON.toJSONString(result));
            return;
        }
        session.setAttribute("accountNo",tbMnUserDo.getAccount());
        result = "3";//校验成功
        sendMessages(response, JSON.toJSONString(result));
    }

    /**
     * app优惠券入口
     * @return
     */
    @RequestMapping("/app/login/register.do")
    public String register(){
        return "page/register";
    }

    /**
     * 跳转登陆页面
     * @return
     */
    @RequestMapping("/app/login/toLogin.do")
    public String toLogin(){
        return "page/login";
    }
}
