package com.xworkz.game.dto;

public class GameDTO {
    private int gameId;
    private String gameName;
    private int noOfPlayers;

    public GameDTO(int gameId, String gameName, int noOfPlayers) {
        this.gameId = gameId;
        this.gameName = gameName;
        this.noOfPlayers = noOfPlayers;
    }

    public GameDTO() {
        System.out.println("Calling all DTO's of Game");
    }
}
