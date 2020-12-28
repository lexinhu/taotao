package com.xn2001.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 乐心湖
 * @Date 2020/12/28 14:10
 * @Version 1.0
 */
@RestController
public class SendMessage {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @RequestMapping("/queue")
    public String sendMsg(){
        jmsMessagingTemplate.convertAndSend("taotao","该吃饭了");
        return "success";
    }

    @RequestMapping("/topic")
    public String sendTopicMsg(){
        jmsMessagingTemplate.convertAndSend("NBA","湖人总冠军");
        return "success";
    }
}
