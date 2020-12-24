package com.xn2001.controller;

import com.xn2001.pojo.Item;
import com.xn2001.pojo.TaoResult;
import com.xn2001.service.ItemService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 乐心湖
 * @Date 2020/12/23 10:37
 * @Version 1.0
 */

@RestController
public class ItemController {

    @Reference
    private ItemService itemService;

    @RequestMapping("/rest/item")
    public TaoResult<Item> findByPage(int page, int rows) {
        TaoResult<Item> byPage = itemService.findByPage(page, rows);
        System.out.println(byPage);
        return byPage;
    }

    @PostMapping("/rest/addItem")
    public void addItem(Item item, String desc) {
        itemService.saveItem(item, desc);
    }
}
