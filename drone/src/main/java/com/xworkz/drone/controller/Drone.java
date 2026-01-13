package com.xworkz.drone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class Drone {
    public Drone(){
        System.out.println("Calling Drone Class");
    }
    @GetMapping("drone")
    public String drone(){
        System.out.println("Caing drne");
        return "/drone1.jsp";
    }
}
