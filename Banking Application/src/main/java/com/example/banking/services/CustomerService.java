package com.example.banking.services;

import com.example.banking.models.Customer;
import com.example.banking.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

//    public CustomerService(){
//        System.out.println("Service layer is created ");
//        customerList.add(new Customer(1,"Saurabh"));
//
//        customerList.add(new Customer(2,"Asmita"));
//        customerList.add(new Customer(3,"Akash"));
//        customerList.add(new Customer(4,"Sahil"));
//        customerList.add(new Customer(5,"Rahul"));
//
//
//
//    }
    public List<Customer> getAllCustomers(){
        List<Customer> customerList=new ArrayList<>();
        customerRepository.findAll().forEach(customerList::add);
        return customerList;
    }
    public Customer getCustomerById(int id){
        Optional<Customer> op=customerRepository.findById(id);
        return op.orElse(null);
    }

    // Save the customer
    public void saveCustomer(Customer customer){
       customerRepository.save(customer);

    }

    // Update the customer
    public void updateCustomer(Customer updatedCustomer)
    {
     customerRepository.save(updatedCustomer);
    }

    public void removeCustomer(int id){
        customerRepository.deleteById(id);
    }

}
