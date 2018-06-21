package cn.overseachem.erp.mapper;

import cn.overseachem.erp.pojo.Pattern;
import cn.overseachem.erp.pojo.PatternExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface PatternMapper {
    int countByExample(PatternExample example);

    int deleteByExample(PatternExample example);

    int deleteByPrimaryKey(String patternId);

    int insert(Pattern record);

    int insertSelective(Pattern record);

    List<Pattern> selectByExample(PatternExample example);

    Pattern selectByPrimaryKey(String patternId);

    int updateByExampleSelective(@Param("record") Pattern record, @Param("example") PatternExample example);

    int updateByExample(@Param("record") Pattern record, @Param("example") PatternExample example);

    int updateByPrimaryKeySelective(Pattern record);

    int updateByPrimaryKey(Pattern record);
}