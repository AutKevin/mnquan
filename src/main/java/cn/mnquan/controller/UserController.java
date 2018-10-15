package cn.mnquan.controller;

import cn.mnquan.manager.IUserManager;
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
 * 用户管理中心
 * </p>
 * User: wangkecheng Date: 2018/10/13
 */
@Controller
@Slf4j
public class UserController extends BaseController {

    @Autowired
    private IUserManager userManager;

    /**
     * 用户管理中心入口
     * @return
     */
    @RequestMapping("/app/user/centre.do")
    public String userCenter(HttpSession session){
        //如果sessionz中有值，跳转到用户中心
        Object accountNo = session.getAttribute("accountNo");
        if(accountNo != null){

        }
        return "page/centre";
    }

    /**
     * 用户注册
     * @return
     */
    @RequestMapping("/app/user/register.do")
    public void register(HttpServletResponse response, TbMnUserDo tbMnUserDo){
        String result = null;
        if(null == tbMnUserDo.getAccount() || null == tbMnUserDo.getPwd()){
            result = "1";//用户名或密码不能为空！
            sendMessages(response, JSON.toJSONString(result));
            return;
        }
        result = userManager.addUser(tbMnUserDo);
        sendMessages(response, JSON.toJSONString(result));
    }
}