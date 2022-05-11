package com.example.dynamodbdemo;

import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDynamoDBRepositories

public class DynamoDbDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DynamoDbDemoApplication.class, args);
	}

}
