package com.example.customer.service;

import com.example.customer.exception.CustomerNotFound;
import com.example.customer.model.Customer;

import java.util.List;


public interface CustomerService {

    List<Customer> getAllCustomers();

    Customer getCustomerById(Long customerId) throws CustomerNotFound;

    String insertCustomer(Customer customer);

    Customer updateCustomer(Customer customer);

    String deleteCustomer(Long customerId);
}
