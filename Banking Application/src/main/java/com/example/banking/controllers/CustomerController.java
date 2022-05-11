package com.example.banking.controllers;

import com.example.banking.models.Customer;
import com.example.banking.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/customer",method = RequestMethod.GET)
    List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }
    @RequestMapping(value = "/customer/{id}",method = RequestMethod.GET)
    Customer getCustomerById(@PathVariable int id){
        return customerService.getCustomerById(id);
    }

    @RequestMapping(value = "/customer",method = RequestMethod.POST)
    void saveCustomer(@RequestBody Customer customer){
        customerService.saveCustomer(customer);
    }


    @RequestMapping(value = "/customer",method = RequestMethod.PUT)
    void updateCustomer(@RequestBody Customer customer){
        customerService.updateCustomer(customer);
    }

    @RequestMapping(value = "/customer/{id}",method = RequestMethod.DELETE)
    void removeCustomer(@PathVariable int id){
        customerService.removeCustomer(id);
    }
}
