package com.gvacharya.spring.javaconfig.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gvacharya.beans.Address;
import com.gvacharya.beans.Student;

@Configuration
public class SpringConfiguration {

	@Bean
	public Student student1() {
		Student student = new Student();
		
		student.setName("JAtin");
		student.setRollNo(1);
		student.setAddress(address1());
		return student;
	}
	
	@Bean
	public Address address1() {
		Address address = new Address();
		address.setArea("Chembur");
		address.setPincode("40074");
		return address;
	}
}
