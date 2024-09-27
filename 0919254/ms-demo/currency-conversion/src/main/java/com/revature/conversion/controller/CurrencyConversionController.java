package com.revature.conversion.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.revature.conversion.model.CurrencyConversion;
import com.revature.conversion.model.service.CurrencyConversionService;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
public class CurrencyConversionController {

	@Autowired
	CurrencyConversionService service;
	
	@GetMapping("/currency-conversion/from/{from}/to/{to}/qty/{qty}")
	@CircuitBreaker(name="myexchange",fallbackMethod = "fallbackMethod")
	public CurrencyConversion getCurrencyConversion(@PathVariable String from,
			@PathVariable String to,
			@PathVariable BigDecimal qty){
		
		
		
	CurrencyConversion currencyConversion=	service.calculateCurrencyConversion(from, to, qty);
		
	 return new CurrencyConversion(currencyConversion.getId(),
             from, to, qty,
             currencyConversion.getConversionMultiple(),
             qty.multiply(currencyConversion.getConversionMultiple()) );
	}
	
	public CurrencyConversion fallbackMethod(String from,
			String to, BigDecimal qty,Exception exception) {
		 return new CurrencyConversion(1L,"Error", "Error", BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO );
		 
		
	}
}
