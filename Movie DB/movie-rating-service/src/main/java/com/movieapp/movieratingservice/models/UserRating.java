package com.movieapp.movieratingservice.models;

import java.util.List;

public class UserRating {
    private List<MovieRatingInfo> ratingInfoList;

    public List<MovieRatingInfo> getRatingInfoList() {
        return ratingInfoList;
    }

    public UserRating() {
    }

    public void setRatingInfoList(List<MovieRatingInfo> ratingInfoList) {
        this.ratingInfoList = ratingInfoList;
    }
}
