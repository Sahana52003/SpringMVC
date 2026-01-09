package com.xworkz.game.configuration;


import com.xworkz.game.dto.GameDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.game")
public class WebConfiguration {
    public WebConfiguration(){
        System.out.println("WebConfiguration is Created");
    }

    @Bean
    public GameDTO game(){
        System.out.println("Calling Game class");
        return new GameDTO();
    }
}
