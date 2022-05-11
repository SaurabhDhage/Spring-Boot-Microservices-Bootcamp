package com.movieapp.movieratingservice.controllers;

import com.movieapp.movieratingservice.models.MovieRatingInfo;
import com.movieapp.movieratingservice.models.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/movies-rating")
public class MovieRatingController {
    @RequestMapping("/{movieId}")
    public MovieRatingInfo getRating(@PathVariable("movieId") String movieId){
        return new MovieRatingInfo("foo",4);
    }

    @RequestMapping("users/{userId}")
    public UserRating getRatingInfo(@PathVariable("userId") String userId){
       List<MovieRatingInfo> ratingInfo= Arrays.asList(
                new MovieRatingInfo("1234",4),
                new MovieRatingInfo("2334",2),
                new MovieRatingInfo("4434",3),
                new MovieRatingInfo("1111",1),
                new MovieRatingInfo("2222",5)
        );
        UserRating rating=new UserRating();
        rating.setRatingInfoList(ratingInfo);

        return rating;
    }

}
