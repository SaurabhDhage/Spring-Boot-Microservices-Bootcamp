package com.example.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CloudConfig {

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder){
        return builder.routes()
                .route(r->
                        r.path("/customer/**")
                        .uri("http://localhost:8081")
                        )
                .route( r->
                        r.path("/credit-card/**")
                        .uri("http://localhost:8082")
                        )
                .build();
    }
}