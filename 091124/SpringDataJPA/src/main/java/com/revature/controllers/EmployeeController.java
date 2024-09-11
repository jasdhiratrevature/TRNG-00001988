package com.revature.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.Employee;
import com.revature.repository.EmployeeRepository;

//@Controller
@RestController
public class EmployeeController {

	@Autowired
	EmployeeRepository employeeRepository;
	@PostMapping("/employee")
	public void addEmployee(@RequestBody Employee emp) {
		employeeRepository.save(emp);
	}
	
	@GetMapping("/employee")
	public List<Employee> getEmployees() {
		return employeeRepository.findAll();
	}
	@GetMapping("/employee/{id}")
	public Optional<Employee> getEmployeeById(@PathVariable("id")int id) {
		return employeeRepository.findById(id);
	}
	
}
