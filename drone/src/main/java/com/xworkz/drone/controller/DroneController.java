package com.xworkz.drone.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class DroneController {
    public DroneController(){
        System.out.println("DroneContoller");
    }
    @GetMapping("/start")
    public String start(){
        System.out.println("Method DroneController is called");
        return "/drone.jsp";
    }
}
