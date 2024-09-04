package com.revature.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.Employee;

@RestController
public class SimpleRestController {

	@GetMapping("/employees")
	public List getAllEmployee() {
		// return this data from the data base
		// use appropriate service and DAO and DB
		Employee e1=new Employee(1,"A");
		Employee e2=new Employee(2,"B");
		List<Employee> eList=new ArrayList();
		eList.add(e1);
		eList.add(e2);
		return eList;
	}
	
}
