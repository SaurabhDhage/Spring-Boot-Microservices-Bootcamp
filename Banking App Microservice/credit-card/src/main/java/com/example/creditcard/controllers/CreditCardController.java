package com.example.creditcard.controllers;

import com.example.creditcard.models.CreditCard;
import com.example.creditcard.models.CreditCardList;
import com.example.creditcard.services.CreditCardService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CreditCardController {

    @Autowired
    CreditCardService creditCardService;

    @Value("${server.port}")
    String port;

    @GetMapping("/credit-card")
    public CreditCardList getAllCreditCards()
    {
        LoggerFactory.getLogger(CreditCardController.class).info("Instance port: "+port);
        CreditCardList creditCardList=new CreditCardList();
        creditCardList.setCreditCards(creditCardService.getAllCardDetails());
        return creditCardList;
    }

    @GetMapping("/credit-card/{cardNo}")
    public CreditCard getCreditCard(@PathVariable Long cardNum) {
        return creditCardService.getCard(cardNum);
    }

    @PutMapping("/credit-card/{cardNo}/withdraw/{amt}")
    public String withdraw(@PathVariable("cardNo") Long cardNum, @PathVariable("amt") Long amt) {
        return creditCardService.debitAmt(cardNum, amt);
    }

    @PutMapping("/credit-card/{cardNo}/deposit/{amt}")
    public String deposit(@PathVariable("cardNo") Long cardNum, @PathVariable("amt") Long amt) {
        return creditCardService.creditAmt(cardNum, amt);
    }

    @PostMapping("/credit-card")
    public String addCreditCard(@RequestBody CreditCard creditCard) {
        return creditCardService.addCard(creditCard);
    }

}

