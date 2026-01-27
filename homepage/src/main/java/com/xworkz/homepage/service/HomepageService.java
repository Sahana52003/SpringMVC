package com.xworkz.homepage.service;

import com.xworkz.homepage.dao.HomepageDAO;
import com.xworkz.homepage.dao.InsertPageDAO;
import com.xworkz.homepage.dto.HomepageDTO;
import com.xworkz.homepage.exception.InvalidException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HomepageService {
    @Autowired
    private InsertPageDAO insertPageDAO;
    @Autowired
    HomepageDAO homepageDAO;

    public boolean signupValidate(HomepageDTO homepageDTO) {
        if (homepageDTO.getFirstName() != null && homepageDTO.getFirstName().length() >= 3 && homepageDTO.getFirstName().length() <= 10
                && homepageDTO.getLastName() != null && homepageDTO.getEmail() != null && homepageDTO.getEmail().length() >= 7 && homepageDTO.getEmail().length() <= 16 && homepageDTO.getEmail().contains("@gmail.com") &&
                homepageDTO.getPassword() != null && homepageDTO.getPassword().length() >= 6
                && homepageDTO.getPassword().equals(homepageDTO.getConfirmpassword())) {
            insertPageDAO.validateHomePage(homepageDTO);
            return true;
        } else {
            throw new InvalidException("Invalid Signup Data");
        }
    }

    public boolean signinValidation(String email, String password) {

        if (email == null || email.isEmpty() || password == null || password.isEmpty()) {
            throw new InvalidException("Email or password cannot be empty");
        }

        String storedPassword = homepageDAO.dataEntered(email);

        if (storedPassword == null) {
            throw new InvalidException("Email not found");
        }

        if (!storedPassword.equals(password)) {
            throw new InvalidException("Password mismatch");
        }
        return true;
    }
}