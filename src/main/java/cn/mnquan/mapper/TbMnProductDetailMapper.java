package cn.mnquan.mapper;

import java.util.List;

import cn.mnquan.model.TbMnProductDetailDo;
import cn.mnquan.model.TbMnProductDetailDoExample;
import org.apache.ibatis.annotations.Param;

public interface TbMnProductDetailMapper {
    long countByExample(TbMnProductDetailDoExample example);

    int insert(TbMnProductDetailDo record);

    int insertSelective(TbMnProductDetailDo record);

    List<TbMnProductDetailDo> selectByExample(TbMnProductDetailDoExample example);

    TbMnProductDetailDo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbMnProductDetailDo record, @Param("example") TbMnProductDetailDoExample example);

    int updateByExample(@Param("record") TbMnProductDetailDo record, @Param("example") TbMnProductDetailDoExample example);

    int updateByPrimaryKeySelective(TbMnProductDetailDo record);

    int updateByPrimaryKey(TbMnProductDetailDo record);
}