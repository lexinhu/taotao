package com.xn2001.service.impl;

import com.xn2001.mapper.ItemDescMapper;
import com.xn2001.pojo.ItemDesc;
import com.xn2001.service.ItemDescService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author 乐心湖
 * @Date 2020/12/24 9:23
 * @Version 1.0
 */
@Service
public class ItemDescServiceImpl implements ItemDescService {

    @Autowired
    private ItemDescMapper itemDescMapper;

    @Override
    public void saveItemDesc(ItemDesc itemDesc) {
        itemDescMapper.insert(itemDesc);
    }

    @Override
    public ItemDesc queryById(Long itemId) {
        ItemDesc itemDesc = new ItemDesc();
        itemDesc.setItemId(itemId);
        return itemDescMapper.selectOne(itemDesc);
    }
}
