package com.xworkz.bakery.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.bakery")
public class WebConfiguration {
    public WebConfiguration(){
        System.out.println("WebConfiguration is Called");
    }


    @Bean
    public ViewResolver validate(){
        System.out.println("validate method is called");
        return new InternalResourceViewResolver("",".jsp");
    }
}
