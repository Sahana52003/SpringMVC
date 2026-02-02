package com.xworkz.keyboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class KeyboardController {


    @GetMapping("/type")
    public String type(){
        System.out.println("Called type");
        return "type";
    }
    @GetMapping("/pressKey")
    public String pressKey(){
        System.out.println("Called pressKey");
        return "presskey";
    }


    @GetMapping("/enableCapsLock")
    public String enableCapsLock(){
        System.out.println("Called enableCapsLock");
        return "enableCapsLock";
    }

    @GetMapping("/pressEnter")
    public String pressEnter(){
        System.out.println("Called pressEnter");
        return "pressEnter";
    }

    @GetMapping("/disconnect")
    public String disconnect(){
        System.out.println("Called disconnect");
        return "disconnect";
    }
}
