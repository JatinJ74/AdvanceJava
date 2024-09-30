package com.gvacharya.crudapp.service;

import java.util.List;

import com.gvacharya.crudapp.entities.Employee;


public interface EmpService {

	 public String addEmployee(Employee employee);

	 public Employee getEmployeeById(String empId);
	
	 public String updateEmployee(Employee employee);
	 
	 public String deleteEmployee(String empId);
	 
	 public List<Employee> employeesList();
}
