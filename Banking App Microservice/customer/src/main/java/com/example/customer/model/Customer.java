package com.example.customer.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Customer {
    @Id
    @Column(name = "Customer_ID")
    @Min(value = 100, message = "customerId should not be less than 100")
    @Max(value = 250, message = "customerId should not be greater than 250")
    private  long customerId;

    @Column(name = "Customer_Name")
    @NotBlank(message = "Customer Name cannot be Blank")
    private String customerName;

    @Min(value = 1000, message = "accountNumber should not be less than 1000")
    @Max(value = 2000, message = "accountNumber should not be greater than 2000")
    @Column(name = "account_Number")
    private long accountNumber;

    @Min(value = 500, message = "cardNumber should not be less than 100")
    @Max(value = 1000, message = "cardNumber should not be greater than 250")
    @Column(name = "Card_Number")
    private long cardNumber;
}
