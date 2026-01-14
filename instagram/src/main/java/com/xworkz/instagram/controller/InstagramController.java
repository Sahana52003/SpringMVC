package com.xworkz.instagram.controller;

import com.xworkz.instagram.service.InstagramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class InstagramController {
    public InstagramController(){
        System.out.println("InstagramController is Calling");
    }

    @Autowired
    InstagramService instagramService;


    @GetMapping("/run")
    public String close(@RequestParam String name){
        instagramService.open();
        System.out.println("Removed the account : " + name);
        return "index.jsp";
    }

}
