package cn.overseachem.erp.mapper;

import cn.overseachem.erp.pojo.Machine;
import cn.overseachem.erp.pojo.MachineExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MachineMapper {
    int countByExample(MachineExample example);

    int deleteByExample(MachineExample example);

    int deleteByPrimaryKey(Integer machineId);

    int insert(Machine record);

    int insertSelective(Machine record);

    List<Machine> selectByExampleWithBLOBs(MachineExample example);

    List<Machine> selectByExample(MachineExample example);

    Machine selectByPrimaryKey(Integer machineId);

    int updateByExampleSelective(@Param("record") Machine record, @Param("example") MachineExample example);

    int updateByExampleWithBLOBs(@Param("record") Machine record, @Param("example") MachineExample example);

    int updateByExample(@Param("record") Machine record, @Param("example") MachineExample example);

    int updateByPrimaryKeySelective(Machine record);

    int updateByPrimaryKeyWithBLOBs(Machine record);

    int updateByPrimaryKey(Machine record);
}