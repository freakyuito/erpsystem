package cn.overseachem.erp.mapper;

import cn.overseachem.erp.pojo.PackingForm;
import cn.overseachem.erp.pojo.PackingFormExample;
import cn.overseachem.erp.pojo.PackingFormWithBLOBs;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface PackingFormMapper {
    int countByExample(PackingFormExample example);

    int deleteByExample(PackingFormExample example);

    int deleteByPrimaryKey(String packingNum);

    int insert(PackingFormWithBLOBs record);

    int insertSelective(PackingFormWithBLOBs record);

    List<PackingFormWithBLOBs> selectByExampleWithBLOBs(PackingFormExample example);

    List<PackingForm> selectByExample(PackingFormExample example);

    PackingFormWithBLOBs selectByPrimaryKey(String packingNum);

    int updateByExampleSelective(@Param("record") PackingFormWithBLOBs record, @Param("example") PackingFormExample example);

    int updateByExampleWithBLOBs(@Param("record") PackingFormWithBLOBs record, @Param("example") PackingFormExample example);

    int updateByExample(@Param("record") PackingForm record, @Param("example") PackingFormExample example);

    int updateByPrimaryKeySelective(PackingFormWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(PackingFormWithBLOBs record);

    int updateByPrimaryKey(PackingForm record);
}