package com.xn2001.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.xn2001.mapper.ItemMapper;
import com.xn2001.pojo.Item;
import com.xn2001.pojo.ItemDesc;
import com.xn2001.pojo.TaoResult;
import com.xn2001.service.ItemDescService;
import com.xn2001.service.ItemService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;

import java.util.Date;

/**
 * @Author 乐心湖
 * @Date 2020/12/22 14:34
 * @描述: 商品Service
 */
@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemMapper itemMapper;

    @Autowired
    private ItemDescService itemDescService;

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Override
    public TaoResult<Item> findByPage(Integer page, Integer rows) {
        // 分页设置，只是设置查询第几页，每页查询多少条数据
        PageHelper.startPage(page, rows);
        // 查询
        Page<Item> pageData = (Page<Item>) itemMapper.selectByExample(null);

        TaoResult<Item> result = new TaoResult<>(pageData.getTotal(), pageData.getResult());

        return result;
    }

    @Override
    public void saveItem(Item item, String desc) {

        item.setStatus(1);
        item.setCreated(new Date());
        item.setUpdated(item.getCreated());

        // 保存商品
        itemMapper.insert(item);
        ItemDesc itemDesc = new ItemDesc();
        itemDesc.setItemDesc(desc);
        itemDesc.setItemId(item.getId());
        itemDesc.setCreated(item.getCreated());
        itemDesc.setUpdated(item.getCreated());
        itemDescService.saveItemDesc(itemDesc);

        jmsMessagingTemplate.convertAndSend("item",item.getId()+"");

    }
}
