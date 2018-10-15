package cn.mnquan.mapper;

import java.util.List;

import cn.mnquan.model.TbMnMaterialOptionalDo;
import cn.mnquan.model.TbMnMaterialOptionalDoExample;
import org.apache.ibatis.annotations.Param;

public interface TbMnMaterialOptionalMapper {
    long countByExample(TbMnMaterialOptionalDoExample example);

    int insert(TbMnMaterialOptionalDo record);

    int insertSelective(TbMnMaterialOptionalDo record);

    List<TbMnMaterialOptionalDo> selectByExample(TbMnMaterialOptionalDoExample example);

    TbMnMaterialOptionalDo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbMnMaterialOptionalDo record, @Param("example") TbMnMaterialOptionalDoExample example);

    int updateByExample(@Param("record") TbMnMaterialOptionalDo record, @Param("example") TbMnMaterialOptionalDoExample example);

    int updateByPrimaryKeySelective(TbMnMaterialOptionalDo record);

    int updateByPrimaryKey(TbMnMaterialOptionalDo record);

    List<TbMnMaterialOptionalDo> getCentreList();
}