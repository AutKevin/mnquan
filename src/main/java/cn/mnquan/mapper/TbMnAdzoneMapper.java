package cn.mnquan.mapper;

import cn.mnquan.model.TbMnAdzoneDo;
import cn.mnquan.model.TbMnAdzoneDoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbMnAdzoneMapper {
    long countByExample(TbMnAdzoneDoExample example);

    int insert(TbMnAdzoneDo record);

    int insertSelective(TbMnAdzoneDo record);

    List<TbMnAdzoneDo> selectByExample(TbMnAdzoneDoExample example);

    TbMnAdzoneDo selectByPrimaryKey(String adzoneId);

    int updateByExampleSelective(@Param("record") TbMnAdzoneDo record, @Param("example") TbMnAdzoneDoExample example);

    int updateByExample(@Param("record") TbMnAdzoneDo record, @Param("example") TbMnAdzoneDoExample example);

    int updateByPrimaryKeySelective(TbMnAdzoneDo record);

    int updateByPrimaryKey(TbMnAdzoneDo record);
}