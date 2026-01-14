package com.xworkz.notification.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.notification")
public class WebConfiguration {
    public WebConfiguration(){
        System.out.println("WebConfiguration is Calling");
    }
}
