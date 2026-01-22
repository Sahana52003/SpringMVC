package com.xworkz.passport.service;

import com.xworkz.passport.dto.PassportDTO;

public class PassportImp implements PassportService{
    @Override
    public boolean pageStatus(PassportDTO dto) {

        if (dto == null) {
            return false;
        }

        boolean validName =
                dto.getName() != null &&
                        dto.getName().length() > 3 &&
                        dto.getName().length() <= 20;

        boolean validEmail =
                dto.getEmail() != null &&
                        dto.getEmail().contains("@") &&
                        dto.getEmail().contains(".");

        boolean validPassword =
                dto.getPassword() >= 1000 &&
                        dto.getPassword() <= 999999;

        boolean validPhone =
                dto.getPhoneNumber() != null &&
                        String.valueOf(dto.getPhoneNumber()).length() == 10;

        boolean validGender =
                dto.getGender() != null &&
                        !dto.getGender().isEmpty();

        boolean validNationality =
                dto.getNationality() != null &&
                        !dto.getNationality().isEmpty();

        boolean validAddress =
                dto.getAddress() != null &&
                        !dto.getAddress().isEmpty();

        boolean validCountry =
                dto.getCountry() != null &&
                        !dto.getCountry().isEmpty();

        boolean validPincode =
                dto.getPincode() >= 100000 &&
                        dto.getPincode() <= 999999;

        boolean validState =
                dto.getState() != null &&
                        !dto.getState().isEmpty();

        return validName &&
                validEmail &&
                validPassword &&
                validPhone &&
                validGender &&
                validNationality &&
                validAddress &&
                validCountry &&
                validPincode &&
                validState;
    }
}