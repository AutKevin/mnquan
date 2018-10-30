package cn.mnquan.manager;

import cn.mnquan.model.TbMnReceiveDo;

import java.util.List;

/**
 * <p>
 * 描述
 * </p>
 * User: wangkecheng Date: 2018/10/25
 */
public interface IRecvManager {
    List<TbMnReceiveDo> getTbMnReceiveDo(String adzoneId);

    double getHasReceiveAmt(String accountNo);

    void insert(TbMnReceiveDo receiveDo);
}
