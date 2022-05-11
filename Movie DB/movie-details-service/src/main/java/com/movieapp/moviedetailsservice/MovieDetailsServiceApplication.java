package com.movieapp.moviedetailsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MovieDetailsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieDetailsServiceApplication.class, args);
	}

}
