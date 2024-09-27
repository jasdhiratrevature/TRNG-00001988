package com.revature.conversion.model.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.revature.conversion.model.CurrencyConversion;

@Service
public class CurrencyConversionService {
	@Autowired
	private WebClient webClient;
	 public CurrencyConversion calculateCurrencyConversion( String from, String
			  to, BigDecimal quantity) {
			  
		// we need to call the currency exchange service
			// RESTtemplate or WebClient	
			  CurrencyConversion currencyConversion=
			  webClient.get().uri("http://currency-exchange", uriBuilder -> uriBuilder
			  .path("currency-exchange/from/{from}/to/{to}") .build(from,to)) .retrieve()
			  .bodyToMono(CurrencyConversion.class) .block();
			  
			  return currencyConversion;
			  
				 
			  }
}
