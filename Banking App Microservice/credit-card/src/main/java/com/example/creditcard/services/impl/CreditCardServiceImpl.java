package com.example.creditcard.services.impl;

import com.example.creditcard.models.CreditCard;
import com.example.creditcard.repository.CreditCardRepository;
import com.example.creditcard.services.CreditCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CreditCardServiceImpl implements CreditCardService {

    @Autowired
    CreditCardRepository creditCardRepository;
    @Override
    public List<CreditCard> getAllCardDetails() {
        List<CreditCard> creditCardList=new ArrayList<>();
        creditCardRepository.findAll().forEach(creditCardList::add);
        return creditCardList;
    }

    @Override
    public CreditCard getCard(Long cardNum) {
        Optional<CreditCard> creditCardOptional=creditCardRepository.findById(cardNum);
        return creditCardOptional.orElse(null);

    }

    @Override
    public String debitAmt(Long cardNum, Long amt) {
        Optional<CreditCard> creditCardOptional=creditCardRepository.findById(cardNum);

        if (creditCardOptional.isPresent()){
            CreditCard creditCard=creditCardOptional.get();
            if(creditCard.getBalance()<amt){
                return "Insufficient Balance!";
            }
            else {
                creditCard.setBalance(creditCard.getBalance()-amt);
                creditCardRepository.save(creditCard);
                return amt+" debited from account";
            }

        }
        return "Failed !";
    }

    @Override
    public String creditAmt(Long cardNum,Long amt) {
        Optional<CreditCard> creditCardOptional=creditCardRepository.findById(cardNum);

        if (creditCardOptional.isPresent()){
            CreditCard creditCard=creditCardOptional.get();
            if(creditCard.getBalance()+amt>creditCard.getCardLimit()){
                return "Beyond Limit!";
            }
            else {
                creditCard.setBalance(creditCard.getBalance()+amt);
                creditCardRepository.save(creditCard);
                return amt+" credit in account";
            }

        }
        return "Failed !";
    }

    @Override
    public String addCard(CreditCard creditCard) {
        creditCardRepository.save(creditCard);
        return "Card Added Successfully !";
    }
}
