package com.xn2001.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.xn2001.mapper.ItemMapper;
import com.xn2001.pojo.Item;
import com.xn2001.pojo.TaoResult;
import com.xn2001.service.ItemService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author 乐心湖
 * @Date 2020/12/22 14:34
 * @描述: 商品Service
 */
@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemMapper itemMapper;

    @Override
    public TaoResult<Item> findByPage(Integer page, Integer rows) {
        // 分页设置，只是设置查询第几页，每页查询多少条数据
        PageHelper.startPage(page,rows);
        // 查询
        Page<Item> pageData = (Page<Item>) itemMapper.selectByExample(null);

        TaoResult<Item> result = new TaoResult<>(pageData.getTotal(), pageData.getResult());
        // itemMapper
        return result;
    }
}
