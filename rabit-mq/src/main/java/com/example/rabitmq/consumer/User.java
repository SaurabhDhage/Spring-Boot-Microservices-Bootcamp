package com.example.rabitmq.consumer;

import com.example.rabitmq.constant.CommonConstant;
import com.example.rabitmq.model.OrderStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;


@Component
public class User {
     private static final Logger logger= LoggerFactory.getLogger(User.class);

    @RabbitListener(queues = CommonConstant.QUEUE)
    public void consumeMessageFromQueue(OrderStatus orderStatus){
        logger.info("consumed message [{}]",orderStatus);
    }
}
