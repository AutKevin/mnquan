package cn.mnquan.controller;

import cn.mnquan.manager.IOrderManager;
import cn.mnquan.manager.IRecvManager;
import cn.mnquan.manager.IUserManager;
import cn.mnquan.model.TbMnReceiveDo;
import cn.mnquan.model.TbMnUserDo;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.List;

/**
 * <p>
 * 描述
 * </p>
 * User: wangkecheng Date: 2018/10/24
 */
@Controller
@Slf4j
public class RecvController extends BaseController {

    @Autowired
    private IRecvManager recvManager;
    @Autowired
    private IUserManager userManager;
    @Autowired
    private IOrderManager orderManager;
    /**
     * 跳转到提现界面，并查询出可提现金额
     * @return
     */
    @RequestMapping("/app/receive/skipRecvPage.do")
    public void skipRecvPage(HttpSession session, HttpServletResponse response){
        Object accountNo = session.getAttribute("accountNo");
        if(accountNo != null){//用户已经登陆
            sendMessages(response, JSON.toJSONString("true"));
        }else {//未登陆
            sendMessages(response, JSON.toJSONString("false"));
        }
    }

    /**
     * 获取详情页的数据
     * @return
     */
    @RequestMapping("/app/receive/recvPage.do")
    public String recvPage(HttpSession session, Model model){
        double totalAmt = 0.00;//总金额
        double hasRecvTotalAmt = 0.00;//已领取的金额
        try {
            Object accountNo = session.getAttribute("accountNo");
            if(accountNo != null){//用户已经登陆
                //根据当前登陆的账号，绑定的支付宝账号
                TbMnUserDo userDo = userManager.queryUserByAccountNo(String.valueOf(accountNo));
                //用户的领取记录
                List<TbMnReceiveDo> receiveDos = recvManager.getTbMnReceiveDo(userDo.getId());
                //获取用户可提现余额 = 总金额-已经提现的金额
                totalAmt = orderManager.getTotalAmt(userDo);
                //用户可提现余额=总金额-已经提现的额度
                hasRecvTotalAmt = recvManager.getHasReceiveAmt(userDo.getId());
                if("0.0".equals(String.valueOf(hasRecvTotalAmt))){
                    model.addAttribute("canReceAmt",totalAmt);
                }else {
                    model.addAttribute("canReceAmt",new BigDecimal(Double.toString(totalAmt)).subtract(new BigDecimal(Double.toString(hasRecvTotalAmt))).setScale(2,BigDecimal.ROUND_DOWN).doubleValue());
                }
                model.addAttribute("receiveDos",receiveDos);
                model.addAttribute("bindAccount",userDo.getBindAccount());
                return "page/receive";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "page/login";
    }

    /**
     * 提现
     * @return
     */
    @RequestMapping("/app/receive/receive.do")
    public void receive(HttpSession session, HttpServletResponse response,TbMnReceiveDo receiveDo){
        double totalAmt = 0.00;//总金额
        double hasRecvTotalAmt = 0.00;//已领取的金额
        double canRecvTotalAmt = 0.00;//可提现的金额
        try {
            Object accountNo = session.getAttribute("accountNo");
            if(accountNo != null){//用户已经登陆
                //根据当前登陆的账号，绑定的支付宝账号
                TbMnUserDo userDo = userManager.queryUserByAccountNo(String.valueOf(accountNo));
                //获取用户可提现余额 = 总金额-已经提现的金额
                totalAmt = orderManager.getTotalAmt(userDo);
                //用户可提现余额=总金额-已经提现的额度
                hasRecvTotalAmt = recvManager.getHasReceiveAmt(userDo.getId());
                canRecvTotalAmt = new BigDecimal(Double.toString(totalAmt)).subtract(new BigDecimal(Double.toString(hasRecvTotalAmt))).setScale(2,BigDecimal.ROUND_DOWN).doubleValue();

                Double obj1 = new Double(receiveDo.getAmount());
                Double obj2 = new Double(canRecvTotalAmt);

                int retval =  obj1.compareTo(obj2);

                if(retval > 0) {//领取的金额，大于可提现余额！
                    sendMessages(response, JSON.toJSONString("1"));
                    return;
                }
                receiveDo.setAdzoneId(userDo.getId());
                recvManager.insert(receiveDo);
                sendMessages(response, JSON.toJSONString("2"));//成功
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        sendMessages(response, JSON.toJSONString("3"));
    }
}
