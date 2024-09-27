package com.revature.exchange.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.revature.exchange.model.CurrencyExchange;
import com.revature.exchange.model.repository.CurrencyExcchangeRepository;
import com.revature.exchange.service.CurrencyExchangeService;

@RestController
public class CurrencyExchangeController {
	@Autowired
	CurrencyExchangeService service;

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyExchange getExchangeValue(@PathVariable String from,@PathVariable String to) {
		
		CurrencyExchange currencyExchange=service.findByFromAndTo(from, to);
		
		return currencyExchange;
	}
}
