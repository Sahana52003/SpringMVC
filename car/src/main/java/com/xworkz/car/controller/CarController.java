package com.xworkz.car.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class CarController {
    public CarController(){
        System.out.println("CarController class is called");
    }

    @GetMapping("/start")
    public String start(){
        return "start";
    }

    @GetMapping("/stop")
    public String stop(){
        return "stop";
    }
    @GetMapping("/accelerate")
    public String accelerate(){
        return "acc";
    }

    @GetMapping("/applyBrake")
    public String applyBrake(){
        return "brake";
    }

    @GetMapping("/changeGear")
    public String changeGear(){
        return "gear";
    }
}
