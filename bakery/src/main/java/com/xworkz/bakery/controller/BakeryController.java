package com.xworkz.bakery.controller;


import com.xworkz.bakery.dto.BakeryDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class BakeryController {
    public BakeryController(){
        System.out.println("BakeryController is called");
    }


    @PostMapping("/status")
    public String status(BakeryDTO bakeryDTO){
        System.out.println("The NAme is : " + bakeryDTO.getName() + " COSt is : " + bakeryDTO.getCost() + "" +
                " mobileNUmber " + bakeryDTO.getMobileNumber() + " Color " + bakeryDTO.getColor() +
                "code" + bakeryDTO.getCode() + "Value " + bakeryDTO.getValue() +
                "iDNUmber " + bakeryDTO.getIdNumber() + "status " + bakeryDTO.isDelivered() + " commets are "
                + bakeryDTO.getComments() + " ratings are " + bakeryDTO.getRatings());
        return "bakery";
    }
}
