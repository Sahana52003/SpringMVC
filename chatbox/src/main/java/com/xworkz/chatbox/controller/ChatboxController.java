package com.xworkz.chatbox.controller;

import com.xworkz.chatbox.service.ChatboxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class ChatboxController {
    public ChatboxController(){
        System.out.println("This is a Chatbox Controller");
    }

    @Autowired
    ChatboxService chatboxService;

    @GetMapping("/open")
    public String open(@RequestParam String name){
        chatboxService.message();
        System.out.println("Receiving message from service :" + name);
        return "index.jsp";
    }
}
