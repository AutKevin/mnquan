package cn.mnquan.mapper;

import java.util.List;

import cn.mnquan.model.TbMnCatDo;
import cn.mnquan.model.TbMnCatDoExample;
import org.apache.ibatis.annotations.Param;

public interface TbMnCatMapper {
    long countByExample(TbMnCatDoExample example);

    int insert(TbMnCatDo record);

    int insertSelective(TbMnCatDo record);

    List<TbMnCatDo> selectByExample(TbMnCatDoExample example);

    TbMnCatDo selectByPrimaryKey(String catId);

    int updateByExampleSelective(@Param("record") TbMnCatDo record, @Param("example") TbMnCatDoExample example);

    int updateByExample(@Param("record") TbMnCatDo record, @Param("example") TbMnCatDoExample example);

    int updateByPrimaryKeySelective(TbMnCatDo record);

    int updateByPrimaryKey(TbMnCatDo record);
}