package com.xworkz.bakery.service;

import com.xworkz.bakery.dto.BakeryDTO;

public class BakeryService {
    public boolean validateAndSave(BakeryDTO dto) {

        if (dto == null) {
            System.out.println("DTO is null");
            return false;
        }


        if (dto.getName() == null || dto.getName().trim().length() < 3) {
            System.out.println("Invalid name");
            return false;
        }


        if (dto.getCost() <= 0) {
            System.out.println("Invalid cost");
            return false;
        }


        if (dto.getMobileNumber() == null ||
                dto.getMobileNumber().toString().length() != 10) {
            System.out.println("Invalid mobile number");
            return false;
        }

        if (dto.getColor() == null || dto.getColor().isEmpty()) {
            System.out.println("Invalid color");
            return false;
        }

        System.out.println("Delivered: " + dto.isDelivered());

        if (dto.getCode() == null || dto.getCode().isEmpty()) {
            System.out.println("Invalid code");
            return false;
        }

        if (dto.getValue() <= 0) {
            System.out.println("Invalid value");
            return false;
        }

        if (dto.getIdNumber() == null || dto.getIdNumber() <= 0) {
            System.out.println("Invalid ID number");
            return false;
        }

        if (dto.getComments() == null || dto.getComments().length() < 5) {
            System.out.println("Invalid comments");
            return false;
        }

        if (dto.getRatings() < 1 || dto.getRatings() > 5) {
            System.out.println("Invalid ratings");
            return false;
        }

        System.out.println("All validations passed");
        return true;
    }
}
