package com.xworkz.homepage.controller;

import com.xworkz.homepage.dao.InsertPageDAO;
import com.xworkz.homepage.dto.HomepageDTO;
import com.xworkz.homepage.exception.InvalidException;
import com.xworkz.homepage.service.HomepageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class HomepageController {
    public HomepageController() {
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
    public String signupStatus(HomepageDTO homepageDTO) {
        try {
            boolean success = homepageService.signupValidate(homepageDTO);
            System.out.println("Signup successfully");
            return "success";
        } catch (InvalidException obj) {
            System.out.println("Failed to signup");
            return "signup";
        }
    }


    @PostMapping("/login")
    public String login(@RequestParam String email,
                        @RequestParam String password) {
        try {
            boolean isLogin = homepageService.signinValidation(email, password);
            System.out.println("Login successful");
            return "home"; // goes to home.jsp if login successful
        } catch (InvalidException e) {
            System.out.println("Login failed: " + e.getMessage());
            // Pass error message to JSP
            System.out.println("loginError" + "Invalid Email or Password");
            return "signin"; // render signin.jsp again
        }
    }
}
