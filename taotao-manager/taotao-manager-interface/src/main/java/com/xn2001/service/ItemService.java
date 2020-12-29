package com.xn2001.service;

import com.xn2001.pojo.Item;
import com.xn2001.pojo.TaoResult;

/**
 * @Author 乐心湖
 * @Date 2020/12/22 14:20
 * @Version 1.0
 */

public interface ItemService {
    /**
     * 分页查询商品
     *
     * @param page
     * @param rows
     * @return
     */
    TaoResult<Item> findByPage(Integer page, Integer rows);

    /**
     * 新增商品
     *
     * @param item
     */
    void saveItem(Item item, String desc);

    void instockItem(Long id);
}
