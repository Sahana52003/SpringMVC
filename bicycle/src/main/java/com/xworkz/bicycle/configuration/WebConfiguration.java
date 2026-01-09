package com.xworkz.bicycle.configuration;


import com.xworkz.bicycle.dto.BicycleDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.bicycle")
public class WebConfiguration {
    public WebConfiguration(){
        System.out.println("Calling WebConfiguration");
    }

    @Bean
    public BicycleDTO bicycle(){
        System.out.println("Calling bicycle");
        return new BicycleDTO();
    }
}
