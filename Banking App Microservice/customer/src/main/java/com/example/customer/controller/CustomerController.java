package com.example.customer.controller;

import com.example.customer.config.CreditCardClient;
import com.example.customer.exception.CustomerNotFound;
import com.example.customer.dao.CreditCardList;
import com.example.customer.model.Customer;
import com.example.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import javax.validation.Valid;
import java.util.List;

@RestController
public class CustomerController  {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    WebClient.Builder webClientBuilder; //web client

    @Autowired
    private CreditCardClient creditCardClient; //feign client

    @Autowired
    CustomerService customerService;

    @GetMapping("/customer")
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    @GetMapping("/customer/{id}")
    public Customer getCustomerById(@PathVariable("id") Long customerId) throws CustomerNotFound {
        return customerService.getCustomerById(customerId);
    }

    @PostMapping("/customer")
    public String insertCustomer(@RequestBody @Valid Customer customer){
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

       return creditCardClient.fetchDetailsWithCreditInfoFromClient();
       //return restTemplate.getForObject("http://credit-card-service/credit-card", CreditCardList.class);
    }

}
