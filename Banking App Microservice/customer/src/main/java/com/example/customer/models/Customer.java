package com.example.customer.models;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Customer {
    @Id
    @Column(name = "Customer_ID")
    private  long customerId;
    @Column(name = "Customer_Name")
    private String customerName;
    @Column(name = "account_Number")
    private long accountNumber;
    @Column(name = "Card_Number")
    private long cardNumber;
}
