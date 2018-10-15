package cn.mnquan.mapper;

import cn.mnquan.model.TbMnUserDo;
import cn.mnquan.model.TbMnUserDoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbMnUserMapper {
    long countByExample(TbMnUserDoExample example);

    int insert(TbMnUserDo record);

    int insertSelective(TbMnUserDo record);

    List<TbMnUserDo> selectByExample(TbMnUserDoExample example);

    TbMnUserDo selectByPrimaryKey(String account);

    int updateByExampleSelective(@Param("record") TbMnUserDo record, @Param("example") TbMnUserDoExample example);

    int updateByExample(@Param("record") TbMnUserDo record, @Param("example") TbMnUserDoExample example);

    int updateByPrimaryKeySelective(TbMnUserDo record);

    int updateByPrimaryKey(TbMnUserDo record);
}