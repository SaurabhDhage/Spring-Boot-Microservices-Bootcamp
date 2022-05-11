package com.example.redisdb.repository;

import com.example.redisdb.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository
//public class ProductRepository{
//    public static final String HASH_KEY = "Product";
//
//    @Autowired
//    RedisTemplate redisTemplate;
//
//    public Product save(Product product){
//        redisTemplate.opsForHash().put(HASH_KEY,product.getId(),product);
//        return product;
//    }
//
//    public List<Product> getAllProducts(){
//        return redisTemplate.opsForHash().values(HASH_KEY);
//    }
//
//    public Product findProductById(int id){
//        return (Product) redisTemplate.opsForHash().get(HASH_KEY,id);
//    }
//    public String deleteProduct(int id){
//        redisTemplate.opsForHash().delete(HASH_KEY,id);
//        return "Product remove successfully";
//    }
//}
 public interface ProductRepository extends CrudRepository<Product,Integer>{}