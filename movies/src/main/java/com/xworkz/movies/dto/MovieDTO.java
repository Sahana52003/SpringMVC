package com.xworkz.movies.dto;

public class MovieDTO {
    private int movieId;
    private String movieName;
    private String heroName;
    private double ticket;
    private String movieDirector;

    public MovieDTO(int movieId, String movieName, String heroName, double ticket, String movieDirector) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.heroName = heroName;
        this.ticket = ticket;
        this.movieDirector = movieDirector;
    }

    public MovieDTO() {
        System.out.println("Calling Movie DTO class");
    }
}
