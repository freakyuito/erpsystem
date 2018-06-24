package cn.overseachem.erp.mapper;

import cn.overseachem.erp.pojo.ProductOrderSpec;
import cn.overseachem.erp.pojo.ProductOrderSpecExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ProductOrderSpecMapper {
    int countByExample(ProductOrderSpecExample example);

    int deleteByExample(ProductOrderSpecExample example);

    int deleteByPrimaryKey(String batchNum);

    int insert(ProductOrderSpec record);

    int insertSelective(ProductOrderSpec record);

    List<ProductOrderSpec> selectByExample(ProductOrderSpecExample example);

    ProductOrderSpec selectByPrimaryKey(String batchNum);

    int updateByExampleSelective(@Param("record") ProductOrderSpec record, @Param("example") ProductOrderSpecExample example);

    int updateByExample(@Param("record") ProductOrderSpec record, @Param("example") ProductOrderSpecExample example);

    int updateByPrimaryKeySelective(ProductOrderSpec record);

    int updateByPrimaryKey(ProductOrderSpec record);

    Integer countInMonth(@Param("monthBegin") String monthBegin, @Param("monthEnd") String monthEnd);
}