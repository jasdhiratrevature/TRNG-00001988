package com.revature.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerDemo {

	@RequestMapping("/data")
	public String getData(Model model) {
		List<String> names=new ArrayList();
		names.add("A");
		names.add("B");
		names.add("C");
		model.addAttribute("nameList",names);
		return "someView";
	}
	
	@RequestMapping("/data2")
	@ResponseBody
	public List getData2(Model model) {
		List<String> names=new ArrayList();
		names.add("A");
		names.add("B");
		names.add("C");
		return names;
	}
}
