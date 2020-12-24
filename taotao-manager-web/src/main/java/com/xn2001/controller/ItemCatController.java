package com.xn2001.controller;

import com.xn2001.pojo.ItemCat;
import com.xn2001.service.ItemCatService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author 乐心湖
 * @Date 2020/12/23 13:50
 * @Version 1.0
 */

@RestController
public class ItemCatController {

    @Reference
    private ItemCatService itemCatService;

    @RequestMapping("/rest/item/cat")
    public List<ItemCat> queryItemCatByParentId(@RequestParam(value = "id",defaultValue = "0") Long parentId){
        return itemCatService.queryItemCatByParentId(parentId);
    }


}
