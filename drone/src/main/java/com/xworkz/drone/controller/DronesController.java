package com.xworkz.drone.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class DronesController {
public DronesController(){
    System.out.println("DronesController is Called in controller");
}
@GetMapping("/drones")
public String drones(){
    System.out.println("Drones method is called");
    return "drones.jsp";
}
}
