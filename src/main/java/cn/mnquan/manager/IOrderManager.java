package cn.mnquan.manager;

import cn.mnquan.model.TbMnOrderDo;
import cn.mnquan.model.TbMnUserDo;
import com.taobao.api.ApiException;

import java.util.List;

/**
 * <p>
 * 订单管理
 * </p>
 * User: wangkecheng Date: 2018/10/19
 */
public interface IOrderManager {
    void queryOrderByTask() throws ApiException;

    List<TbMnOrderDo> queryOrderByStatus(TbMnOrderDo tbMnOrderDo,List<String> adzoneIds);

    double getownAmt(TbMnUserDo tbMnUserDo);

    double getTeadAmt(List<TbMnUserDo> userDos);

    double getdaiOwnAmt(TbMnUserDo tbMnUserDo);

    double getDaiTeadAmt(List<TbMnUserDo> userDos);

    double getTotalAmt(TbMnUserDo tbMnUserDo);

    double getDaiTotalAmt(TbMnUserDo tbMnUserDo);
}
