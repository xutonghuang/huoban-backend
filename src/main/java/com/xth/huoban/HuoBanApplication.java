package com.xth.huoban;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xth.huoban.mapper")
public class HuoBanApplication {

    public static void main(String[] args) {
        SpringApplication.run(HuoBanApplication.class, args);
    }

}
