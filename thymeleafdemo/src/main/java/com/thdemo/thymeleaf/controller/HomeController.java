package com.thdemo.thymeleaf.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.thdemo.thymeleaf.model.Role;
import com.thdemo.thymeleaf.model.Student;
import com.thdemo.thymeleaf.model.User;



@Controller
public class HomeController {

	@GetMapping("/")
	public String loadHome() {
		return "home";
	}
	
	@GetMapping("/variable-expression")
	public String variableExpression(Model model) {
		model.addAttribute("message", "hi, there");
		Student student = new Student("jatin",24,"22");
		model.addAttribute("student", student);
		return "variable-expression";
	}
	
	@GetMapping("/selection-expression")
	public String selectionExpression(Model model) {
		Student student = new Student("jatin",24,"22");
		model.addAttribute("student", student);
		return "selection-expression";
	}
	
	@GetMapping("/link-expression")
	public String linkExpression() {
		return "link-expression";
	}
	
	@GetMapping("/foreach-expression")
	public String foreachExpression(Model model) {
		Student student1 = new Student("Jatin",22,"24");
		Student student2= new Student("Rohit",24,"25");
		Student student3 = new Student("Kunal",23,"26");
		
		List<Student> StudentList = Arrays.asList(student1,student2,student3);
		model.addAttribute("studentList", StudentList);
 		return "foreach-expression";
	}
	
	@GetMapping("/if-unless")
	public String ifunless(Model model) {
		User userOne = new User("jatin","jaiswaljatin44@gmail.com",Role.ADMIN);
		User userTwo = new User("rohit","rohitgupta@gmail.com",Role.USER);
		User userThree = new User("kunal","kunalrajpurohit@gmail.com",Role.USER);
		List<User> userList = Arrays.asList(userOne,userTwo,userThree);
		model.addAttribute("userList",userList);
		return "if-unless";
	}
	
}
