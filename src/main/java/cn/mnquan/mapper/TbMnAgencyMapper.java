package cn.mnquan.mapper;

import cn.mnquan.model.TbMnAgencyDo;
import cn.mnquan.model.TbMnAgencyDoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbMnAgencyMapper {
    long countByExample(TbMnAgencyDoExample example);

    int insert(TbMnAgencyDo record);

    int insertSelective(TbMnAgencyDo record);

    List<TbMnAgencyDo> selectByExample(TbMnAgencyDoExample example);

    TbMnAgencyDo selectByPrimaryKey(String agencyAccount);

    int updateByExampleSelective(@Param("record") TbMnAgencyDo record, @Param("example") TbMnAgencyDoExample example);

    int updateByExample(@Param("record") TbMnAgencyDo record, @Param("example") TbMnAgencyDoExample example);

    int updateByPrimaryKeySelective(TbMnAgencyDo record);

    int updateByPrimaryKey(TbMnAgencyDo record);
}