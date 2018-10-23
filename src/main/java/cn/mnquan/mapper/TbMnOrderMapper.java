package cn.mnquan.mapper;

import cn.mnquan.model.TbMnOrderDo;
import cn.mnquan.model.TbMnOrderDoExample;
import cn.mnquan.model.TbMnUserDo;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

public interface TbMnOrderMapper {
    long countByExample(TbMnOrderDoExample example);

    int insert(TbMnOrderDo record);

    int insertSelective(TbMnOrderDo record);

    List<TbMnOrderDo> selectByExample(TbMnOrderDoExample example);

    TbMnOrderDo selectByPrimaryKey(BigDecimal tradeId);

    int updateByExampleSelective(@Param("record") TbMnOrderDo record, @Param("example") TbMnOrderDoExample example);

    int updateByExample(@Param("record") TbMnOrderDo record, @Param("example") TbMnOrderDoExample example);

    int updateByPrimaryKeySelective(TbMnOrderDo record);

    int updateByPrimaryKey(TbMnOrderDo record);

    double selectOwmAmt(TbMnUserDo tbMnUserDo);

    double selectTeamAmt(List<TbMnUserDo> userDos);

    double selectDaiOwmAmt(TbMnUserDo tbMnUserDo);

    double selectDaiTeamAmt(List<TbMnUserDo> userDos);
}