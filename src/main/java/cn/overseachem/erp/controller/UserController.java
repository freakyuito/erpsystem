package cn.overseachem.erp.controller;

import cn.overseachem.erp.pojo.User;
import cn.overseachem.erp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zhihui_Shen on 2018/6/22.
 */
@Controller
@RequestMapping("/common/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/get_captain")
    @ResponseBody
    public List<String> getAllCaptainName(){
        ArrayList<String> captains = new ArrayList<String>();
        List<User> users = userService.getAllCaptain();
        for (User u:users
             ) {
            captains.add(u.getRealName());
        }
        return captains;
    }

    @RequestMapping("/get_all")
    @ResponseBody
    public List<User> getAll(){
        return userService.getAll();
    }
}