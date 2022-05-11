package com.example.redisdb.controller;

import com.example.redisdb.models.Product;
import com.example.redisdb.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@EnableCaching
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping("/products/{id}")
    @Cacheable(key = "#id",value = "Product",unless = "#result.price < 4000")
    public Product getProduct(@PathVariable Integer id){
       // return productRepository.findProductById(id);
      return productRepository.findById(id).get();
    }

    @GetMapping("/products") // for put mapping can use CachePut
    public List<Product> getAllProduct(){
       // return productRepository.getAllProducts();
       return (List<Product>) productRepository.findAll();
    }

    @PostMapping("/products")
    public Product saveProduct(@RequestBody Product product){
        return productRepository.save(product);
    }

    @DeleteMapping("/products/{id}")
    @CacheEvict(key = "#id",value = "Product")
    public String deleteProduct(@PathVariable Integer id){
       // return productRepository.deleteProduct(id);
      productRepository.deleteById(id);
      return "Delete Successful";
    }
}
