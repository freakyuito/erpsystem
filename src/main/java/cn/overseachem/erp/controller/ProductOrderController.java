package cn.overseachem.erp.controller;

import cn.overseachem.erp.pojo.*;
import cn.overseachem.erp.service.*;
import cn.overseachem.erp.utils.AjaxReturn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Zhihui_Shen on 2018/6/4.
 */
@Controller
@RequestMapping("/product/product_order")
public class ProductOrderController {

    @Autowired
    private PurchaseOrderService purchaseOrderService;
    @Autowired
    private ProductOrderService productOrderService;
    @Autowired
    private ColorService colorService;
    @Autowired
    private PatternService patternService;
    @Autowired
    private UserService userService;
    @Autowired
    private ProductCraftService productCraftService;

    @RequestMapping("/2lst")
    public String listPage() {
        return "/product/plate/product_order/lst";
    }

    @RequestMapping("/generate_order")
    public void generateOrder(@RequestParam(value = "purchaseNum") String purchaseNum) {
        System.out.println(purchaseNum);
    }

    @RequestMapping("/2dtl")
    public String detailPage(@RequestParam(value = "productNum") String productNum, Model model) {
        System.out.println(productNum);
        ProductOrder order = productOrderService.getOrderByNum(productNum);
        System.out.println(order.toString());
        List<ProductOrderSpec> specs = productOrderService.getSpecsByNum(productNum);

        Boolean isChecked = productOrderService.isChecked(productNum);
        Boolean isBegin = productOrderService.isBegin(productNum);

        ArrayList<ProductOrderSpecDtlGrid> grids = new ArrayList<ProductOrderSpecDtlGrid>();
        for (ProductOrderSpec s : specs
                ) {
            PurchaseOrderSpec purchaseOrderSpec = purchaseOrderService.getSpecById(s.getFkPurchaseSpecId());
            grids.add(new ProductOrderSpecDtlGrid(colorService.getNameById(purchaseOrderSpec.getColorId()) + " " + purchaseOrderSpec.getColorId(),
                    purchaseOrderSpec.getLength(), purchaseOrderSpec.getWidth(), purchaseOrderSpec.getThickness(),
                    s.getCompletedAmount(), purchaseOrderSpec.getRequiredAmount(), 0f, s.getBatchNum(),
                    s.getStateCode()
            ));
        }
        ProductOrderDtlGrid productOrderDtlGrid = new ProductOrderDtlGrid(productOrderService.getValidityByProductNum(order.getProductNum()),order.getFkPurchaseNum(),
                patternService.getNameById(productOrderService.getPatternId(order.getProductNum())),
                order.getMachineNum(), order.getProductNum(), isChecked, userService.getNameById(order.getApproverId()),
                userService.getNameById(order.getReceiverId()), isBegin);
        System.out.println(productOrderDtlGrid.toString());

        ProductCraft productCraft = productCraftService.getByColorId(productOrderService.getColorId(order.getProductNum()));
        PlateCraftDtlGrid plateCraftDtlGrid = new PlateCraftDtlGrid(colorService.getNameById(productCraft.getColorId()) + " " + productCraft.getColorId(), productCraft.getPlateMeteringpumpRevs(), productCraft.getPlateMasterbatchRevs(),
                productCraft.getPlateMasterbatchBrand(), productCraft.getPlateMembraneName(), productCraft.getPlateEmbossingName());

        model.addAttribute("productOrderDtlGrid", productOrderDtlGrid);
        model.addAttribute("productOrderSpecGrids", grids);
        model.addAttribute("plateCraftDtlGrid", plateCraftDtlGrid);
        return "/product/plate/product_order/dtl";
    }

    @RequestMapping("/get_by_criteria")
    @ResponseBody
    public List<ProductOrderLstGrid> getByCriteria(String purchaseNum, String productNum, String scheduleTime) {
        if (purchaseNum.equals(""))
            purchaseNum = null;
        if (productNum.equals(""))
            productNum = null;
        if (scheduleTime.equals(""))
            scheduleTime = null;
        ArrayList<ProductOrderLstGrid> gridArrayList = new ArrayList<ProductOrderLstGrid>();
        try {
            List<ProductOrder> productOrderList = productOrderService.getByCriteria(purchaseNum, productNum, scheduleTime);
            for (ProductOrder s : productOrderList
                    ) {
                gridArrayList.add(generateLstGrid(s));
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return gridArrayList;
    }

    private ProductOrderLstGrid generateLstGrid(ProductOrder target) {
        String patternId = productOrderService.getPatternId(target.getProductNum());
        Integer totalAmount = productOrderService.getTotalAmount(target.getProductNum());
        Integer completedAmount = productOrderService.getCompletedAmount(target.getProductNum());
        String deliverTime = new SimpleDateFormat("yyyy-MM-dd").format(getDeliverTimeByProductNum(target.getProductNum()));
        String scheduleBeginTime = "";
        String scheduleEndTime = "";
        String machineNum = "无";
        Boolean validity = productOrderService.getValidityByProductNum(target.getProductNum());
        if (target.getScheduleBeginTime() != null)
            scheduleBeginTime = new SimpleDateFormat("yyyy-MM-dd").format(target.getScheduleBeginTime());
        if (target.getScheduleFinishTime() != null)
            scheduleEndTime = new SimpleDateFormat("yyyy-MM-dd").format(target.getScheduleFinishTime());
        if (target.getMachineNum() != null)
            machineNum = target.getMachineNum().toString();

        Float estimateWeight = 0f;
        for (PurchaseOrderSpec s:productOrderService.getPurchaseOrderSpecsByProductOrder(target)
             ) {
            ProductOrderSpec p = productOrderService.getProductSpecByPurchaseOrderSpecId(s.getSpecId());
            estimateWeight += ((float)s.getLength()*(float)s.getWidth()*s.getThickness()*1.24f)/100000*p.getCompletedAmount();
        }
        return new ProductOrderLstGrid(validity,target.getFkPurchaseNum(), patternService.getNameById(patternId), target.getProductNum(),
                machineNum, completedAmount, totalAmount, new DecimalFormat("###0.0").format(estimateWeight), deliverTime, scheduleBeginTime, scheduleEndTime);
    }

    @RequestMapping("/set_state_code")
    @ResponseBody
    public void setStateCode(Integer curState, String batchNum) {
        switch (curState) {
            case -1:
                productOrderService.setStateCode(1, batchNum);
                break;
            case 0:
                productOrderService.setStateCode(1, batchNum);
                break;
            case 1:
                productOrderService.setStateCode(0, batchNum);
                break;
            default:
                break;
        }
    }

    @RequestMapping("/sign")
    @ResponseBody
    public void sign(String approverName, String receiverName, String machineNum, String productNum) {
        productOrderService.sign(userService.getIdByRealName(approverName), userService.getIdByRealName(receiverName), Integer.parseInt(machineNum), productNum);
    }

    @RequestMapping("/set_schedule_begin_time")
    @ResponseBody
    public void setScheduleBeginTime(String productNum, String time) {
        if (time.equals(""))
            productOrderService.setScheduleBeginTime(productNum, null);
        else {
            try {
                productOrderService.setScheduleBeginTime(productNum, new SimpleDateFormat("yyyy-MM-dd").parse(time));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
    }

    @RequestMapping("/set_schedule_finish_time")
    @ResponseBody
    public void setScheduleFinishTime(String productNum, String time) {
        if (time.equals(""))
            productOrderService.setScheduleBeginTime(productNum, null);
        else {
            try {
                productOrderService.setScheduleFinishTime(productNum, new SimpleDateFormat("yyyy-MM-dd").parse(time));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
    }

    Date getDeliverTimeByProductNum(String productNum) {
        return purchaseOrderService.getOrderByPurchaseNum(
                productOrderService.getOrderByNum(productNum).getFkPurchaseNum()).getDeliverTime();
    }
}
