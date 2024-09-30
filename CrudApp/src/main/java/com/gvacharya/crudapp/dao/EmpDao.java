package com.gvacharya.crudapp.dao;

import java.util.List;

import com.gvacharya.crudapp.entities.Employee;

public interface EmpDao {

	public String addEmployee(Employee employee);

	public Employee getEmployeeById(String empId);
	
	public String updateEmployee(Employee employeee);
	
	public String deleteEmployee(String empId);
	
	public List<Employee> employeesList();
}
