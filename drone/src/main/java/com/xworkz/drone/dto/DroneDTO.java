package com.xworkz.drone.dto;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DroneDTO {
    private int id;
    @Value("Caller")
    private String name;
    private Double cost;

    public DroneDTO(int id, String name, Double cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }
    public DroneDTO(){
        System.out.println("Calling DroneDTO class");
    }
    public void start(){
        System.out.println("Get;s to start");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }
}
