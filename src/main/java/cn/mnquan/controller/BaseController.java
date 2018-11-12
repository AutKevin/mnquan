package cn.mnquan.controller;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 描述
 * </p>
 * User: wangkecheng Date: 2018/9/25
 */
@Slf4j
public class BaseController {
    /**
     * 功能 :发送页面消息
     * 开发：wangjun 2014-11-19
     * @param response
     * @param json
     */
    public void sendMessages(HttpServletResponse response, String json) {
        response.setCharacterEncoding("UTF-8");
        try{
            response.getWriter().print(json);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * 根据名字获取cookie
     * @param request
     * @param name cookie名字
     * @return
     */
    public Cookie getCookieByName(HttpServletRequest request, String name){
        Map<String,Cookie> cookieMap = ReadCookieMap(request);
        if(cookieMap.containsKey(name)){
            Cookie cookie = (Cookie)cookieMap.get(name);
            return cookie;
        }else{
            return null;
        }
    }

    /**
     * 将cookie封装到Map里面
     * @param request
     * @return
     */
    private  Map<String,Cookie> ReadCookieMap(HttpServletRequest request){
        Map<String,Cookie> cookieMap = new HashMap<String,Cookie>();
        Cookie[] cookies = request.getCookies();
        if(null!=cookies){
            for(Cookie cookie : cookies){
                cookieMap.put(cookie.getName(), cookie);
            }
        }
        return cookieMap;
    }
    /**
     * 添加cookie
     * @param response
     * @param name
     * @param value
     */
    public void addCookie(HttpServletResponse response,String name,String value){
        Cookie cookie = new Cookie(name.trim(), value.trim());
        cookie.setMaxAge(360*24*24*60*60);// 设置为1年
        cookie.setPath("/");
        response.addCookie(cookie);
    }

    /**
     * 删除
     * @param request
     * @param response
     * @param name
     */
    public void delCookie(HttpServletRequest request,HttpServletResponse response,String name){
        Cookie[] cookies = request.getCookies();
        if (null==cookies) {
            log.info("没有此cookie");
        } else {
            for(Cookie cookie : cookies){
                if(cookie.getName().equals(name)){
                    cookie.setValue(null);
                    cookie.setMaxAge(0);// 立即销毁cookie
                    cookie.setPath("/");
                    log.info("被删除的cookie名字为:{}",cookie.getName());
                    response.addCookie(cookie);
                    break;
                }
            }
        }
    }
}
