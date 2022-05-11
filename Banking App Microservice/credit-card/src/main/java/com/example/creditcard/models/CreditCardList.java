package com.example.creditcard.models;

import java.util.List;

public class CreditCardList {
    public List<CreditCard> getCreditCards() {
        return creditCards;
    }

    public void setCreditCards(List<CreditCard> creditCards) {
        this.creditCards = creditCards;
    }

    List<CreditCard> creditCards;

}
