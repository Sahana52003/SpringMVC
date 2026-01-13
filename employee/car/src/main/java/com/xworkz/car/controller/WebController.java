package com.xworkz.car.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class WebController {
    public WebController(){
        System.out.println("WebController is Called");
    }
    @GetMapping("/carstarter")
    public String carstarter(){
        System.out.println("Car starter is called");
        return "car.jsp";
    }
}
