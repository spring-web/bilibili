package com.baidu.bilibili.pojo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class User {
    private Integer user_id;
    private String name;
    private String phone;
    private String password;
    private Integer state;
}
