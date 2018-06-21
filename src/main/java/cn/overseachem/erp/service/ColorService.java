package cn.overseachem.erp.service;


import cn.overseachem.erp.mapper.ColorMapper;
import cn.overseachem.erp.pojo.Color;
import cn.overseachem.erp.pojo.ColorExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Zhihui_Shen on 2018/6/4.
 */
@Component
public class ColorService {

    @Autowired
    private ColorMapper mapper;

    public List<Color> getAll() {
        ColorExample e = new ColorExample();
        e.createCriteria();
        return mapper.selectByExample(e);
    }

    public String getNameById(String id) {
        Color c = mapper.selectByPrimaryKey(id);
        if (c != null)
            return c.getColorName();
        return null;
    }
}