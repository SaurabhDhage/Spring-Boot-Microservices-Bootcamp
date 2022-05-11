package com.example.dynamodbdemo.config;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DynamoDBConfig {

    @Value("${amazon.dynamodb.endpoint}")
    private String amazonDynamoDBEndpoint;

    @Value("${amazon.aws.accesskey}")
    private String amazonAWSAccessKey;

    @Value("${amazon.aws.secretkey}")
    private String amazonAWSSecretKey;

    @Value("${amazon.aws.region}")
    private String amazonAWSRegion;


    @Bean
    public AmazonDynamoDB amazonDynamoDB() {

        return AmazonDynamoDBClientBuilder.standard()
                .withEndpointConfiguration(
                        new AwsClientBuilder.EndpointConfiguration(amazonDynamoDBEndpoint, amazonAWSRegion))// serviceendpoint,region
                .withCredentials(new AWSStaticCredentialsProvider(
                        new BasicAWSCredentials(amazonAWSAccessKey, amazonAWSSecretKey)))
                .build();
    }
}