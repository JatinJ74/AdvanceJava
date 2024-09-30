package com.gvacharya.crudapp.entities;

import javax.persistence.*;

@Entity
public class Employee {
	
	@Id
	private String empId;
	private String empName;
	private String empRole;
	private String empDepart;
	private double empSalary;
	
	public Employee() {
	}

	public Employee(String empId, String empName, String empRole, String empDepart, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empRole = empRole;
		this.empDepart = empDepart;
		this.empSalary = empSalary;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpRole() {
		return empRole;
	}

	public void setEmpRole(String empRole) {
		this.empRole = empRole;
	}

	public String getEmpDepart() {
		return empDepart;
	}

	public void setEmpDepart(String empDepart) {
		this.empDepart = empDepart;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empRole=" + empRole + ", empDepart=" + empDepart
				+ ", empSalary=" + empSalary + "]";
	}
	
	
	
	
}
