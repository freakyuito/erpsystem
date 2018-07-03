package cn.overseachem.erp.mapper;

import cn.overseachem.erp.pojo.GodownEntrySpec;
import cn.overseachem.erp.pojo.GodownEntrySpecExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface GodownEntrySpecMapper {
    int countByExample(GodownEntrySpecExample example);

    int deleteByExample(GodownEntrySpecExample example);

    int deleteByPrimaryKey(Integer specId);

    int insert(GodownEntrySpec record);

    int insertSelective(GodownEntrySpec record);

    List<GodownEntrySpec> selectByExample(GodownEntrySpecExample example);

    GodownEntrySpec selectByPrimaryKey(Integer specId);

    int updateByExampleSelective(@Param("record") GodownEntrySpec record, @Param("example") GodownEntrySpecExample example);

    int updateByExample(@Param("record") GodownEntrySpec record, @Param("example") GodownEntrySpecExample example);

    int updateByPrimaryKeySelective(GodownEntrySpec record);

    int updateByPrimaryKey(GodownEntrySpec record);
}