package cn.overseachem.erp.controller;

import cn.overseachem.erp.service.ContractService;
import cn.overseachem.erp.utils.AjaxReturn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Zhihui_Shen on 2018/6/4.
 */
@Controller
@RequestMapping("/universal/contract")
public class ContractController {

    @Autowired
    private ContractService service;

    @RequestMapping("/insert_contract")
    @ResponseBody
    public AjaxReturn insertContract(HttpServletRequest request) {
        String file = request.getParameter("contractFile");
        String id = request.getParameter("contractId");
        String purchaseNum = request.getParameter("purchaseNum");
        System.out.println("contract file is " + file);
        if(file == null){
            service.insertContractWithoutFile(id,purchaseNum);
        }else{
            service.insertContract(id,purchaseNum,file);
        }
        return new AjaxReturn(true, "添加合同成功");
    }


}
