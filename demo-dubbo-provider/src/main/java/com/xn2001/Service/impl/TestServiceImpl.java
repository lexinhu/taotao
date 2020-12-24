package com.xn2001.service.impl;

import com.xn2001.TestService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @Author 乐心湖
 * @Date 2020/12/22 9:50
 * @Version 1.0
 */
@Service
public class TestServiceImpl implements TestService {
    @Override
    public void sayHi() {
        System.out.println("TestService接口的saveTest被调用");
    }
}
