package com.xn2001.controller;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @Author 乐心湖
 * @Date 2020/12/28 14:18
 * @Version 1.0
 */
@Component
public class ReceiverMessage {

    @JmsListener(destination = "taotao")
    public void receiveQueue(String data) {
        System.out.println(data);
    }

    @JmsListener(destination = "NBA")
    public void receiveTopic01(String data) {
        System.out.println("01" + data);
    }

    @JmsListener(destination = "NBA")
    public void receiveTopic02(String data) {
        System.out.println("02" + data);
    }

    @JmsListener(destination = "NBA")
    public void receiveTopic03(String data) {
        System.out.println("03" + data);
    }
}
