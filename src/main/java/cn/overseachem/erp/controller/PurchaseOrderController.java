package cn.overseachem.erp.controller;

import cn.overseachem.erp.pojo.*;
import cn.overseachem.erp.service.*;
import cn.overseachem.erp.utils.AjaxReturn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Zhihui_Shen on 2018/6/4.
 */
@Controller
@RequestMapping("/market/purchase_order")
public class PurchaseOrderController {

    @Autowired
    private PurchaseOrderService purchaseOrderService;
    @Autowired
    private ContractService contractService;
    @Autowired
    private PatternService patternService;
    @Autowired
    private ColorService colorService;
    @Autowired
    private CustomerService customerService;
    @Autowired
    private UserService userService;
    @Autowired
    private ProductOrderService productOrderService;
    @Autowired
    private PackingFormService packingFormService;

    @RequestMapping("/get_by_criteria")
    @ResponseBody
    public List<PurchaseOrderListGrid> getByCriteria(String customerName, String purchaseNum, String purchaseTimeBegin) {
        Integer customerId = null;

        if (!customerName.equals(""))
            customerId = customerService.getIdByName(customerName);
        if (purchaseNum.equals(""))
            purchaseNum = null;
        if (purchaseTimeBegin.equals(""))
            purchaseTimeBegin = null;
        try {
            List<PurchaseOrder> o = purchaseOrderService.getByCriteria(customerId, purchaseNum, purchaseTimeBegin, purchaseTimeBegin);
            ArrayList<PurchaseOrderListGrid> grids = new ArrayList<PurchaseOrderListGrid>();
            for (PurchaseOrder s : o
                    ) {
                grids.add(generateGrid(s));
            }
            return grids;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    PurchaseOrderListGrid generateGrid(PurchaseOrder order) {
        Customer c = customerService.getById(order.getCustomerId());
        String purchaseNum = order.getPurchaseNum();
        List<ProductOrderSpec> productOrderSpecs = productOrderService.getSpecsByPurchaseNum(purchaseNum);
        List<PurchaseOrderSpec> purchaseOrderSpecs = purchaseOrderService.getSpecsByPurchaseNum(purchaseNum);
        Integer totalAmount = 0;
        Integer completedAmount = 0;
        for (ProductOrderSpec s : productOrderSpecs
                ) {
            completedAmount += s.getCompletedAmount();
        }
        for (PurchaseOrderSpec s : purchaseOrderSpecs
                ) {
            totalAmount += s.getRequiredAmount();
        }
        if (order.getMakerId() != null && order.getProducerId() != null && order.getSalesmanId() != null && order.getSupervisorId() != null) {
            return new PurchaseOrderListGrid(order.getValidityCode(), c.getAbbreviation(), order.getPurchaseNum(),
                    completedAmount, totalAmount, new SimpleDateFormat("yyyy-MM-dd").format(order.getPurchaseTime()),
                    new SimpleDateFormat("yyyy-MM-dd").format(order.getDeliverTime()), order.getRemark());
        } else {
            return new PurchaseOrderListGrid(order.getValidityCode(), c.getAbbreviation(), order.getPurchaseNum(),
                    completedAmount, totalAmount, new SimpleDateFormat("yyyy-MM-dd").format(order.getPurchaseTime()),
                    new SimpleDateFormat("yyyy-MM-dd").format(order.getDeliverTime()), order.getRemark());
        }
    }

    @RequestMapping("/get_category")
    @ResponseBody
    public List<PurchaseOrderListGrid> getCategory(String category) {
        switch (Integer.parseInt(category)) {
            case 2:
                List<PurchaseOrder> o2 = purchaseOrderService.getUncheckedOrders();
                ArrayList<PurchaseOrderListGrid> grids2 = new ArrayList<PurchaseOrderListGrid>();
                for (PurchaseOrder s : o2
                        ) {
                    grids2.add(generateGrid(s));
                }
                return grids2;
            case 8:
                List<PurchaseOrder> o8 = purchaseOrderService.getInvalidOrders();
                ArrayList<PurchaseOrderListGrid> grids8 = new ArrayList<PurchaseOrderListGrid>();
                for (PurchaseOrder s : o8
                        ) {
                    grids8.add(generateGrid(s));
                }
                return grids8;
            default:
                return null;
        }
    }

    @RequestMapping("/2lst")
    public String listPage() {
        return "/market/plate/purchase_order/lst";
    }

    @RequestMapping("/2add")
    public String addPage() {
        return "/market/plate/purchase_order/add";
    }

    @RequestMapping("/2mdf")
    public String modifyPage(@RequestParam(value = "purchaseNum") String purchaseNum, Model model) {
        PurchaseOrder order = purchaseOrderService.getOrderByPurchaseNum(purchaseNum);
        List<PurchaseOrderSpec> specs = purchaseOrderService.getSpecsByPurchaseNum(purchaseNum);
        List<Contract> contracts = contractService.getByPurchaseNum(purchaseNum);

        ArrayList<PurchaseOrderSpecGrid> grids = new ArrayList<PurchaseOrderSpecGrid>();
        for (PurchaseOrderSpec s : specs
                ) {
            Integer completedAmount = productOrderService.getCompletedAmount(productOrderService.getProductSpecByPurchaseOrderSpecId(s.getSpecId()).getFkProductNum());
            grids.add(new PurchaseOrderSpecGrid(patternService.getNameById(s.getPatternId()) + "  " + s.getPatternId(),
                    colorService.getNameById(s.getColorId()) + "  " + s.getColorId(), s.getLength(), s.getWidth(), s.getThickness()
                    , s.getRequiredAmount(), completedAmount.toString(), s.getRequiredAmount().toString(), ((float) s.getLength() * (float) s.getWidth() * s.getThickness() * 1.24f) / 100000f * (float) completedAmount, 0f, s.getPrice(),
                    s.getRequiredAmount() * s.getPrice()));
        }
        PurchaseOrderGrid purchaseOrderGrid = new PurchaseOrderGrid(order.getPurchaseNum(),
                customerService.getNameById(order.getCustomerId()),
                new SimpleDateFormat("yyyy-MM-dd").format(order.getPurchaseTime()),
                new SimpleDateFormat("yyyy-MM-dd").format(order.getDeliverTime()), order.getValidityCode(), order.getRemark(), userService.getNameById(order.getSupervisorId())
                , userService.getNameById(order.getSalesmanId()), userService.getNameById(order.getProducerId()), userService.getNameById(order.getMakerId()));
        model.addAttribute("purchaseOrderGrid", purchaseOrderGrid);
        model.addAttribute("purchaseOrderSpecGrids", grids);
        return "/market/plate/purchase_order/mdf";
    }

    @RequestMapping("/2dtl")
    public String detailPage(@RequestParam(value = "purchaseNum") String purchaseNum, Model model) {
        PurchaseOrder order = purchaseOrderService.getOrderByPurchaseNum(purchaseNum);
        List<PurchaseOrderSpec> specs = purchaseOrderService.getSpecsByPurchaseNum(purchaseNum);
        List<Contract> contracts = contractService.getByPurchaseNum(purchaseNum);

        ArrayList<PurchaseOrderSpecGrid> grids = new ArrayList<PurchaseOrderSpecGrid>();
        for (PurchaseOrderSpec s : specs
                ) {
            ProductOrderSpec i = productOrderService.getProductSpecByPurchaseOrderSpecId(s.getSpecId());
            grids.add(new PurchaseOrderSpecGrid(patternService.getNameById(s.getPatternId()) + "  " + s.getPatternId(),
                    colorService.getNameById(s.getColorId()) + "  " + s.getColorId(), s.getLength(), s.getWidth(), s.getThickness()
                    , s.getRequiredAmount(), i.getCompletedAmount().toString(), s.getRequiredAmount().toString(), ((float) s.getLength() * (float) s.getWidth() * s.getThickness() * 1.24f) / 100000f * (float) i.getCompletedAmount(),
                    packingFormService.getWeightByBatchNum(i.getBatchNum()), s.getPrice(),
                    s.getRequiredAmount() * s.getPrice()));
        }
        PurchaseOrderGrid purchaseOrderGrid = new PurchaseOrderGrid(order.getPurchaseNum(),
                customerService.getNameById(order.getCustomerId()),
                new SimpleDateFormat("yyyy-MM-dd").format(order.getPurchaseTime()),
                new SimpleDateFormat("yyyy-MM-dd").format(order.getDeliverTime()), order.getValidityCode(), order.getRemark(), userService.getNameById(order.getSupervisorId())
                , userService.getNameById(order.getSalesmanId()), userService.getNameById(order.getProducerId()), userService.getNameById(order.getMakerId()));
        model.addAttribute("purchaseOrderGrid", purchaseOrderGrid);
        model.addAttribute("purchaseOrderSpecGrids", grids);
        return "/market/plate/purchase_order/dtl";
    }

    @RequestMapping("/insert_order")
    @ResponseBody
    public AjaxReturn insertOrder(HttpServletRequest request) {
        String purchaseNum = request.getParameter("purchaseNum");
        if (!purchaseOrderService.checkOrderExistence(purchaseNum)) {
            System.out.println("订单号重复");
            return new AjaxReturn(false, "订单号重复");
        }
        String customerName = request.getParameter("customerName");
        String purchaseTime = request.getParameter("purchaseTime");
        String deliverTime = request.getParameter("deliverTime");
        String remark = request.getParameter("remark");
        String makerId = request.getParameter("makerId");

        PurchaseOrder order = new PurchaseOrder();
        order.setPurchaseNum(purchaseNum);
        order.setCustomerId(customerService.getIdByName(customerName));
        try {
            order.setPurchaseTime(new SimpleDateFormat("yyyy-MM-dd").parse(purchaseTime));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        try {
            order.setDeliverTime(new SimpleDateFormat("yyyy-MM-dd").parse(deliverTime));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        order.setRemark(remark);
        order.setMakerId(Integer.parseInt(makerId));
        order.setValidityCode(true);

        ArrayList<PurchaseOrderSpec> specs = new ArrayList<PurchaseOrderSpec>();
        int totalAmount = 0;
        for (int i = 0; ; i++) {
            String pattern = request.getParameter("pattern_" + i);
            if (pattern == null) break;
            String color = request.getParameter("color_" + i);
            String length = request.getParameter("length_" + i);
            String width = request.getParameter("width_" + i);
            String thickness = request.getParameter("thickness_" + i);
            String amount = request.getParameter("amount_" + i);
//            String price = request.getParameter("price_" + i);

            PurchaseOrderSpec spec = new PurchaseOrderSpec();
            spec.setColorId(color);
            spec.setPatternId(pattern);
            spec.setLength(Integer.parseInt(length));
            spec.setWidth(Integer.parseInt(width));
            spec.setThickness(Float.parseFloat(thickness));
            spec.setRequiredAmount(Integer.parseInt(amount));
            spec.setPrice(Float.parseFloat("0"));
            spec.setFkPurchaseNum(purchaseNum);
            specs.add(spec);

            totalAmount += Integer.parseInt(amount);

        }

        purchaseOrderService.insertOrder(order, specs);
        System.out.println("订单插入成功 specs=" + specs.size());
        return new AjaxReturn(true, "");
    }

    @RequestMapping("/obsolate")
    @ResponseBody
    public void obsolateOrder(String purchaseNum) {
        System.out.println(purchaseNum);
        purchaseOrderService.obsolateOrder(purchaseNum);
    }

    @RequestMapping("/sign")
    @ResponseBody
    public void sign(String userName, String purchaseNum) {
        Integer userId = userService.getIdByRealName(userName);
        String userAuth = userService.getAuthoritiesById(userId);
        purchaseOrderService.sign(userId, userAuth, purchaseNum);
        if (purchaseOrderService.checkAudition(purchaseNum)) {
            System.out.println("purchase checked!starting generate product order");
            PurchaseOrder purchaseOrder = purchaseOrderService.getOrderByPurchaseNum(purchaseNum);
//          List<PurchaseOrderSpec> purchaseOrderSpecList = purchaseOrderService.getSpecsByPurchaseNum(purchaseNum);
            List<PurchaseOrderSpec> groupSpecList = purchaseOrderService.groupByColorId(purchaseNum);

            ArrayList<ProductOrder> orderArrayList = new ArrayList<ProductOrder>();
            ArrayList<ProductOrderSpec> orderSpecArrayList = new ArrayList<ProductOrderSpec>();

            Integer batchNum = Integer.parseInt(purchaseOrderService.generateBatchNum()) + 1;
            for (PurchaseOrderSpec s : groupSpecList
                    ) {
                ProductOrder productOrder = new ProductOrder();
                productOrder.setGenerateTime(new Date());
                productOrder.setFkPurchaseNum(purchaseNum);
                productOrder.setProductNum(productOrderService.generateProductNum(purchaseNum, s.getColorId()));
                System.out.println("generate product order:" + productOrder.toString());

                List<PurchaseOrderSpec> newList = purchaseOrderService.getByPurchaseNumAndColorId(purchaseNum, s.getColorId());
                for (PurchaseOrderSpec n : newList
                        ) {
                    ProductOrderSpec productOrderSpec = new ProductOrderSpec();
                    productOrderSpec.setCompletedAmount(0);
                    productOrderSpec.setBatchNum("JY " + batchNum);
                    productOrderSpec.setFkProductNum(productOrder.getProductNum());
                    productOrderSpec.setStateCode(-1);
                    productOrderSpec.setFkPurchaseSpecId(n.getSpecId());
                    batchNum++;
                    System.out.println("generate product order spec:" + productOrderSpec.toString());
                    orderSpecArrayList.add(productOrderSpec);
                }
                orderArrayList.add(productOrder);
            }

            for (ProductOrderSpec s : orderSpecArrayList
                    ) {
                productOrderService.insertSpec(s);
            }
            for (ProductOrder s : orderArrayList
                    ) {
                productOrderService.insertOrder(s);
            }
        } else {

        }
    }

    @RequestMapping("/get_unstart_order")
    @ResponseBody
    public List<PurchaseOrderListGrid> getUnStartPurchaseOrder() {
        ArrayList<PurchaseOrderListGrid> listGrids = new ArrayList<>();
        List<PurchaseOrder> purchaseOrderList = purchaseOrderService.getUnStartPurchaseOrder();
        for (PurchaseOrder s:purchaseOrderList
             ) {
            listGrids.add(generateGrid(s));
        }
        return listGrids;
    }
}
