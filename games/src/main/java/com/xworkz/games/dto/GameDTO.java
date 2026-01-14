package com.xworkz.games.dto;

import org.springframework.stereotype.Component;

@Component
public class GameDTO {
    private int id;
    private String gameName;
    private String noOfPlayers;

    public GameDTO(int id, String gameName, String noOfPlayers) {
        this.id = id;
        this.gameName = gameName;
        this.noOfPlayers = noOfPlayers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getNoOfPlayers() {
        return noOfPlayers;
    }

    public void setNoOfPlayers(String noOfPlayers) {
        this.noOfPlayers = noOfPlayers;
    }

    public GameDTO() {
        System.out.println("GameDTO is Calling");
    }
}
