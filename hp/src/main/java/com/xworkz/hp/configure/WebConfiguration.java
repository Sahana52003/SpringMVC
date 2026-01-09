package com.xworkz.hp.configure;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.hp")
public class WebConfiguration {
    public WebConfiguration(){
        System.out.println("WEbConfiguration is called");
    }
}
