package cn.overseachem.erp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Zhihui_Shen on 2018/6/29.
 */
@Controller
@RequestMapping("/product/godown_entry")
public class GodownEntryController {
    @RequestMapping("/2lst")
    public String listPage() {
        return "/product/plate/inventory/lst";
    }

    @RequestMapping("2dtl")
    public String detailPage(String inventoryNum){
        return "/product/plate/inventory/dtl";
    }
}
