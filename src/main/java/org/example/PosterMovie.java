package org.example;

public class PosterMovie {
    private int movieId;
    private String movieName;
    private String ganre;

    public PosterMovie(int movieId, String movieName, String ganre) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.ganre = ganre;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getGanre() {
        return ganre;
    }

    public void setGanre(String ganre) {
        this.ganre = ganre;
    }




    }

