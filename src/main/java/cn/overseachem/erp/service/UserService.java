package cn.overseachem.erp.service;


import cn.overseachem.erp.mapper.UserMapper;
import cn.overseachem.erp.pojo.User;
import cn.overseachem.erp.pojo.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Zhihui_Shen on 2018/6/4.
 */
@Component
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User checkUserNameExistance(String userName) {
        UserExample e = new UserExample();
        e.createCriteria().andUserNameEqualTo(userName);
        List<User> userList = userMapper.selectByExample(e);
        if (userList != null && userList.size() > 0) {
            return userList.get(0);
        }
        return null;
    }

    public User checkUserPassword(String userName, String userPassword) {
        UserExample e = new UserExample();
        e.createCriteria().andUserNameEqualTo(userName).andUserPasswordEqualTo(userPassword);
        List<User> userList = userMapper.selectByExample(e);
        if (userList != null && userList.size() > 0) {
            return userList.get(0);
        }
        return null;
    }

    public String getNameById(Integer id) {
        if (id != null)
            return userMapper.selectByPrimaryKey(id).getRealName();
        return null;
    }

    public String getAuthoritiesById(Integer id) {
        if (id != null)
            return userMapper.selectByPrimaryKey(id).getFkAuthoritiesId();
        return null;
    }

    public Integer getIdByUserName(String name) {
        if (name != null) {
            UserExample e = new UserExample();
            e.createCriteria().andUserNameEqualTo(name);
            return userMapper.selectByExample(e).get(0).getUserId();
        }
        return null;
    }

    public Integer getIdByRealName(String realName){
        if (realName != null) {
            UserExample e = new UserExample();
            e.createCriteria().andRealNameEqualTo(realName);
            return userMapper.selectByExample(e).get(0).getUserId();
        }
        return null;
    }

    public List<User> getAllCaptain() {
        UserExample e = new UserExample();
        e.createCriteria().andFkAuthoritiesIdLike("%" + "BC" + "%").andFkAuthoritiesIdNotLike("%" + "BCP" + "%").andFkAuthoritiesIdNotLike("%" + "BCJ" + "%");
        return userMapper.selectByExample(e);
    }

    public List<User> getAll(){
        UserExample e = new UserExample();
        e.createCriteria();
        return userMapper.selectByExample(e);
    }
}
