package cn.overseachem.erp.mapper;

import cn.overseachem.erp.pojo.ProductCraft;
import cn.overseachem.erp.pojo.ProductCraftExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ProductCraftMapper {
    int countByExample(ProductCraftExample example);

    int deleteByExample(ProductCraftExample example);

    int deleteByPrimaryKey(String colorId);

    int insert(ProductCraft record);

    int insertSelective(ProductCraft record);

    List<ProductCraft> selectByExample(ProductCraftExample example);

    ProductCraft selectByPrimaryKey(String colorId);

    int updateByExampleSelective(@Param("record") ProductCraft record, @Param("example") ProductCraftExample example);

    int updateByExample(@Param("record") ProductCraft record, @Param("example") ProductCraftExample example);

    int updateByPrimaryKeySelective(ProductCraft record);

    int updateByPrimaryKey(ProductCraft record);
}