package com.xworkz.game.dto;

public class GameDTO {
    private int gameId;
    private String gameName;
    private String noOfPlayers;

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
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

    public GameDTO(int gameId, String gameName, String noOfPlayers) {
        this.gameId = gameId;
        this.gameName = gameName;
        this.noOfPlayers = noOfPlayers;
    }
}
