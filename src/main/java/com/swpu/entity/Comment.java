package com.swpu.entity;
/*
 * @Author:YoungJone9
 * @Date:2023/2/10
 * @Description:com.swpu.entity
 */

import cn.hutool.core.date.DateTime;
import lombok.Data;

@Data
public class Comment {

    private Long userId;
    private Long movieId;
    private String comment;
    private DateTime createTime;
    private DateTime updateTime;
}
