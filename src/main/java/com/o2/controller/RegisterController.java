package com.o2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterController {
	@RequestMapping("/register")
	public ModelAndView showRegistrationForm(){
		System.out.println("display Registration page");
		ModelAndView mv = new ModelAndView("register");
		return mv;
	}
}
