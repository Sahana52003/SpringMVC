package com.xworkz.passport.controller;

import com.xworkz.passport.dto.PassportDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PassportController {
    public PassportController(){
        System.out.println("PassportController is called");
    }
//field Injection
//    @Autowired
//    private PassportDTO passportDTO;


//    //constructor injection
//    private PassportDTO passportDTO;
//     @Autowired
//     public void  success(PassportDTO passportDTO){
//         this.passportDTO=passportDTO;
//         System.out.println("Called Success");
//     }

    //Setter Injection
    private PassportDTO passportDTO;


    @PostMapping("login")
    public String login(PassportDTO passportDTO){
        //passportDTO.verify();
//        passportDTO.getName();
//        passportDTO.getPassword();
        System.out.println(" mobile Number is " +  passportDTO.getPhoneNumber()+ "Has been login and verified name "
                + passportDTO.getName() +
                "email " + passportDTO.getEmail() + "password " + passportDTO.getPassword() +
                " gender " + passportDTO.getGender() +
                " nationality " + passportDTO.getNationality()
        + "address " + passportDTO.getAddress() + "country " + passportDTO.getCountry() +
                "pincode " + passportDTO.getPincode() + "state " + passportDTO.getState());
        return "passport";
    }
}
