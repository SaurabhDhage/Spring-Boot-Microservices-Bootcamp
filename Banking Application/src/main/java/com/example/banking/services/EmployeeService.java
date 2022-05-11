package com.example.banking.services;

import com.example.banking.models.Employee;
import com.example.banking.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

//    public EmployeeService(){
//        System.out.println("Service layer is created ");
//        employeeList.add(new Employee(1,"Saurabh"));
//
//        employeeList.add(new Employee(2,"Asmita"));
//        employeeList.add(new Employee(3,"Akash"));
//        employeeList.add(new Employee(4,"Sahil"));
//        employeeList.add(new Employee(5,"Rahul"));
//
//
//
//    }
    public List<Employee> getAllEmployees(){
        List<Employee> employeeList=new ArrayList<>();
        employeeRepository.findAll().forEach(employeeList::add);
        return employeeList;
    }
    public Employee getEmployeeById(int id){
        Optional<Employee> op=employeeRepository.findById(id);
        return op.orElse(null);
    }

    // Save the employee
    public void saveEmployee(Employee employee){
       employeeRepository.save(employee);

    }

    // Update the employee
    public void updateEmployee(Employee updatedEmployee)
    {
     employeeRepository.save(updatedEmployee);

    }

    public void removeEmployee(int id){
        employeeRepository.deleteById(id);
    }

}
