package com.xn2001.service;

import com.xn2001.pojo.ItemDesc;

/**
 * @Author 乐心湖
 * @Date 2020/12/24 9:23
 * @Version 1.0
 */

public interface ItemDescService {
    void saveItemDesc(ItemDesc itemDesc);

    ItemDesc queryById(Long itemId);
}
