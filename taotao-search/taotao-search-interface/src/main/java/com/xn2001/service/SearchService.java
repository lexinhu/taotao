package com.xn2001.service;

import com.xn2001.pojo.Item;
import com.xn2001.pojo.TaoResult;

/**
 * @Author 乐心湖
 * @Date 2020/12/28 8:44
 * @Version 1.0
 */

public interface SearchService {

    TaoResult<Item> search(String query, Integer page, Integer rows);
}
