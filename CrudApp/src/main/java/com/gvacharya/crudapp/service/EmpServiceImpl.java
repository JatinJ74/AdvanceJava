package com.gvacharya.crudapp.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gvacharya.crudapp.dao.EmpDao;
import com.gvacharya.crudapp.entities.Employee;

@Service
public class EmpServiceImpl implements EmpService{

	@Autowired
	private EmpDao empDao;
	
	public String addEmployee(Employee employee) {
		return empDao.addEmployee(employee);
	}

	@Override
	public Employee getEmployeeById(String empId) {
		return empDao.getEmployeeById(empId);
	}

	@Override
	public String updateEmployee(Employee employee) {
		return empDao.updateEmployee(employee);
	}

	@Override
	public String deleteEmployee(String empId) {
		return empDao.deleteEmployee(empId);
	}

	@Override
	public List<Employee> employeesList() {
		return empDao.employeesList();
	}
	
	
}
