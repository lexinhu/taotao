package com.xn2001.controller;

import com.xn2001.pojo.User;
import com.xn2001.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author 乐心湖
 * @Date 2020/12/29 14:14
 * @Version 1.0
 */
@RestController
public class UserController {

    @Reference
    private UserService userService;

    /**
     * 用户登录
     *
     * @param user
     * @return
     */
    @RequestMapping(value = "/service/user/doLogin", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> doLogin(User user) {
        // 调用服务进行用户登录，需要返回ticket，目的是放到cookie中给用户
        String ticket = this.userService.doLogin(user);
        // 判断ticket是否为空，如果不为空表示用户登录成功
        if (StringUtils.isNotBlank(ticket)) {
            // 如果登录成功ticket需要放到cookie中

            // 封装返回数据
            Map<String, Object> map = new HashMap<>();
            map.put("status", "200");

            return map;

        }
        return null;

    }

}
