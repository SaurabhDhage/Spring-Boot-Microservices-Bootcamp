package com.movieapp.moviedetailsservice.controllers;

import com.movieapp.moviedetailsservice.models.MovieInfo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieDetailsController {
    @RequestMapping("/{movieId}")
    public List<MovieInfo> getMovieDetails(@PathVariable("movieId") String movieId){
        return Collections.singletonList(new MovieInfo("foo","Avengers"));
    }
}
