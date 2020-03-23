package com.baidu.bilibili.controller;

import com.baidu.bilibili.pojo.User;
import com.baidu.bilibili.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/v1/user")
@RestController
public class loginController {

    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public List<User> login(@RequestParam(value = "phone",required = false) String phone,@RequestParam(value = "password",required = false) String password){
        return userService.login(phone,password);
    }
}
