package com.xworkz.chatbox.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.chatbox")
public class WebConfiguration {
    public WebConfiguration(){
        System.out.println("WebConfiguration is Calling");
    }
}
