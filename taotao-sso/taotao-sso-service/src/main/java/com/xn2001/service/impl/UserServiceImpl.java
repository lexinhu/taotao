package com.xn2001.service.impl;

import com.xn2001.mapper.UserMapper;
import com.xn2001.pojo.User;
import com.xn2001.service.UserService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author 乐心湖
 * @Date 2020/12/29 14:23
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public String doLogin(User user) {

        User loginUser = userMapper.selectOne(user);

        if (loginUser != null) {
            return "login_success_" +loginUser.getUsername();
        }

        return null;
    }
}
