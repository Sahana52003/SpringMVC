package com.xworkz.mobile.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MobileController {

    public MobileController(){
        System.out.println("MobileController is Called");
    }


    @GetMapping("/poweron")
    public String powerOn(){
        return "power";
    }


    @GetMapping("/makecall")
    public String makeCall(){
        return "call";
    }


    @GetMapping("/sent")
    public String messageSent(){
        return "message";
    }


    @GetMapping("/openCamera")
    public String openCamera(){
        return "camera";
    }


    @GetMapping("/play")
    public String playMusic(){
        return "music";
    }
}
