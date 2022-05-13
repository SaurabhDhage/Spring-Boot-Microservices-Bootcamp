package com.example.customer.service.impl;

import com.example.customer.exception.CustomerNotFound;
import com.example.customer.model.Customer;
import com.example.customer.repository.CustomerRepository;
import com.example.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public List<Customer> getAllCustomers() {
       List<Customer> customerList=new ArrayList<>();
       customerRepository.findAll().forEach(customerList::add);
       return customerList;
    }

    @Override
    public Customer getCustomerById(Long customerId) throws CustomerNotFound {
        Optional<Customer> customer = customerRepository.findById(customerId);
        return customer.orElseThrow(()-> new CustomerNotFound("Customer not present in DB"));
    }

    @Override
    public String insertCustomer(Customer customer) {
        customerRepository.save(customer);
        return "Customer inserted successfully!";
    }

    @Override
    public Customer updateCustomer(Customer updatedCustomer) {
        Optional<Customer> customerOptional = customerRepository.findById(updatedCustomer.getCustomerId());
      if(!customerOptional.isPresent()) return null;
          Customer customer=customerOptional.get();
          customer.setAccountNumber(updatedCustomer.getAccountNumber());
          customer.setCardNumber(updatedCustomer.getCardNumber());
          customer.setCustomerId(updatedCustomer.getCustomerId());
          customer.setCustomerName(updatedCustomer.getCustomerName());
          customerRepository.save(customer);
        return customer;
    }

    @Override
    public String deleteCustomer(Long customerId) {
        Optional<Customer> customer=customerRepository.findById(customerId);
        if(customer.isPresent()){
            customerRepository.delete(customer.get());
            return "Customer deleted successfully!";
        }
       else  return "Customer Not Found!";
    }
}
