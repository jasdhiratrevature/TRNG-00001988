package com.revature.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloThereController {

	@GetMapping("/hello-there")
	public String helloThere() {
		return "Hello There";
	}
	
}
