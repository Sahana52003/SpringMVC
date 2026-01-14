package com.xworkz.games.controller;


import com.xworkz.games.dto.GameDTO;
import com.xworkz.games.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class GameController {
    public GameController(){
        System.out.println("GameController is Calling");
    }


    @Autowired
    GameDTO GameDTO;

    @Autowired
    GameService gameService;

    @GetMapping("/start")
    public String start(@RequestParam String email){
        gameService.played();
        System.out.println("Started to play"+email);

        return "index.jsp";
    }
}
