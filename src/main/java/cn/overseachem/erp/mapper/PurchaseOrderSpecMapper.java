package cn.overseachem.erp.mapper;

import cn.overseachem.erp.pojo.PurchaseOrderSpec;
import cn.overseachem.erp.pojo.PurchaseOrderSpecExample;
import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface PurchaseOrderSpecMapper {
    int countByExample(PurchaseOrderSpecExample example);

    int deleteByExample(PurchaseOrderSpecExample example);

    int deleteByPrimaryKey(Integer specId);

    int insert(PurchaseOrderSpec record);

    int insertSelective(PurchaseOrderSpec record);

    List<PurchaseOrderSpec> selectByExample(PurchaseOrderSpecExample example);

    PurchaseOrderSpec selectByPrimaryKey(Integer specId);

    int updateByExampleSelective(@Param("record") PurchaseOrderSpec record, @Param("example") PurchaseOrderSpecExample example);

    int updateByExample(@Param("record") PurchaseOrderSpec record, @Param("example") PurchaseOrderSpecExample example);

    int updateByPrimaryKeySelective(PurchaseOrderSpec record);

    int updateByPrimaryKey(PurchaseOrderSpec record);

    List<PurchaseOrderSpec> groupByColorIdWithPurchaseNum(String purchaseNum);

    List<PurchaseOrderSpec> selectSpecsByPurchaseNumAndColorId(@Param("purchaseNum") String purchaseNum,@Param("colorId") String colorId);
}