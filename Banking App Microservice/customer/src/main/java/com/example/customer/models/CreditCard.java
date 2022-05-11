package com.example.customer.models;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreditCard {
    @Id
    Long cardNumber;
    Long balance;
    Long cardLimit;
    @JsonFormat(pattern = "yyyy-MM-dd")
    Date expiryDate;

}
