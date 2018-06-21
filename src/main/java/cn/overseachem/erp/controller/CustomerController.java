package cn.overseachem.erp.controller;

import cn.overseachem.erp.pojo.Color;
import cn.overseachem.erp.pojo.Customer;
import cn.overseachem.erp.service.ColorService;
import cn.overseachem.erp.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zhihui_Shen on 2018/6/4.
 */
@Controller
@RequestMapping("/universal/customer")
public class CustomerController {

    @Autowired
    private CustomerService service;

    @RequestMapping("/get_all")
    @ResponseBody
    public List<String> getAll() {
        List<Customer> customerList = service.getAll();
        ArrayList<String> nameList = new ArrayList<String>();
        for (Customer c:customerList
             ) {
            nameList.add(c.getAbbreviation());
        }
        return nameList;
    }
}
