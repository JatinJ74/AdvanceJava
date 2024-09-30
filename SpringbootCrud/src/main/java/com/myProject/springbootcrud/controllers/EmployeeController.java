package com.myProject.springbootcrud.controllers;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.GetMapping;

import com.myProject.springbootcrud.entities.Address;

import com.myProject.springbootcrud.entities.EmployeeT;
import com.myProject.springbootcrud.repositories.EmployeeRepository;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@GetMapping("/")
	public String getHome() {
		
		Address address = new Address();
		address.setId(1);
		address.setArea("shelu");
		address.setPincode("400074");
		
		EmployeeT employee = new EmployeeT();
		employee.setId(1);
		employee.seteName("Abc");
		employee.setDob(LocalDate.parse("2010-08-29"));
		employee.setAddress(address);
		
		address.setEmployee(employee);
		
//		create
//		employeeRepository.save(employee);
		
//      update 
//		employee = employeeRepository.getReferenceById(1);
//		
//		employee.seteName("Spring");
		
//		employeeRepository.save(employee);
		
//		get
//		Optional<EmployeeT> emp = Optional.ofNullable(employeeRepository.getReferenceById(1));
//		if(emp.isPresent()) {
//			System.out.println(emp.get());
//		}else {
//			System.out.println("Employee not found");
//		}
//		System.out.println(employee);
		
//      delete
//		employee = employeeRepository.getReferenceById(1);
//		
//		if(employee!=null) {
			employeeRepository.deleteById(1);
			System.out.println("Employee deleted Successfully");
//		}else {
//			System.out.println("employee not found");
//		}

		return "Home";
	}
	
	
}
