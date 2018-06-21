package cn.overseachem.erp.service;


import cn.overseachem.erp.mapper.PatternMapper;
import cn.overseachem.erp.pojo.Pattern;
import cn.overseachem.erp.pojo.PatternExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Zhihui_Shen on 2018/6/4.
 */
@Component
public class PatternService {
    //
    @Autowired
    private PatternMapper mapper;

    public List<Pattern> getAll() {
        PatternExample e = new PatternExample();
        e.createCriteria();
        return mapper.selectByExample(e);
    }

    public String getNameById(String id) {
        Pattern p = mapper.selectByPrimaryKey(id);
        if (p != null)
            return p.getPatternName();
        return null;
    }
}