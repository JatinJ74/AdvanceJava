package com.gvacharya.employee.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import com.gvacharya.employee.Employee;

public class EmpApp {

	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<>();
		
		empList.add(new Employee(1,"Jatin",23,540000));
		empList.add(new Employee(2,"Rohit",25,536000));
		empList.add(new Employee(3,"Rohan",22,548000));
		empList.add(new Employee(4,"Kunal",23,542000));
		empList.add(new Employee(5,"Sagar",22,546000));
		empList.add(new Employee(6,"Sagar",22,546000));
				
//		empList.forEach(e -> System.out.println(e));
		
//		for (Employee employee : empList) {
//			System.out.println(employee);
//		}
		
//		Iterator<Employee> empIterator =empList.iterator();
//		
//		while(empIterator.hasNext()) {
//			System.out.println(empIterator.next());
//		}
		
//		for(int i=0; i<empList.size();i++) {
//			System.out.println(empList.get(i));
//		}
		
//		Enumeration<Employee> empEnum =Collections.enumeration(empList);
//		
//		while(empEnum.hasMoreElements()) {
//			System.out.println(empEnum.nextElement());
//		}
		
//		empList.stream().forEach(employee -> System.out.println(employee));
		
		// to get unique name of emp. with age's second digit being even number
//		Set<String> emp =empList.stream().filter(e->e.getAge()%2==0).map(Employee::getName).collect(Collectors.toSet());
//		
//		System.out.println(emp);
		
		// to sort based on custom logic using comparator
//		Optional<Employee> emp = empList.stream().sorted(Comparator.comparing(Employee::getAge)).sorted(Comparator.comparing(Employee::getSalary)).findFirst();
//	
//		System.out.println(emp);
		
		empList.stream().sorted((o1, o2) -> Integer.compare(o2.getAge(), o1.getAge())).forEach(System.out::println);
		System.out.println();
		empList.stream().sorted(Comparator.comparing(Employee::getAge)).forEach(System.out::println);
	
	
	
	}
}
