package com.xworkz.bicycle.dto;

public class BicycleDTO {
    private int id;
    private String bicycleName;
    private double cost;

    public BicycleDTO(int id, String bicycleName, double cost) {
        this.id = id;
        this.bicycleName = bicycleName;
        this.cost = cost;
    }

    public BicycleDTO() {
        System.out.println("Calling Bicycle DTO's");
    }
}
