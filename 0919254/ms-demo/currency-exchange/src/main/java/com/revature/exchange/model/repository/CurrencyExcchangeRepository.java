package com.revature.exchange.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.exchange.model.CurrencyExchange;

@Repository
public interface CurrencyExcchangeRepository extends JpaRepository<CurrencyExchange, Long>{
	 CurrencyExchange findByFromAndTo(String from, String to);
}
