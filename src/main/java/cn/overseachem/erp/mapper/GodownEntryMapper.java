package cn.overseachem.erp.mapper;

import cn.overseachem.erp.pojo.GodownEntry;
import cn.overseachem.erp.pojo.GodownEntryExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface GodownEntryMapper {
    int countByExample(GodownEntryExample example);

    int deleteByExample(GodownEntryExample example);

    int deleteByPrimaryKey(String inventoryNum);

    int insert(GodownEntry record);

    int insertSelective(GodownEntry record);

    List<GodownEntry> selectByExample(GodownEntryExample example);

    GodownEntry selectByPrimaryKey(String inventoryNum);

    int updateByExampleSelective(@Param("record") GodownEntry record, @Param("example") GodownEntryExample example);

    int updateByExample(@Param("record") GodownEntry record, @Param("example") GodownEntryExample example);

    int updateByPrimaryKeySelective(GodownEntry record);

    int updateByPrimaryKey(GodownEntry record);
}