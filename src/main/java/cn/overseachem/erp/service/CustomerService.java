package cn.overseachem.erp.service;


import cn.overseachem.erp.mapper.ColorMapper;
import cn.overseachem.erp.mapper.CustomerMapper;
import cn.overseachem.erp.pojo.Color;
import cn.overseachem.erp.pojo.ColorExample;
import cn.overseachem.erp.pojo.Customer;
import cn.overseachem.erp.pojo.CustomerExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Zhihui_Shen on 2018/6/4.
 */
@Component
public class CustomerService {

    @Autowired
    private CustomerMapper mapper;

    public List<Customer> getAll() {
        CustomerExample e = new CustomerExample();
        e.createCriteria();
        return mapper.selectByExample(e);
    }

    public String getNameById(Integer id) {
        Customer c = mapper.selectByPrimaryKey(id);
        if (c != null)
            return c.getAbbreviation();
        return null;
    }

    public Integer getIdByName(String name) {
        CustomerExample e = new CustomerExample();
        e.createCriteria().andAbbreviationEqualTo(name);
        List<Customer> c = mapper.selectByExample(e);
        if (c != null) {
            return c.get(0).getCustomerId();
        }
        return null;
    }

    public Customer getById(Integer customerId) {
        return mapper.selectByPrimaryKey(customerId);
    }
}