package com.xworkz.car.configuration;


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

    @Bean
    public String DroneDTO(){
        System.out.println("Calling DroneDTO");
        return "null";
    }
}
