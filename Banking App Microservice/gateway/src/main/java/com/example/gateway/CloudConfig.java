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
                .route("1",r ->
                        r.path("/**")
                         .uri("lb://CREDIT-CARD-SERVICE")
                )

                .route("1",r ->
                        r.path("/**")
                          .uri("lb://CUSTOMER-SERVICE")
                )
                .build();
    }
}