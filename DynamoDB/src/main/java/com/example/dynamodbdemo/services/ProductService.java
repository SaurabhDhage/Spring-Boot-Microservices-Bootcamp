package com.example.dynamodbdemo.services;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBSaveExpression;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBScanExpression;
import com.amazonaws.services.dynamodbv2.datamodeling.PaginatedScanList;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ExpectedAttributeValue;
import com.example.dynamodbdemo.models.ProductInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {


    @Autowired
    private DynamoDBMapper dynamoDBMapper;
    
    public PaginatedScanList<ProductInfo> getAllProductInfo() {
    

    	DynamoDBScanExpression scanExpression = new DynamoDBScanExpression();

    	// Change to your model class   
    	PaginatedScanList<ProductInfo> scanResult =dynamoDBMapper.scan(ProductInfo.class, scanExpression);
        return scanResult;
    
    }
    public ProductInfo saveProduct(ProductInfo productInfo) {
        dynamoDBMapper.save(productInfo);
        return productInfo;
    }
    public ProductInfo getProductById(String id){
        return dynamoDBMapper.load(ProductInfo.class,id);
    }
    public String deleteProduct(String id){
         ProductInfo productInfo=dynamoDBMapper.load(ProductInfo.class,id);
         dynamoDBMapper.delete(productInfo);
         return "Product Deleted Successfully";
    }
    public ProductInfo updateProduct(String id,ProductInfo productInfo){
        DynamoDBSaveExpression dynamoDBSaveExpression=new DynamoDBSaveExpression()
                .withExpectedEntry("id",new ExpectedAttributeValue(
                   new AttributeValue().withS(id)
                ));
        dynamoDBMapper.save(productInfo,dynamoDBSaveExpression);
        return dynamoDBMapper.load(ProductInfo.class,id);
    }
}
