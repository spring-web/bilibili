package com.baidu.bilibili.service;

import com.baidu.bilibili.dao.UserDao;
import com.baidu.bilibili.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public List<User> login(String phone,String password){
        return userDao.login(phone,password);
    }
}
