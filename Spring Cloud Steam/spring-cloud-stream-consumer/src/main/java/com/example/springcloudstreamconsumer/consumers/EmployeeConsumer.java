package com.example.springcloudstreamconsumer.consumers;


import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;


@EnableBinding(Sink.class)
public class EmployeeConsumer{

    @StreamListener(target = Sink.INPUT)
    public void processRegisterEmployees(String employee) {
        System.out.println("Employees Registered by Client " + employee);
    }
}

