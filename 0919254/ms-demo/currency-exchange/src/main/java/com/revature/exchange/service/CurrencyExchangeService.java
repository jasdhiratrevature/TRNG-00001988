package com.revature.exchange.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.exchange.model.CurrencyExchange;
import com.revature.exchange.model.repository.CurrencyExcchangeRepository;

@Service
public class CurrencyExchangeService {

	@Autowired
	CurrencyExcchangeRepository repository;
	
	public CurrencyExchange findByFromAndTo(String from, String to) {
		return repository.findByFromAndTo(from, to);
	}
}
