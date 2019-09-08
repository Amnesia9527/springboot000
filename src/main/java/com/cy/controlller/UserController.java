package com.cy.controlller;

import com.cy.mapper.UserMapper;
import com.cy.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class UserController {

    @Resource
    private UserMapper userMapper;

    @RequestMapping("/getAll")
    @ResponseBody
    public List<User> fingAll(){
        return userMapper.getAllUser();
    }
}
