package com.xworkz.rapido.configure;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.rapido")
public class WebConfiguration {
    public WebConfiguration(){
        System.out.println("IS being called the WebConfiguration");
    }
}
