package com.movieapp.moviecatalogservice.controllers;

import com.movieapp.moviecatalogservice.models.Catalog;
import com.movieapp.moviecatalogservice.models.MovieInfo;
import com.movieapp.moviecatalogservice.models.MovieRatingInfo;
import com.movieapp.moviecatalogservice.models.UserRating;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogController {
    public static final String MOVIE_SERVICE="movieCatalogService";

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/{userId}")
    //@Retry(name = MOVIE_SERVICE,fallbackMethod = "getDummyCatalog")
    @CircuitBreaker(name = MOVIE_SERVICE,fallbackMethod = "getDummyCatalog")
    public List<Catalog> getCatalog(@PathVariable("userId") String userId){

       UserRating ratings= restTemplate.getForObject("http://movie-rating-service/movies-rating/users/"+userId
               , UserRating.class);
        List<MovieRatingInfo> ratingInfos= Objects.requireNonNull(ratings).getRatingInfoList();
        return ratingInfos.stream().map(rating->{

            MovieInfo[] movie = restTemplate.getForObject("http://movie-details-service/movies/" + rating.getMovieId(), MovieInfo[].class);
            assert movie != null;
            return  new Catalog(movie[0].getName(),"test",rating.getRating());

    }).collect(Collectors.toList());
    }

    public List<Catalog> getDummyCatalog(Exception e){
       return Arrays.asList(
               new Catalog("dummy","dummy",0),
               new Catalog("dummy","dummy",1),
              new Catalog("dummy","dummy",2),
              new Catalog("dummy","dummy",3)
       );
    }
}
