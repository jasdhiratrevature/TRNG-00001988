package com.revature.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.exceptions.ResourceNotFoundException;
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
		//System.err.println("getEmployees Called");
		return employeeRepository.findAll();
	}
	@GetMapping("/employee/{id}")
	public ResponseEntity<Optional<Employee>> getEmployeeById(@PathVariable("id")int id) 
		throws ResourceNotFoundException{
		Optional<Employee> emp=Optional.ofNullable(employeeRepository.findById(id)
				.orElseThrow(()->new ResourceNotFoundException("Employee does not exists with Id :: "+id)));
		
		return ResponseEntity.ok().body(emp);
	}
	
	@GetMapping("/employee/name/{name}")
	public ResponseEntity<Optional<Employee>> getEmployeeByName(@PathVariable("name")String name) 
		throws ResourceNotFoundException{
		Optional<Employee> emp=Optional.ofNullable(employeeRepository.findByName(name))
				.orElseThrow(()->new ResourceNotFoundException("Employee does not exists with Name :: "+name));
		
		return ResponseEntity.ok().body(emp);
	}
	

}
