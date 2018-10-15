package cn.mnquan.mapper;

import cn.mnquan.model.TbMnCatItemDo;
import cn.mnquan.model.TbMnCatItemDoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbMnCatItemMapper {
    long countByExample(TbMnCatItemDoExample example);

    int insert(TbMnCatItemDo record);

    int insertSelective(TbMnCatItemDo record);

    List<TbMnCatItemDo> selectByExample(TbMnCatItemDoExample example);

    int updateByExampleSelective(@Param("record") TbMnCatItemDo record, @Param("example") TbMnCatItemDoExample example);

    int updateByExample(@Param("record") TbMnCatItemDo record, @Param("example") TbMnCatItemDoExample example);
}