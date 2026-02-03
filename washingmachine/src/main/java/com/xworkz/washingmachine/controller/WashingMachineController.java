package com.xworkz.washingmachine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class WashingMachineController {
    public WashingMachineController(){
        System.out.println("This is WashingMachineController");
    }

    @GetMapping("/loadclothes")
    public String loadClothes(){
        System.out.println("loading ");
        return "clothes";
    }

    @GetMapping("/detergent")
    public String addDetergent(){
        System.out.println("Added a detergent ");
        return "powder";
    }


    @GetMapping("/washmode")
    public String washMode(){
        System.out.println("Select a mode to wash");
        return "mode";
    }

    @GetMapping("/rinse")
    public String rinse(){
        System.out.println("rinse a clothes");
        return "rotate";
    }


    @GetMapping("/drainwater")
    public String drainWater(){
        System.out.println("drained a clothes in machine");
        return "water";
    }
}
