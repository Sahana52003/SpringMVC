package com.xworkz.car.dto;

public class CarDTO {
    private int id;
    private String carName;
    private Long phoneNumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public CarDTO(int id, String carName, Long phoneNumber) {
        this.id = id;
        this.carName = carName;
        this.phoneNumber = phoneNumber;
    }
}
