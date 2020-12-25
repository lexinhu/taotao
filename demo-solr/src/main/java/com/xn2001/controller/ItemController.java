package com.xn2001.controller;

import com.xn2001.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 乐心湖
 * @Date 2020/12/25 10:15
 * @Version 1.0
 */

@RestController
public class ItemController {
    @Autowired
    private ItemService itemService;

    @RequestMapping("/addIndex")
    public String addIndex(){
        itemService.addIndex();
        return "success";
    }
}
