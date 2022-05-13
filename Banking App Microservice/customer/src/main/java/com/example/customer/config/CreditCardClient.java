package com.example.customer.config;

import com.example.customer.dao.CreditCardList;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="credit-card-service")

public interface CreditCardClient {

	@GetMapping("/credit-card")
	CreditCardList fetchDetailsWithCreditInfoFromClient();
	
}