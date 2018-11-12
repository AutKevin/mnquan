package cn.mnquan.controller;

import cn.mnquan.manager.IOrderManager;
import cn.mnquan.manager.IRecvManager;
import cn.mnquan.manager.IUserManager;
import cn.mnquan.mapper.TbMnAdzoneMapper;
import cn.mnquan.model.*;
import cn.mnquan.utils.DateUtil;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import weibo4j.Timeline;
import weibo4j.http.ImageItem;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.InputStream;
import java.math.BigDecimal;
import java.net.URL;
import java.net.URLEncoder;
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
    public String userCenter(HttpServletRequest request, Model model){
        //如果cookie中有值，跳转到用户中心
        try {
            Cookie cookie = getCookieByName(request,"accountNo");
            double totalAmt = 0;//总金额
            double daiTotalAmt = 0;//待结算
            double hasRecvTotalAmt = 0;//已领取的金额
            if(cookie != null){
                //查出用户信息
                TbMnUserDo tbMnUserDo = userManager.queryUserByAccountNo(cookie.getValue());
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
    public void register(HttpServletResponse response, TbMnUserDo tbMnUserDo){
        String result = userManager.addUser(tbMnUserDo);
        if("4".equals(result)){
            addCookie(response,"accountNo",tbMnUserDo.getAccount());
        }
        sendMessages(response, JSON.toJSONString(result));
    }

    /**
     * 退出登陆
     * @return
     */
    @RequestMapping("/app/user/logout.do")
    public String logout(HttpServletRequest request,HttpServletResponse response){
        delCookie(request,response,"accountNo");
       return "page/centre";
    }

    /**
     * 换绑提现账号
     * @return
     */
    @RequestMapping("/app/user/resetAccount.do")
    public void resetAccount(HttpServletResponse response, TbMnUserDo tbMnUserDo,HttpServletRequest request){
        boolean flag = false;
        try {
            Cookie cookie = getCookieByName(request,"accountNo");
            if(cookie != null){
                tbMnUserDo.setAccount(cookie.getValue());
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
    public String invite(HttpServletRequest request,Model model){
        try {
            Cookie cookie = getCookieByName(request,"accountNo");
            if(cookie != null){
                TbMnAdzoneDoExample example = new TbMnAdzoneDoExample();
                example.createCriteria().andAccountEqualTo(cookie.getValue());

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
    public String team(HttpServletRequest request,Model model){
        int teamCount = 0;
        try {
            Cookie cookie = getCookieByName(request,"accountNo");
            if(cookie != null){
                //查出用户信息
                TbMnUserDo tbMnUserDo = userManager.queryUserByAccountNo(cookie.getValue());
                //根据用户信息查出团队人数
                teamCount = userManager.queryTeamCount(tbMnUserDo);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        model.addAttribute("teamCount",teamCount);
        return "page/team";
    }
    /**
     * 后台发微博
     * @return
     */
    @RequestMapping("/app/user/htSendWeiBo.do")
    public void htSendWeiBo(TbMnMaterialOptionalDo item){
        try {
            String access_token = "2.002S3P4HE3KwGE3ad98af740k43PDC";
            String statuses = URLEncoder.encode(item.getShortTitle()+"\n【原价】"+item.getZkFinalPrice()+"元，【"+item.getCouponInfo()+"】\n【优惠券详情链接】 http://www.mnquan.cn/app/detail/skipProductDetail.do?type=weibo&numIid="+item.getNumIid()+"\n【app下载链接】 http://www.mnquan.cn/app/apk/download.do","utf-8");
            Timeline tm = new Timeline(access_token);

            ImageItem imageItem1 = new ImageItem(loadImageByte(item.getPictUrl()));

            tm.share(statuses,imageItem1);
            log.info("微博发送成功,dateTime:{}", DateUtil.getCurrentTimeBySecond());
        } catch (Exception e) {
            log.error(e.getMessage(),e);
        }
    }

    public byte[] loadImageByte(String imgUrl) {
        byte[] picData = null;
        try {
            InputStream inputImage = new URL(imgUrl).openStream();
            picData = IOUtils.toByteArray(inputImage);
        } catch (Exception e) {
            log.error(e.getMessage(),e);
        }
        return picData;
    }
}
