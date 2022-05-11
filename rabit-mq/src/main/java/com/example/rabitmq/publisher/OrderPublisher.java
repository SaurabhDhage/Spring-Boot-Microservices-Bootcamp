package com.example.rabitmq.publisher;

import com.example.rabitmq.config.MessagingConfig;
import com.example.rabitmq.constant.CommonConstant;
import com.example.rabitmq.model.Order;
import com.example.rabitmq.model.OrderStatus;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/order")
public class OrderPublisher {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @PostMapping("/{restaurantName}")
    public String bookOrder(@RequestBody Order order, @PathVariable String restaurantName){
        order.setOrderId(UUID.randomUUID().toString());
        //restaurant service
        //payment service
        OrderStatus orderStatus=new OrderStatus(order,"PROGRESS","order placed successfully in "+restaurantName);
        rabbitTemplate.convertAndSend(CommonConstant.EXCHANGE,CommonConstant.ROUTING_KEY,orderStatus);
        return "Success !";
    }
}
