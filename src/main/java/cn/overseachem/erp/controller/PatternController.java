package cn.overseachem.erp.controller;

import cn.overseachem.erp.pojo.Pattern;
import cn.overseachem.erp.service.PatternService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Zhihui_Shen on 2018/6/4.
 */
@Controller
@RequestMapping("/universal/pattern")
public class PatternController {

    @Autowired
    private PatternService service;

    @RequestMapping("/get_all")
    @ResponseBody
    public List<Pattern> getAll() {
        return service.getAll();
    }
}
