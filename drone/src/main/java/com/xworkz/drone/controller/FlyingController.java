package com.xworkz.drone.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class FlyingController {
    public FlyingController(){
        System.out.println("Flying Controller is Called");
    }
    @GetMapping("/droneFly")
    public String droneFly(){
        System.out.println("Drone Fly is called");
        return "fly.jsp";
    }
}
