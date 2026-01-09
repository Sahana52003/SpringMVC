package com.xworkz.movies.configuration;

import com.xworkz.movies.dto.MovieDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan("com.xworkz.movies")
public class WebConfiguration {
    public WebConfiguration(){
        System.out.println("Calling WebConfigurer");
    }

    @Bean
    public MovieDTO movie(){
        System.out.println("Calling Dto class");
        return new MovieDTO();
    }
}
