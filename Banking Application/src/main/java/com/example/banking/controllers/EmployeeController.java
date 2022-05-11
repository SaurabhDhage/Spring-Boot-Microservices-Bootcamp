package com.example.banking.controllers;

import com.example.banking.models.Employee;
import com.example.banking.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/employee",method = RequestMethod.GET)
    List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }
    @RequestMapping(value = "/employee/{id}",method = RequestMethod.GET)
    Employee getEmployeeById(@PathVariable int id){
        return employeeService.getEmployeeById(id);
    }

    @RequestMapping(value = "/employee",method = RequestMethod.POST)
    void saveEmployee(@RequestBody Employee employee){
        employeeService.saveEmployee(employee);
    }


    @RequestMapping(value = "/employee",method = RequestMethod.PUT)
    void updateEmployee(@RequestBody Employee employee){
        employeeService.updateEmployee(employee);
    }

    @RequestMapping(value = "/employee/{id}",method = RequestMethod.DELETE)
    void removeEmployee(@PathVariable int id){
        employeeService.removeEmployee(id);
    }
}
