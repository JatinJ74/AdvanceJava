package com.myProject.springbootcrud.entities;

import java.time.LocalDate;

import org.hibernate.engine.jdbc.env.spi.IdentifierCaseStrategy;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class EmployeeT {
	
	@Id
	private int id;
	private String  eName;
	private LocalDate dob;
	
	@OneToOne(mappedBy = "employee",cascade = CascadeType.ALL)
	private Address address;

	public EmployeeT() {

	}

	public EmployeeT(int id, String eName, LocalDate dob, Address address) {
		this.id = id;
		this.eName = eName;
		this.dob = dob;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", eName=" + eName + ", dob=" + dob + ", address=" + address + "]";
	}
	
	
}
