package com.revature.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.Employee;

@RestController
@RequestMapping("/emp")
public class RestControllerDemo {
	static List<Employee> empList;
	static {
		empList=new ArrayList();
		Employee e1=new Employee(1,"Jasdhir");
		empList.add(e1);
		empList.add(new Employee(2,"Madhav"));
	}
	
	@GetMapping("/employees")
	public List getAllEmployees() {
		return empList;
	}
	@GetMapping("/employees/{id}")
	public Employee getEmployeeById(@PathVariable("id")int id) {
		
		// Use a query to serach emp based on from a DB
		Employee emp=empList.get(id-1);
		return emp;
	}
	
	@DeleteMapping("/employee/{id}")
	public void deleteEmployeeById(@PathVariable("id")int id) {
		empList.remove(id-1);
	}
}
