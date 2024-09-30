package com.gvacharya.crudapp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import com.gvacharya.crudapp.entities.Employee;

@Repository
public class EmpDaoImpl implements EmpDao{
	
	public SessionFactory getConnection() {
		return new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	}

	@Override
	public String addEmployee(Employee employee) {
		
		try(Session session = getConnection().openSession()){
			Transaction transaction = session.getTransaction();
			transaction.begin();
			session.save(employee);
			transaction.commit();
			session.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return "Employee Added Successfully";
	}
	

	@Override
	public Employee getEmployeeById(String empId) {
	    Employee employee = null;
	    try (Session session = getConnection().openSession()) {
	        employee = session.get(Employee.class, empId);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return employee;
	}

	@Override
	public String updateEmployee(Employee employee) {
		
		try(Session session = getConnection().openSession()){
			Transaction transaction = session.getTransaction();
			transaction.begin();
			session.update(employee);
			transaction.commit();
		}catch(Exception e) {
			return "Couldn't Update Employee!";
		}
		return "Employee Information Updated Successfully!";
	}

	@Override
	public String deleteEmployee(String empId) {
		try(Session session = getConnection().openSession()){
			Transaction transaction = session.getTransaction();
			transaction.begin();
			Employee employee = session.get(Employee.class, empId);
			if(employee != null) {
				session.delete(employee);
			}else {
				return "Employee Not Found";
			}
			transaction.commit();
		}catch(Exception e) {
			return "Exception Halted Deletion Operation";
		}
		return "Employee Deleted Successfully!";
	}

	@Override
	public List<Employee> employeesList() {
		List<Employee> employeeList;
		try(Session session = getConnection().openSession()){
			employeeList = session.createQuery("FROM Employee", Employee.class).list();
			System.out.println(employeeList);
		}
		return employeeList;
	}

	
}
