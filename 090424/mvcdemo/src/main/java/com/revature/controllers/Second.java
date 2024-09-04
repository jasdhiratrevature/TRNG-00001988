package com.revature.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/second")
public class Second {

	@RequestMapping("/hi")
	public String firstPage() {
		return "second";
	}
}
