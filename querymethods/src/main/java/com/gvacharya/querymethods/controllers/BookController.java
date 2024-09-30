package com.gvacharya.querymethods.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//import com.gvacharya.querymethods.entities.Book;
import com.gvacharya.querymethods.entities.BookT;
import com.gvacharya.querymethods.repositories.BookRepo;

@Controller
public class BookController {

	@Autowired
	private BookRepo bookrepo;
	
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("msg", "model");
		
		BookT book = new BookT(1,"abc");
		bookrepo.save(book);
		return "home";
	}
}
