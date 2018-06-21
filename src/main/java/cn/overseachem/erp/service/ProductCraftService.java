package cn.overseachem.erp.service;


import cn.overseachem.erp.mapper.PatternMapper;
import cn.overseachem.erp.mapper.ProductCraftMapper;
import cn.overseachem.erp.pojo.Pattern;
import cn.overseachem.erp.pojo.PatternExample;
import cn.overseachem.erp.pojo.ProductCraft;
import cn.overseachem.erp.pojo.ProductCraftExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Zhihui_Shen on 2018/6/4.
 */
@Component
public class ProductCraftService {
    //
    @Autowired
    private ProductCraftMapper mapper;

    public ProductCraft getByColorId(String colorId) {
        return mapper.selectByPrimaryKey(colorId);
    }

}