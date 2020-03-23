package com.baidu.bilibili.controller;

import com.baidu.bilibili.pojo.User;
import com.baidu.bilibili.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/v1/user")
@RestController
@Slf4j
public class LoginController {

    @Autowired
    UserService userService;

    @RequestMapping("/login/{phone}/{password}")
    public List<User> login(@PathVariable("phone") String phone,@PathVariable("password") String password){
        log.info("通过手机号和密码进行登录");
        List<User> list=this.userService.login(phone,password);
        System.out.println(list);
        return list;
    }
}
