package cn.overseachem.erp.controller;

import cn.overseachem.erp.pojo.Color;
import cn.overseachem.erp.service.ColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Zhihui_Shen on 2018/6/4.
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/2tst")
    public String testPage() {
        return "/test";
    }
}
