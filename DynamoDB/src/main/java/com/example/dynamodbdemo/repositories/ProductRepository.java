package com.example.dynamodbdemo.repositories;

import com.example.dynamodbdemo.models.ProductInfo;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface ProductRepository extends CrudRepository<ProductInfo,String> {}
