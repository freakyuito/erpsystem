package cn.overseachem.erp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Zhihui_Shen on 2018/6/4.
 */
@Controller
@RequestMapping("/all/index")
public class IndexController {

    @RequestMapping("/2index")
    public String homePage() {
        return "/index";
    }
}
