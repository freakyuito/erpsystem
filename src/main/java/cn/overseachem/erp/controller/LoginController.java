package cn.overseachem.erp.controller;

import cn.overseachem.erp.pojo.User;
import cn.overseachem.erp.service.UserService;
import cn.overseachem.erp.utils.AjaxReturn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Zhihui_Shen on 2018/6/4.
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping("/2login")
    public String loginPage() {
        return "/login";
    }

    @RequestMapping("/getLoginResult")
    @ResponseBody
    public AjaxReturn getLoginResult(
            @RequestParam(value = "form-username") String userName,
            @RequestParam(value = "form-password") String userPassword,
            HttpServletRequest req) {
        User user = new User();
        user = userService.checkUserNameExistance(userName);
        if (user != null) {
            user = userService.checkUserPassword(userName, userPassword);
            if (user != null) {
                req.getSession().setAttribute("userName", user.getUserName());
                req.getSession().setAttribute("userId", user.getUserId());
                req.getSession().setAttribute("userAuth", user.getFkAuthoritiesId());
                req.getSession().setAttribute("userRealname", user.getRealName());
                return new AjaxReturn(true,"success");
            } else {
                return new AjaxReturn(false, "密码错误");
            }
        }else{
            return new AjaxReturn(false, "用户名错误");
        }
    }
}
