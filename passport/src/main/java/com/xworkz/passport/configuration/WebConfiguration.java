package com.xworkz.passport.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.passport")
public class WebConfiguration {
    public WebConfiguration(){
        System.out.println("WebConfiguration is called");
    }


    @Bean
    public ViewResolver status(){
        System.out.println("Status method is called");
        return new InternalResourceViewResolver("",".jsp");
    }
}
