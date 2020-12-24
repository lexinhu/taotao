package com.xn2001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @Author 乐心湖
 * @Date 2020/12/24 13:37
 * @Version 1.0
 */

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class PortalApp {
    public static void main(String[] args) {
        SpringApplication.run(PortalApp.class,args);
    }
}
