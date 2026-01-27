package com.xworkz.homepage.controller;

import com.xworkz.homepage.dao.InsertPageDAO;
import com.xworkz.homepage.dto.HomepageDTO;
import com.xworkz.homepage.exception.InvalidException;
import com.xworkz.homepage.service.HomepageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class HomepageController {
    public HomepageController(){
        System.out.println("HomepageController is Called");
    }
    @Autowired
    private HomepageService homepageService;
    private HomepageDTO homepageDTO;

//    @PostMapping("/status")
//    public String status(HomepageDTO homepageDTO ){
//        System.out.println("FirstName is : " + homepageDTO.getFirstName() + "LastName is : " + homepageDTO.getLastName()
//        + "Email-id is : " + homepageDTO.getEmail() + "Password is : " + homepageDTO.getPassword() + "Confirm password : " + homepageDTO.getConfirmpassword());
//        return  "signin";
//
//    }
    @PostMapping("/signin")
    public String signin() {
        System.out.println("Signin page loaded");
        return "signin";
    }
    @PostMapping("/signup")
    public String signup() {
        System.out.println("Signup page loaded");
        return "signup";
    }


    @PostMapping("/home")
    public String home() {
        System.out.println("Signin page loaded");
        return "home";
    }

    @PostMapping("/status")
    public String signupStatus(HomepageDTO homepageDTO){

        boolean success=homepageService.signupValidate(homepageDTO);
        if(success){
            return "Success";
        }else{
            return "Failed to Signup";
        }
//        return "signup";
    }


    @PostMapping("/login")
    public String login(String email,String password){
        try {
            boolean isLogin=homepageService.signinValidation(email,password);
            System.out.println("Login successfull");
            return "home";
        }catch (InvalidException e){
            System.out.println("Login failed to enter");
            return "signin";
        }
    }
}
