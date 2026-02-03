package com.xworkz.battery.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class BatteryController {
    public BatteryController(){
        System.out.println("BAtteryController is Called");
    }

    @GetMapping("/startCharging")
    public String startCharging(){
        System.out.println("Get's charged");
        return "charge";
    }

    @GetMapping("/insertCell")
    public String insertCell(){
        System.out.println("Insert a cell to switchon");
        return "cell";
    }

    @GetMapping("/checkLevel")
    public String checkLevel(){
        System.out.println("checking level to again recharge");
        return "level";
    }

    @GetMapping("/removeBattery")
    public String removeBattery(){
        System.out.println("remove a cell ");
        return "remove";
    }


    @GetMapping("/lowBatteryAlert")
    public String lowBatteryAlert(){
        System.out.println("alert the charging level");
        return "alert";
    }
}
