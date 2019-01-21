package com.github.ququzone.rabbit.demo;

import org.springframework.stereotype.Component;

/**
 * @author Yang XuePing
 */
@Component
public class MessageProcessor {
    public void process(byte[] message) {
        System.out.println("receive message:" + new String(message));
    }
}
