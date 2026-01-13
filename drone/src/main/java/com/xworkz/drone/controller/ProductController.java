package com.xworkz.drone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ProductController {
    public ProductController(){
        System.out.println("ProductController is Calling");
    }

    @GetMapping("/product")
    public String product(){
        System.out.println("Product method is called");
        return "product.jsp";
    }
}
