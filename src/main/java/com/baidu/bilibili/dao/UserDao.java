package com.baidu.bilibili.dao;

import com.baidu.bilibili.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserDao {

    List<User> login(String phone,String password);
}
