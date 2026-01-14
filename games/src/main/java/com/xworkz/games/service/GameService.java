package com.xworkz.games.service;

import org.springframework.stereotype.Service;

@Service
public class GameService implements GameInterface {

    @Override
    public void played() {
            System.out.println("Players are played well");
    }
}
