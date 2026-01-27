package com.xworkz.homepage.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.homepage")

public class WebConfiguration implements WebMvcConfigurer {
    public WebConfiguration(){
        System.out.println("WebConfiguration is Called");
    }


    @Bean
    public ViewResolver login(){

        return new InternalResourceViewResolver("",".jsp");

    }
}
