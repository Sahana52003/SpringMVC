package com.xworkz.fan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class FanController {
    public FanController(){
        System.out.println("FanController is Called");
    }

    @GetMapping("/On")
    public String switchOn(){
        return "start";
    }

    @GetMapping("/decspeed")
    public String decreaseSpeed(){
        return "speedDesc";
    }

    @GetMapping("/incspeed")
    public String increaseSpeed(){
        return "speedInc";
    }

    @GetMapping("/rotating")
    public String rotate(){
        return "rotate";
    }

    @GetMapping("/off")
    public String stop(){
        return "speedOff";
    }

}
