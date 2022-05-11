package com.example.dynamodbdemo.controller;

import com.amazonaws.services.dynamodbv2.datamodeling.PaginatedScanList;
import com.example.dynamodbdemo.models.ProductInfo;
import com.example.dynamodbdemo.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class  ProductController {

    @Autowired
    ProductService productService;
      
    @GetMapping("/products")
    public PaginatedScanList<ProductInfo> getProductsInfo(){
          return productService.getAllProductInfo();
    }
    @GetMapping("/products/{id}")
    public ProductInfo getProductById(@PathVariable("id") String id){
        return productService.getProductById(id);
    }
    @PostMapping("/products")
    public ProductInfo saveProduct(@RequestBody ProductInfo productInfo){
        return productService.saveProduct(productInfo);
    }
    @DeleteMapping("/products/{id}")
    public String deleteProduct(@PathVariable("id") String id){
        return productService.deleteProduct(id);
    }
    @PutMapping("/products/{id}")
    public ProductInfo updateProduct(@PathVariable("id") String id,@RequestBody ProductInfo productInfo){
        return productService.updateProduct(id,productInfo);
    }
}
