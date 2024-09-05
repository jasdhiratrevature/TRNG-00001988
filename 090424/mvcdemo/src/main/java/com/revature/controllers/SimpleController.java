package com.revature.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.servlet.ModelAndView;

import com.revature.model.Employee;

import reactor.core.publisher.Flux;

@Controller
public class SimpleController {

	RestTemplate restTemplate;
	WebClient webClient=WebClient.create("http://localhost:8081");
	
	@RequestMapping("/empView")
	public ModelAndView employeeView() {
		ModelAndView mav=new ModelAndView("employeeView");
		restTemplate=new RestTemplate();
		ResponseEntity<List> response
		  = restTemplate.exchange("http://localhost:8081/employees" ,HttpMethod.GET, null,List.class);
		List responseBody=response.getBody();
		mav.addObject("empObj", responseBody);
		return mav;
	}
	
	@RequestMapping("/emp-flux")
	public ModelAndView getAllEmployees() {
		ModelAndView mav=new ModelAndView("emp-flux");
		Flux<Employee> empFlux=   webClient.get()
	      .uri("/employees")
	      .retrieve()
	      .bodyToFlux(Employee.class); 
		List<Employee> eList=new ArrayList();	
		empFlux.subscribe(employee->eList.add(employee));
		mav.addObject("fluxEmp",eList);
		return mav;
	  }
}
