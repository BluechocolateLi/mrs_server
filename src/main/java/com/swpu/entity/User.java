package com.swpu.entity;

import cn.hutool.core.date.DateTime;
import lombok.Data;

import java.security.Timestamp;

@Data
public class User {
    private Long userId;
    private Integer phone;
    private String password;
    private String nickName;    // 用户昵称
    private String icon;        // 用户头像
    private Integer sex;
    private String types;       // 喜欢的类型
    private String director;    // 喜欢的导演
    private String actor;       // 喜欢的演员
    private Timestamp createTime;
    private Timestamp updateTime;

}
