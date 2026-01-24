package com.xworkz.homepage.service;

import com.xworkz.homepage.dto.HomepageDTO;

public class HomepageService {
    public boolean validate(HomepageDTO homepageDTO){
        if (homepageDTO.getFirstName().length()>=5&&homepageDTO.getFirstName().length()<=10){
            System.out.println("Enter a valid Name");
            return false;
        }
        if(homepageDTO.getLastName().length()>=2&&homepageDTO.getLastName().length()<=3){
            System.out.println("Enter a correct Initial Name");
            return false;
        }
        if (homepageDTO.getEmail().length()>=15&&homepageDTO.getEmail().contains("@gmail.com")){
            System.out.println("Enter a valid Email-Id");
            return false;
        }
        if(homepageDTO.getPassword().length()>=10){
            System.out.println("Enter a valid password");
            return false;
        }
        if (homepageDTO.getPassword().equals(homepageDTO.getConfirmpassword())){
            System.out.println("Enter a confirm password");
            return false;
        }
        return true;
    }
}
