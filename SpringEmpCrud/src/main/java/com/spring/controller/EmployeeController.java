package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.entities.Employee;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class EmployeeController {
	
	@Autowired
	private LocalValidatorFactoryBean validator;

	@GetMapping("/add")
	public String addEmployee(Model model) {
		model.addAttribute("employee", new Employee());
		return "registration";
	}
	
	@PostMapping("/reg")
	public String postMethodName(@ModelAttribute("employee") Employee employee, BindingResult result) {
		//TODO: process POST request
		
		System.out.println(employee);
		validator.validate(employee, result);
		if (result.hasErrors()) {
			return "registration";
		}
		
		return "success";
	}
	
	
}
