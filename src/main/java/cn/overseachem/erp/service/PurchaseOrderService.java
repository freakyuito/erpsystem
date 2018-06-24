package cn.overseachem.erp.service;


import cn.overseachem.erp.mapper.CustomerMapper;
import cn.overseachem.erp.mapper.ProductOrderSpecMapper;
import cn.overseachem.erp.mapper.PurchaseOrderMapper;
import cn.overseachem.erp.mapper.PurchaseOrderSpecMapper;
import cn.overseachem.erp.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Zhihui_Shen on 2018/6/4.
 */
@Component
public class PurchaseOrderService {

    @Autowired
    private PurchaseOrderMapper orderMapper;
    @Autowired
    private PurchaseOrderSpecMapper specMapper;
    @Autowired
    private CustomerMapper customerMapper;
    @Autowired
    private ProductOrderSpecMapper productOrderSpecMapper;

    public List<PurchaseOrderListGrid> getByCriteria(Integer customerId, String purchaseNum, String purchaseTimeBegin, String purchaseTimeEnd) throws ParseException {
        System.out.println(customerId);
        System.out.println(purchaseNum);
        System.out.println(purchaseTimeBegin);
        PurchaseOrderExample e = new PurchaseOrderExample();
        if (customerId == null) {
            if (purchaseNum == null) {
                if (purchaseTimeBegin == null) {
                    e.createCriteria();
                } else {
                    e.createCriteria().andPurchaseTimeEqualTo(new SimpleDateFormat("yyyy-MM-dd").parse(purchaseTimeBegin));
                }
            } else {
                if (purchaseTimeBegin == null) {
                    e.createCriteria().andPurchaseNumLike("%" + purchaseNum + "%");
                }
                e.createCriteria().andPurchaseTimeEqualTo(new SimpleDateFormat("yyyy-MM-dd").parse(purchaseTimeBegin))
                        .andPurchaseNumEqualTo(purchaseNum);
            }
        } else {
            if (purchaseNum == null) {
                if (purchaseTimeBegin == null) {
                    e.createCriteria().andCustomerIdEqualTo(customerId);
                } else {
                    e.createCriteria().andCustomerIdEqualTo(customerId).andPurchaseTimeEqualTo(new SimpleDateFormat("yyyy-MM-dd").parse(purchaseTimeBegin));
                }
            } else {
                if (purchaseTimeBegin == null) {
                    e.createCriteria().andCustomerIdEqualTo(customerId).andPurchaseNumLike("%" + purchaseNum + "%");
                } else {
                    e.createCriteria().andCustomerIdEqualTo(customerId).andPurchaseNumLike("%" + purchaseNum + "%").andPurchaseTimeEqualTo(new SimpleDateFormat("yyyy-MM-dd").parse(purchaseTimeBegin));
                }
            }
        }

        List<PurchaseOrder> orderList = orderMapper.selectByExample(e);
        System.out.println(orderList.size());
        return generateGrid(orderList);
    }

    public List<PurchaseOrderListGrid> getUncheckedOrders() {
        PurchaseOrderExample e = new PurchaseOrderExample();
        e.or(e.createCriteria().andSupervisorIdIsNull());
        e.or(e.createCriteria().andSalesmanIdIsNull());
        e.or(e.createCriteria().andProducerIdIsNull());
        List<PurchaseOrder> orderList = orderMapper.selectByExample(e);
        return generateGrid(orderList);
    }

    public List<PurchaseOrderListGrid> getInvalidOrders() {
        PurchaseOrderExample e = new PurchaseOrderExample();
        e.or(e.createCriteria().andValidityCodeEqualTo(false));
        List<PurchaseOrder> orderList = orderMapper.selectByExample(e);
        return generateGrid(orderList);
    }

    List<PurchaseOrderListGrid> generateGrid(List<PurchaseOrder> orderList) {
        ArrayList<PurchaseOrderListGrid> gridArrayList = new ArrayList<PurchaseOrderListGrid>();
        for (PurchaseOrder s : orderList
                ) {
            Customer c = customerMapper.selectByPrimaryKey(s.getCustomerId());

            if (s.getMakerId() != null && s.getProducerId() != null && s.getSalesmanId() != null && s.getSupervisorId() != null) {
//                HashMap<String, Object> process = orderMapper.getProductProcessByNumber(s.getPurchaseNum());
                gridArrayList.add(new PurchaseOrderListGrid(c.getAbbreviation().toString(), s.getPurchaseNum(),
                        0, 0, new SimpleDateFormat("yyyy-MM-dd").format(s.getPurchaseTime()),
                        new SimpleDateFormat("yyyy-MM-dd").format(s.getDeliverTime()), s.getRemark()));
            } else {
                gridArrayList.add(new PurchaseOrderListGrid(c.getAbbreviation().toString(), s.getPurchaseNum(),
                        0, 0, new SimpleDateFormat("yyyy-MM-dd").format(s.getPurchaseTime()),
                        new SimpleDateFormat("yyyy-MM-dd").format(s.getDeliverTime()), s.getRemark()));
            }
        }
        return gridArrayList;
    }

    public String generateBatchNum() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        //获取当前月第一天：
        Calendar c = Calendar.getInstance();
        c.add(Calendar.MONTH, 0);
        c.set(Calendar.DAY_OF_MONTH, 1);//设置为1号,当前日期既为本月第一天
        String first = format.format(c.getTime());

        //获取当前月最后一天
        Calendar ca = Calendar.getInstance();
        ca.set(Calendar.DAY_OF_MONTH, ca.getActualMaximum(Calendar.DAY_OF_MONTH));
        String last = format.format(ca.getTime());

        Integer count = productOrderSpecMapper.countInMonth(first, last);

        DecimalFormat df=new DecimalFormat("000");
        String str =df.format(count);

        String batchNum = first.substring(2, 4) + first.substring(5, 7) + str;
        return batchNum;
    }

    public void insertOrder(PurchaseOrder order, List<PurchaseOrderSpec> specs) {
        for (PurchaseOrderSpec s : specs
                ) {
            specMapper.insert(s);
        }
        orderMapper.insert(order);
    }

    public PurchaseOrder getOrderByPurchaseNum(String num) {
        return orderMapper.selectByPrimaryKey(num);
    }

    public List<PurchaseOrderSpec> getSpecsByPurchaseNum(String num) {
        PurchaseOrderSpecExample e = new PurchaseOrderSpecExample();
        e.createCriteria().andFkPurchaseNumEqualTo(num);
        return specMapper.selectByExample(e);
    }

    public Boolean checkOrderExistence(String num) {
        PurchaseOrder order = orderMapper.selectByPrimaryKey(num);
        System.out.println("order" + num + "is" + order);
        if (order == null) return true;
        else return false;
    }

    public void obsolateOrder(String purchaseNum) {
        PurchaseOrder order = orderMapper.selectByPrimaryKey(purchaseNum);
        order.setValidityCode(false);
        orderMapper.updateByPrimaryKey(order);
    }

    public void sign(Integer userId, String userAuth, String purchaseNum) {
        PurchaseOrder order = orderMapper.selectByPrimaryKey(purchaseNum);
        if (userAuth.contains("BZ"))
            order.setSupervisorId(userId);
        if (userAuth.contains("BXZ"))
            order.setSalesmanId(userId);
        if (userAuth.contains("BSZ"))
            order.setProducerId(userId);
        if (userAuth.contains("BX"))
            order.setMakerId(userId);
        System.out.println(userAuth);
        orderMapper.updateByPrimaryKey(order);
    }

    public boolean checkAudition(String purchaseNum) {
        PurchaseOrderExample e = new PurchaseOrderExample();
        e.createCriteria().andSupervisorIdIsNotNull().andSalesmanIdIsNotNull().andProducerIdIsNotNull().andMakerIdIsNotNull().andPurchaseNumEqualTo(purchaseNum);
        List<PurchaseOrder> purchaseOrderList = orderMapper.selectByExample(e);
        if (purchaseOrderList.size() > 0) {
            return true;
        }
        return false;
    }

    public List<PurchaseOrderSpec> groupByColorId(String purchaseNum) {
        return specMapper.groupByColorIdWithPurchaseNum(purchaseNum);
    }

    public List<PurchaseOrderSpec> getByPurchaseNumAndColorId(String purchaseNum, String colorId) {
        return specMapper.selectSpecsByPurchaseNumAndColorId(purchaseNum, colorId);
    }

    public PurchaseOrderSpec getById(Integer id){
        return specMapper.selectByPrimaryKey(id);
    }

}