package cn.overseachem.erp.mapper;

import cn.overseachem.erp.pojo.ProductOrder;
import cn.overseachem.erp.pojo.ProductOrderExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ProductOrderMapper {
    int countByExample(ProductOrderExample example);

    int deleteByExample(ProductOrderExample example);

    int deleteByPrimaryKey(String productNum);

    int insert(ProductOrder record);

    int insertSelective(ProductOrder record);

    List<ProductOrder> selectByExample(ProductOrderExample example);

    ProductOrder selectByPrimaryKey(String productNum);

    int updateByExampleSelective(@Param("record") ProductOrder record, @Param("example") ProductOrderExample example);

    int updateByExample(@Param("record") ProductOrder record, @Param("example") ProductOrderExample example);

    int updateByPrimaryKeySelective(ProductOrder record);

    int updateByPrimaryKey(ProductOrder record);

    Integer getTotalAmountByProductNum(String productNum);

    Integer getCompletedAmountByProductNum(String productNum);

    String getColorIdByProductNum(String productNum);

    String getPatternIdByProductNum(String productNum);
}