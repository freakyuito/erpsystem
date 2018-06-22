package cn.overseachem.erp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Zhihui_Shen on 2018/6/22.
 */

@Controller
@RequestMapping("/product/packing_form")
public class PackingFormController {

    @RequestMapping("/2dtl")
    public String detailPage(){
        return "/product/plate/packing_form/dtl";
    }

}
