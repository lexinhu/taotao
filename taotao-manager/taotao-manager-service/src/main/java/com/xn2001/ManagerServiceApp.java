package com.xn2001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Author 乐心湖
 * @Date 2020/12/23 9:10
 * @Version 1.0
 */
@SpringBootApplication
@MapperScan("com.xn2001.mapper")
public class ManagerServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(ManagerServiceApp.class, args);
    }
}
