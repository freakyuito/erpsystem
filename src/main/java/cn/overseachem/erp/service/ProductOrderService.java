package cn.overseachem.erp.service;


import cn.overseachem.erp.mapper.*;
import cn.overseachem.erp.pojo.*;
import cn.overseachem.erp.utils.AjaxReturn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by Zhihui_Shen on 2018/6/4.
 */
@Component
public class ProductOrderService {

    @Autowired
    private ProductOrderMapper orderMapper;
    @Autowired
    private ProductOrderSpecMapper specMapper;
    @Autowired
    private PurchaseOrderSpecMapper purchaseOrderSpecMapper;
    @Autowired
    private PurchaseOrderMapper purchaseOrderMapper;

    public List<ProductOrder> getByCriteria(String purchaseNum, String productNum, String scheduleTime) throws ParseException {
        ProductOrderExample e = new ProductOrderExample();
        if (purchaseNum == null) {
            if (productNum == null) {
                if (scheduleTime == null) {
                    e.createCriteria();
                } else {
                    e.createCriteria().andScheduleBeginTimeEqualTo(new SimpleDateFormat("yyyy-MM-dd").parse(scheduleTime));
                }
            } else {
                if (scheduleTime == null) {
                    e.createCriteria().andProductNumLike("%" + productNum + "%");
                } else {
                    e.createCriteria().andScheduleBeginTimeEqualTo(new SimpleDateFormat("yyyy-MM-dd").parse(scheduleTime))
                            .andProductNumLike("%" + productNum + "%");
                }
            }
        } else {
            if (productNum == null) {
                if (scheduleTime == null) {
                    e.createCriteria().andFkPurchaseNumLike("%" + purchaseNum + "%");
                } else {
                    e.createCriteria().andFkPurchaseNumLike("%" + purchaseNum + "%").andScheduleBeginTimeEqualTo(new SimpleDateFormat("yyyy-MM-dd").parse(scheduleTime));
                }
            } else {
                if (scheduleTime == null) {
                    e.createCriteria().andFkPurchaseNumLike("%" + purchaseNum + "%").andProductNumLike("%" + productNum + "%");
                } else {
                    e.createCriteria().andFkPurchaseNumLike("%" + purchaseNum + "%").andProductNumLike("%" + productNum + "%").andScheduleBeginTimeEqualTo(new SimpleDateFormat("yyyy-MM-dd").parse(scheduleTime));
                }
            }
        }
        return orderMapper.selectByExample(e);
    }

    public void insertOrder(ProductOrder target) {
        orderMapper.insert(target);
    }

    public String generateProductNum(String purchaseNum, String colorCode) {
        return purchaseNum + "#" + colorCode;
    }

    public void insertSpec(ProductOrderSpec target) {
        specMapper.insert(target);
    }

    public Integer getTotalAmount(String productNum) {
        return orderMapper.getTotalAmountByProductNum(productNum);
    }

    public Integer getCompletedAmount(String productNum) {
        return orderMapper.getCompletedAmountByProductNum(productNum);
    }

    public String getColorId(String productNum) {
        return orderMapper.getColorIdByProductNum(productNum);
    }

    public String getPatternId(String productNum) {
        return orderMapper.getPatternIdByProductNum(productNum);
    }

    public ProductOrder getOrderByNum(String productNum) {
        return orderMapper.selectByPrimaryKey(productNum);
    }

    public List<ProductOrderSpec> getSpecsByNum(String productNum) {
        ProductOrderSpecExample e = new ProductOrderSpecExample();
        e.createCriteria().andFkProductNumEqualTo(productNum);
        return specMapper.selectByExample(e);
    }

    public Boolean isChecked(String productNum) {
        ProductOrderExample e = new ProductOrderExample();
        e.createCriteria().andApproverIdIsNotNull().andReceiverIdIsNotNull().andProductNumEqualTo(productNum);
        List<ProductOrder> orderList = orderMapper.selectByExample(e);
        if (orderList != null && orderList.size() > 0)
            return true;
        else
            return false;
    }

    public Boolean isBegin(String productNum) {
        ProductOrderSpecExample e = new ProductOrderSpecExample();
        e.createCriteria().andFkProductNumEqualTo(productNum).andStateCodeGreaterThan(-1);
        if (specMapper.countByExample(e) > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void setStateCode(Integer stateCode, String batchNum) {
        System.out.println("set_state_code_batchnum=" + batchNum);
        ProductOrderSpec spec = specMapper.selectByPrimaryKey(batchNum);
        spec.setStateCode(stateCode);
        specMapper.updateByPrimaryKey(spec);
    }

    public void sign(Integer approverId, Integer receiverId, Integer machineNum, String productNum) {
        System.out.println(approverId);
        ProductOrder o = orderMapper.selectByPrimaryKey(productNum);
        o.setApproverId(approverId);
        o.setReceiverId(receiverId);
        o.setMachineNum(machineNum);
        o.setProductNum(productNum);
        orderMapper.updateByPrimaryKey(o);
    }

    public Integer getPurchaseSpecRequiredAmountByBatchNum(String batchNum) {
        return specMapper.selectByPrimaryKey(batchNum).getFkPurchaseSpecId();
    }

    public String getPurchaseNumByBatchNum(String batchNum) {
        String productNum = specMapper.selectByPrimaryKey(batchNum).getFkProductNum();
        return orderMapper.selectByPrimaryKey(productNum).getFkPurchaseNum();
    }

    public String getColorIdByBatchNum(String batchNum) {
        Integer specId = specMapper.selectByPrimaryKey(batchNum).getFkPurchaseSpecId();
        return purchaseOrderSpecMapper.selectByPrimaryKey(specId).getColorId();
    }

    public Integer getPurchaseSpecIdByBatchNum(String batchNum) {
        return specMapper.selectByPrimaryKey(batchNum).getFkPurchaseSpecId();
    }

    public Integer getMachineIdByBatchNum(String batchNum) {
        return orderMapper.selectByPrimaryKey(specMapper.selectByPrimaryKey(batchNum).getFkProductNum()).getMachineNum();
    }

    public void setCompletedAmount(String batchNum, Integer value) {
        ProductOrderSpec s = specMapper.selectByPrimaryKey(batchNum);
        s.setCompletedAmount(value);
        specMapper.updateByPrimaryKey(s);
    }

    public List<ProductOrderSpec> getSpecsByPurchaseNum(String purchaseNum) {
        ArrayList<ProductOrderSpec> arrayList = new ArrayList<ProductOrderSpec>();
        ProductOrderExample productOrderExample = new ProductOrderExample();
        productOrderExample.createCriteria().andFkPurchaseNumEqualTo(purchaseNum);
        List<ProductOrder> productOrders = orderMapper.selectByExample(productOrderExample);
        for (ProductOrder o : productOrders
                ) {
            ProductOrderSpecExample e = new ProductOrderSpecExample();
            e.createCriteria().andFkProductNumEqualTo(o.getProductNum());
            List<ProductOrderSpec> specs = specMapper.selectByExample(e);
            for (ProductOrderSpec s : specs
                    ) {
                arrayList.add(s);
            }
        }
        return arrayList;
    }

    public ProductOrderSpec getProductOrderSpecByBatchNum(String batchNum) {
        return specMapper.selectByPrimaryKey(batchNum);
    }

    public PurchaseOrderSpec getPurchaseOrderSpecByBatchNum(String batchNum) {
        return purchaseOrderSpecMapper.selectByPrimaryKey(getProductOrderSpecByBatchNum(batchNum).getFkPurchaseSpecId());
    }

    public ProductOrder getProductOrderByBatchNum(String batchNum) {
        return orderMapper.selectByPrimaryKey(specMapper.selectByPrimaryKey(batchNum).getFkProductNum());
    }

    public void setScheduleBeginTime(String productNum, Date time) {
        ProductOrder o = orderMapper.selectByPrimaryKey(productNum);
        o.setScheduleBeginTime(time);
        orderMapper.updateByPrimaryKey(o);
    }

    public void setScheduleFinishTime(String productNum, Date time) {
        ProductOrder o = orderMapper.selectByPrimaryKey(productNum);
        o.setScheduleFinishTime(time);
        orderMapper.updateByPrimaryKey(o);
    }

    public ProductOrderSpec getProductSpecByPurchaseOrderSpecId(Integer id) {
        ProductOrderSpecExample e = new ProductOrderSpecExample();
        e.createCriteria().andFkPurchaseSpecIdEqualTo(id);
        List<ProductOrderSpec> specs = specMapper.selectByExample(e);
        if (specs != null && specs.size() > 0)
            return specs.get(0);
        return null;
    }

    public Boolean getValidityByProductNum(String productNum) {
        return purchaseOrderMapper.selectByPrimaryKey(orderMapper.selectByPrimaryKey(productNum).getFkPurchaseNum()).getValidityCode();
    }

}