package com.gvacharya.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gvacharya.beans.Student;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("com/gvacharya/config/applicationcontext.xml");
		
//		Student student1 = new Student();
		
		Student student = (Student) context.getBean("student1");
		Student student3 = (Student) context.getBean("student3");
	
		System.out.println(student);
		System.out.println(student3);
		
		
	}
}
