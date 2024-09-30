package com.gvacharya.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gvacharya.beans.Student;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("com/gvacharya/config/applicationcontext.xml");
		
		Student student = (Student)context.getBean("student1");
		
		System.out.println(student);
	}
}
