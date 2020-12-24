package com.xn2001.service;

import com.xn2001.pojo.ItemCat;

import java.util.List;

/**
 * @Author 乐心湖
 * @Date 2020/12/23 13:45
 * @Version 1.0
 */

public interface ItemCatService {

    List<ItemCat> queryItemCatByParentId(Long parentId);
}
