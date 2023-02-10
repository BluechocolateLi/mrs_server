package com.swpu.entity;
/*
 * @Author:YoungJone9
 * @Date:2023/2/9
 * @Description:com.swpu.entity
 */

import lombok.Data;

@Data
public class Movie {
    private Long movieId;   // 电影id
    private String movieName;   // 电影名称
    private String types;   // 类型
    private Double score;   // 评分
    private String director;    // 导演
    private String actor;   // 演员
    private int account;    // 评论次数
    private String country; // 影片地区
    private String intro;   // 影片描述
    private String poster;  // 海报链接
    private Integer status; // 电影状态(0:普通;1:正在热映;2:即将上映)

}
