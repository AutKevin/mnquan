package cn.mnquan.mapper;

import cn.mnquan.model.TbMnReceiveDo;
import cn.mnquan.model.TbMnReceiveDoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbMnReceiveMapper {
    long countByExample(TbMnReceiveDoExample example);

    int insert(TbMnReceiveDo record);

    int insertSelective(TbMnReceiveDo record);

    List<TbMnReceiveDo> selectByExample(TbMnReceiveDoExample example);

    TbMnReceiveDo selectByPrimaryKey(String account);

    int updateByExampleSelective(@Param("record") TbMnReceiveDo record, @Param("example") TbMnReceiveDoExample example);

    int updateByExample(@Param("record") TbMnReceiveDo record, @Param("example") TbMnReceiveDoExample example);

    int updateByPrimaryKeySelective(TbMnReceiveDo record);

    int updateByPrimaryKey(TbMnReceiveDo record);

    /**
     * 获取用户已经提现的金额
     * @param tbMnReceiveDo
     * @return
     */
    double queryHasReceiceAmt(TbMnReceiveDo tbMnReceiveDo);
}