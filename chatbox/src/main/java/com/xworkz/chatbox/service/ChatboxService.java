package com.xworkz.chatbox.service;

import org.springframework.stereotype.Service;

@Service
public class ChatboxService implements Chatbox{
    @Override
    public void message() {
        System.out.println("Can message or chatting with oth");
    }
}
