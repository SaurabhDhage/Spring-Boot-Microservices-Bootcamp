package com.example.redisdb.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@Data
@NoArgsConstructor
@RedisHash("Product")
public class Product implements Serializable {
    private Integer id;
    private String name;
    private Integer qty;
    private Long price;
}
