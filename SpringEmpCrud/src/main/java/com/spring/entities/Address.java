package com.spring.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int addId;
	
	@Size(min = 5,message = "*area should be greater than 5 digit")
	private String area;
	
	@Min(6)
	private int pincode;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "address")
	private Employee employee;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int addId, String area, int pincode, Employee employee) {
		super();
		this.addId = addId;
		this.area = area;
		this.pincode = pincode;
		this.employee = employee;
	}

	public int getAddId() {
		return addId;
	}

	public void setAddId(int addId) {
		this.addId = addId;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Address [addId=" + addId + ", area=" + area + ", pincode=" + pincode + ", employee=" + employee + "]";
	}

}
