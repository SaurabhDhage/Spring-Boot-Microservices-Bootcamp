package com.javatechie.aws.lambda.controller;

import com.javatechie.aws.lambda.domain.Order;
import com.javatechie.aws.lambda.respository.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private OrderDao orderDao;

    @GetMapping("/orders")
    public List<Order> getOrders(){
        return orderDao.buildOrders();
    }

    @PostMapping("/orders")
    public List<Order> postOrders(){
        return orderDao.buildOrders();
    }
}
