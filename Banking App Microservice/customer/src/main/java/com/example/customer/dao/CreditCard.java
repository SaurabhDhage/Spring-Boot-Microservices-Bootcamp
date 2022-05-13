package com.example.customer.dao;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreditCard {
    private Long cardNumber;
    private Long balance;
    private Long cardLimit;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date expiryDate;

}
