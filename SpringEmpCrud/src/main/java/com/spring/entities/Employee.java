package com.spring.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.Size;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	
	@Size(min=5, max=15, message="*Invalid Name")
	private String name;
	
	@Size(min=5, max=20, message = "*Please Enter Valid Email")
	private String email;
	
	@Size(min=10, max=10, message = "*Invalid phone number")
	private String phoneNo;

	@OneToOne(cascade = CascadeType.ALL)
	@Valid
	private Address address;

	public Employee() {

	}

	public Employee(int empId, String name, String email, String phoneNo, Address address) {
		this.empId = empId;
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
		this.address = address;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", email=" + email + ", phoneNo=" + phoneNo
				+ ", address=" + address + "]";
	}

}
