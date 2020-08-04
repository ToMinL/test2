package com.tomin.dbtest.Controller;


import com.tomin.dbtest.Mapper.userMapper;
import com.tomin.dbtest.Pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;

@Controller
public class UserController {
    @Autowired
    private userMapper userMapper;

    @RequestMapping("/insertUser")
    public void insertUser(String userName, String country, String sex) {
        User user = new User();
        user.setName(userName);
        user.setCountry(country);
        user.setSex(sex);
        userMapper.insert(user);
    }

    @RequestMapping("/selectUser")
    public User insertUser(String userName) {
        return userMapper.SelectOne(userName);
    }
    @RequestMapping("/deleteUser")
    public void insertUser(int userId) {
        userMapper.Delete(userId);
    }
    @RequestMapping("/updateUser")
    public void updateUser(int userId, String userName, String country, String sex) {
        User user = new User();
        user.setId(userId);
        user.setName(userName);
        user.setCountry(country);
        user.setSex(sex);
        userMapper.Update(user);
    }
}


