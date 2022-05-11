package com.movieapp.moviecatalogservice.models;

public class MovieRatingInfo {
    private String movieId;
    private int rating;

    public MovieRatingInfo(String movieId, int rating) {
        this.movieId = movieId;
        this.rating = rating;
    }

    public MovieRatingInfo() {
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
