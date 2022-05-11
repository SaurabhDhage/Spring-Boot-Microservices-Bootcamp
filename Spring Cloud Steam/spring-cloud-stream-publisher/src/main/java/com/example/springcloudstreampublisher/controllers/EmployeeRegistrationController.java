package com.example.springcloudstreampublisher.controllers;

import com.example.springcloudstreampublisher.models.Employee;
import com.example.springcloudstreampublisher.source.EmployeeRegistrationSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableBinding(EmployeeRegistrationSource.class)
public class EmployeeRegistrationController {

    @Autowired
    EmployeeRegistrationSource employeeRegistrationSource;

    @PostMapping("/register")
    public String orderFood(@RequestBody Employee employee) {
        employeeRegistrationSource.employeeRegistration().send(MessageBuilder.withPayload(employee).build());
        System.out.println(employee.toString());
        return "Employee Registered";
    }
}
