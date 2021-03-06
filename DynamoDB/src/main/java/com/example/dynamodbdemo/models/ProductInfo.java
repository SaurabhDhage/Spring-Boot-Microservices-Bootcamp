package com.example.dynamodbdemo.models;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "product_info")
public class ProductInfo {
    @DynamoDBHashKey
    @DynamoDBAutoGeneratedKey
    private String id;

    @DynamoDBAttribute
    private String msrp;

    @DynamoDBAttribute
    private String cost;

    public ProductInfo() {}
    
    public ProductInfo(String expectedCost, String expectedPrice) {
        cost=expectedCost;
        msrp=expectedPrice;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMsrp() {
        return msrp;
    }
    
    public void setMsrp(String msrp) {
        this.msrp = msrp;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
}
