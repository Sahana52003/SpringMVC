package com.xworkz.drone.configuration;


import com.xworkz.drone.dto.DroneDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.drone")
public class WebConfiguration {
    public WebConfiguration(){
        System.out.println("WebConfiguration is Created");
    }

@Autowired
private DroneDTO droneDTO;
@Bean
    public String DroneDTO(){
        droneDTO.start();
        System.out.println("Calling DroneDTO"+droneDTO.getName());
        return "null";
    }
}
