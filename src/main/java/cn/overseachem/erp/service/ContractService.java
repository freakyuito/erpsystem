package cn.overseachem.erp.service;


import cn.overseachem.erp.mapper.ContractMapper;
import cn.overseachem.erp.pojo.Contract;
import cn.overseachem.erp.pojo.ContractExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Zhihui_Shen on 2018/6/4.
 */
@Component
public class ContractService {

    @Autowired
    private ContractMapper mapper;

    public void insertContractWithoutFile(String id, String purchaseNum) {
        Contract c = new Contract();
        c.setContractId(id);
        c.setFkPurchaseNum(purchaseNum);
        mapper.insert(c);
    }

    public void insertContract(String id, String purchaseNum,String file) {
        Contract c = new Contract();
        c.setContractId(id);
        c.setFkPurchaseNum(purchaseNum);
        c.setContractFile(file.getBytes());
        mapper.insert(c);
    }

    public List<Contract> getByPurchaseNum(String num){
        ContractExample e = new ContractExample();
        e.createCriteria().andFkPurchaseNumEqualTo(num);
        return mapper.selectByExample(e);
    }
}