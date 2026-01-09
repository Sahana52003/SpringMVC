package com.xworkz.whatsapp.configure;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.whatsapp")
public class WebConfiguration {
    public WebConfiguration(){
        System.out.println("WebConfigure is Called");
    }
}
