package cn.mnquan.manager.impl;

import cn.mnquan.manager.IRecvManager;
import cn.mnquan.mapper.TbMnReceiveMapper;
import cn.mnquan.model.TbMnReceiveDo;
import cn.mnquan.model.TbMnReceiveDoExample;
import cn.mnquan.utils.DateUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * <p>
 * 提现管理
 * </p>
 * User: wangkecheng Date: 2018/10/25
 */
@Service
@Slf4j
public class RecvManagerImpl implements IRecvManager{

    @Autowired
    private TbMnReceiveMapper tbMnReceiveMapper;

    public List<TbMnReceiveDo> getTbMnReceiveDo(String adzoneId) {
        TbMnReceiveDoExample example = new TbMnReceiveDoExample();
        example.createCriteria().andAdzoneIdEqualTo(adzoneId);

        List<TbMnReceiveDo> list = tbMnReceiveMapper.selectByExample(example);
        if(null != list && list.size() >0){
            return list;
        }
        return null;
    }

    /**
     * 获取已经提现的金额
     * @param adzoneId
     * @return
     */
    public double getHasReceiveAmt(String adzoneId) {
        TbMnReceiveDo tbMnReceiveDo = new TbMnReceiveDo();
        tbMnReceiveDo.setAdzoneId(adzoneId);
        return tbMnReceiveMapper.queryHasReceiceAmt(tbMnReceiveDo);
    }

    /**
     * 提现
     * @param receiveDo
     */
    public void insert(TbMnReceiveDo receiveDo) {
        TbMnReceiveDo record = new TbMnReceiveDo();
        record.setAccount(receiveDo.getAccount());
        record.setAdzoneId(receiveDo.getAdzoneId());
        record.setAmount(receiveDo.getAmount());
        record.setCreateTime(DateUtil.getCurrentTimeBySecond());
        record.setState("1");
        tbMnReceiveMapper.insertSelective(record);
    }
}
