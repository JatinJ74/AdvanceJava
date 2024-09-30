package com.gvacharya.datahandling.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gvacharya.datahandling.entities.Student;
import com.gvacharya.datahandling.service.StudentService;

@Controller
public class MyController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("/add")
	public String registerStudent() {
		return "addStudent";
	}
	
	@PostMapping("/addStudent")
	public String registration(@ModelAttribute("student") Student student, Model model) {
		

		model.addAttribute("message",studentService.addStudent(student));
		return "success";
	}
}
