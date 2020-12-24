package com.xn2001.service.impl;

import com.xn2001.mapper.ItemCatMapper;
import com.xn2001.pojo.ItemCat;
import com.xn2001.service.ItemCatService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author 乐心湖
 * @Date 2020/12/23 13:46
 * @Version 1.0
 */

@Service
public class ItemCatServiceImpl implements ItemCatService {

    @Autowired
    private ItemCatMapper itemCatMapper;

    @Override
    public List<ItemCat> queryItemCatByParentId(Long parentId) {
        ItemCat itemCat = new ItemCat();
        itemCat.setParentId(parentId);
        return itemCatMapper.select(itemCat);
    }
}
