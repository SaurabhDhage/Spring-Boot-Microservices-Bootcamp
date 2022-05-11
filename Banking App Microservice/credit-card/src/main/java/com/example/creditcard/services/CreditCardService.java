package com.example.creditcard.services;

import com.example.creditcard.models.CreditCard;

import java.util.List;

public interface CreditCardService {

    List<CreditCard> getAllCardDetails();
    CreditCard getCard(Long cardNum);
    String debitAmt(Long cardNum, Long amt);
    String creditAmt(Long cardNum, Long amt);
    String addCard(CreditCard creditCard);
}
