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

        Boolean isChecked = productOrderService.checkAudition();

        ArrayList<ProductOrderSpecDtlGrid> grids = new ArrayList<ProductOrderSpecDtlGrid>();
        for (ProductOrderSpec s : specs
                ) {
            PurchaseOrderSpec purchaseOrderSpec = purchaseOrderService.getById(s.getFkPurchaseSpecId());
            grids.add(new ProductOrderSpecDtlGrid(patternService.getNameById(purchaseOrderSpec.getPatternId()),
                    purchaseOrderSpec.getLength(),purchaseOrderSpec.getWidth(),purchaseOrderSpec.getThickness(),
                    s.getCompletedAmount(),purchaseOrderSpec.getRequiredAmount(),0f,s.getBatchNum(),
                    s.getStateCode()
            ));
        }
        ProductOrderDtlGrid productOrderDtlGrid = new ProductOrderDtlGrid(order.getFkPurchaseNum(),
                colorService.getNameById(productOrderService.getColorId(order.getProductNum())),
                order.getMachineNum(),order.getProductNum(),isChecked,userService.getNameById(order.getApproverId()),
                userService.getNameById(order.getReceiverId()));
        System.out.println(productOrderDtlGrid.toString());

        ProductCraft productCraft = productCraftService.getByColorId(productOrderService.getColorId(order.getProductNum()));
        PlateCraftDtlGrid plateCraftDtlGrid = new PlateCraftDtlGrid(colorService.getNameById(productCraft.getColorId()),productCraft.getPlateMeteringpumpRevs(),productCraft.getPlateMasterbatchRevs(),
                productCraft.getPlateMasterbatchBrand(),productCraft.getPlateMembraneName(),productCraft.getPlateEmbossingName());

        model.addAttribute("productOrderDtlGrid", productOrderDtlGrid);
        model.addAttribute("productOrderSpecGrids", grids);
        model.addAttribute("plateCraftDtlGrid",plateCraftDtlGrid);
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
        String colorId = productOrderService.getColorId(target.getProductNum());
        Integer totalAmount = productOrderService.getTotalAmount(target.getProductNum());
        Integer completedAmount = productOrderService.getCompletedAmount(target.getProductNum());
        String scheduleBeginTime = null;
        String scheduleEndTime = null;
        if(target.getScheduleBeginTime() !=null)
            scheduleBeginTime = new SimpleDateFormat("yyyy-MM-dd").format(target.getScheduleBeginTime());
        if(target.getScheduleFinishTime() != null)
            scheduleEndTime = new SimpleDateFormat("yyyy-MM-dd").format(target.getScheduleFinishTime());
        return new ProductOrderLstGrid(target.getFkPurchaseNum(),colorService.getNameById(colorId),target.getProductNum(),
                target.getMachineNum(),completedAmount,totalAmount,0f,
                scheduleBeginTime,scheduleEndTime);
    }
}
