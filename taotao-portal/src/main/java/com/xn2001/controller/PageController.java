package com.xn2001.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author 乐心湖
 * @Date 2020/12/23 9:42
 * @Version 1.0
 */

@Controller
public class PageController {

    @RequestMapping("{path}")
    public String page(@PathVariable String path){
        return path;
    }
}
