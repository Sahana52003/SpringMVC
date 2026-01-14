package com.xworkz.notification.controller;

import com.xworkz.notification.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class NotificationController {
    public NotificationController(){
        System.out.println("NotificationController is Calling");
    }

    @Autowired
    NotificationService notificationService;

    @GetMapping("/receive")
    public String receive(@RequestParam String name){
        notificationService.send();
        System.out.println("Receiveing notification from : " + name);
        return "index.jsp";
    }
}
