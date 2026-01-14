package com.xworkz.games.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan("com.xworkz.games")
public class WebConfiguration {
    public WebConfiguration(){
        System.out.println("WebConfiguration is called");
    }
}
