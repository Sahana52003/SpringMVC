package com.xworkz.bakery.service;

import com.xworkz.bakery.dto.BakeryDTO;

public class BakeryService {
    public boolean validateAndSave(BakeryDTO dto) {

        if (dto == null) {
            System.out.println("DTO is null");
            return false;
        }

        // name
        if (dto.getName() == null || dto.getName().trim().length() < 3) {
            System.out.println("Invalid name");
            return false;
        }

        // cost
        if (dto.getCost() <= 0) {
            System.out.println("Invalid cost");
            return false;
        }

        // mobileNumber (10 digits)
        if (dto.getMobileNumber() == null ||
                dto.getMobileNumber().toString().length() != 10) {
            System.out.println("Invalid mobile number");
            return false;
        }

        // color
        if (dto.getColor() == null || dto.getColor().isEmpty()) {
            System.out.println("Invalid color");
            return false;
        }

        // isDelivered (boolean – always valid, no check needed)
        System.out.println("Delivered: " + dto.isDelivered());

        // code
        if (dto.getCode() == null || dto.getCode().isEmpty()) {
            System.out.println("Invalid code");
            return false;
        }

        // value
        if (dto.getValue() <= 0) {
            System.out.println("Invalid value");
            return false;
        }

        // idNumber
        if (dto.getIdNumber() == null || dto.getIdNumber() <= 0) {
            System.out.println("Invalid ID number");
            return false;
        }

        // comments
        if (dto.getComments() == null || dto.getComments().length() < 5) {
            System.out.println("Invalid comments");
            return false;
        }

        // ratings (1–5)
        if (dto.getRatings() < 1 || dto.getRatings() > 5) {
            System.out.println("Invalid ratings");
            return false;
        }

        System.out.println("All validations passed");
        return true; // call repository.save(dto) here
    }
}
