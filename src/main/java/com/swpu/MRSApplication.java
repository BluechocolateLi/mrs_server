package com.swpu;
/*
 * @Author:YoungJone9
 * @Date:2023/2/8
 * @Description:com.swpu
 */

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class MRSApplication {
    public static void main(String[] args) {
        SpringApplication.run(MRSApplication.class);
        log.info("项目启动成功...");
    }
}
