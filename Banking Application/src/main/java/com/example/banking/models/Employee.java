package com.example.banking.models;

import javax.persistence.*;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Employee_ID")
    private int id;

    @Column(name = "Employee_Name")
    private String employeeName;

    @Column(name = "Employee_Salary")
    private int employeeSalary;

    @Column (name = "Employee_Title")
    private String employeeTittle;

    public int getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(int employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeeTittle() {
        return employeeTittle;
    }

    public void setEmployeeTittle(String employeeTittle) {
        this.employeeTittle = employeeTittle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}
