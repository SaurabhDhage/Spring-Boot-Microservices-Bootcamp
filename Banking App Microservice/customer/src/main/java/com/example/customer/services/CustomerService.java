package com.example.customer.services;

import com.example.customer.models.Customer;

import java.util.List;


public interface CustomerService {

    List<Customer> getAllCustomers();

    Customer getCustomerById(Long customerId);

    String insertCustomer(Customer customer);

    Customer updateCustomer(Customer customer);

    String deleteCustomer(Long customerId);
}
