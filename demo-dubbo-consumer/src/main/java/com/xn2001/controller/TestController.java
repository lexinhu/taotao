package com.xn2001.controller;

import com.xn2001.TestService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 乐心湖
 * @Date 2020/12/22 10:22
 * @Version 1.0
 */
@RestController
public class TestController {

    @Reference
    private TestService testService;

    @RequestMapping("sayHi")
    public String sayHi(){
        testService.sayHi();
        return "Success ! ~~~";
    }
}
