package com.example.creditcard.repository;

import com.example.creditcard.models.CreditCard;
import org.springframework.data.repository.CrudRepository;

public interface CreditCardRepository  extends CrudRepository<CreditCard,Long> {}
