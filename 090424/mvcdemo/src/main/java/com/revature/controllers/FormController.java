package com.revature.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/forms")
public class FormController {

	//@RequestMapping(value = "/show-form",method = RequestMethod.GET)
	@GetMapping("/show-form")
	public String showForm() {
		return "myForm";
	}
	
	/*
	 * @RequestMapping("/processForm") //public String
	 * getFormRespose(HttpServletRequest request,Model model) { public String
	 * getFormRespose(HttpServletRequest request,Model model) { String
	 * name=request.getParameter("userName"); String message="Yo !"
	 * +name.toUpperCase(); model.addAttribute("messageToDisplay", message); return
	 * "formResponse"; }
	 */
	
	@RequestMapping("/processForm")
	public ModelAndView getFormRespose(HttpServletRequest request) {
		ModelAndView mav=new ModelAndView("formResponse");
		String  name=request.getParameter("userName");
		String message="Yo !"  +name.toUpperCase();
		mav.addObject("messageToDisplay", message);
		return mav;
	}
	
	@RequestMapping("/processFormAgain")
	public ModelAndView getFormResposeAgain(
			@RequestParam("userName") String name,@RequestParam("password") String pass) {
		ModelAndView mav=new ModelAndView("formResponse");
		String message="Yo !"  +name.toUpperCase() + " -- "+pass;
		mav.addObject("messageToDisplay", message);
		return mav;
	}
}
