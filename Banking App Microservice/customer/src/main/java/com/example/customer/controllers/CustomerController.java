package com.example.customer.controllers;

import com.example.customer.models.CreditCardList;
import com.example.customer.models.Customer;
import com.example.customer.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@RestController
public class CustomerController  {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    WebClient.Builder webClientBuilder;

    @Autowired
    CustomerService customerService;

    @GetMapping("/customer")
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    @GetMapping("/customer/{id}")
    public Customer getCustomerById(@PathVariable("id") Long customerId){
        return customerService.getCustomerById(customerId);
    }

    @PostMapping("/customer")
    public String insertCustomer(@RequestBody Customer customer){
        return customerService.insertCustomer(customer);
    }

    @PutMapping("/customer")
    public Customer updateCustomer(@RequestBody Customer customer){
        return customerService.updateCustomer(customer);
    }

    @DeleteMapping("/customer/{id}")
    public String deleteCustomer(@PathVariable("id") Long customerId){
        return customerService.deleteCustomer(customerId);
    }

    @GetMapping("/customer-details")
    public CreditCardList fetchDetailsWithCreditInfo(){
        /*
        Alternative WebClient way
         return webClientBuilder.build().get().uri("http://credit-card-service/credit-card")
        .retrieve().bodyToMono(CreditCardList.class).block();
        */
       return restTemplate.getForObject("http://credit-card-service/credit-card", CreditCardList.class);
    }

}
