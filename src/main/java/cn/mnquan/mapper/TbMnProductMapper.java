package cn.mnquan.mapper;

import cn.mnquan.model.TbMnProductDo;
import java.util.List;

import cn.mnquan.model.TbMnProductDoExample;
import org.apache.ibatis.annotations.Param;

public interface TbMnProductMapper {
    long countByExample(TbMnProductDoExample example);

    int insert(TbMnProductDo record);

    int insertSelective(TbMnProductDo record);

    List<TbMnProductDo> selectByExample(TbMnProductDoExample example);

    TbMnProductDo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbMnProductDo record, @Param("example") TbMnProductDoExample example);

    int updateByExample(@Param("record") TbMnProductDo record, @Param("example") TbMnProductDoExample example);

    int updateByPrimaryKeySelective(TbMnProductDo record);

    int updateByPrimaryKey(TbMnProductDo record);
}