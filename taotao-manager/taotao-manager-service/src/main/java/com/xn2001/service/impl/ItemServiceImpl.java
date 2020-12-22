package com.xn2001.service.impl;

import com.xn2001.mapper.ItemMapper;
import com.xn2001.pojo.Item;
import com.xn2001.pojo.TaoResult;
import com.xn2001.service.ItemService;

/**
 * @Author 乐心湖
 * @Date 2020/12/22 14:34
 * @Version 1.0
 */

public class ItemServiceImpl implements ItemService {

    private ItemMapper itemMapper;

    @Override
    public TaoResult<Item> findByPage(Integer page, Integer rows) {
        // itemMapper
        return null;
    }
}
