package com.gvacharya.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.gvacharya.beans.Student;
import com.gvacharya.spring.javaconfig.config.SpringConfiguration;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = 
				new 
//				AnnotationConfigApplicationContext("com/gvacharya/spring/javaconfig/config/SpringConfiguration.java");
				AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		Student student = (Student )context.getBean("student1");
		
		System.out.println(student);
	}
}
