package com.gvacharya.datahandling.entities;

import javax.persistence.*;

@Entity
public class Address {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String area;
	private String pincode;
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private Student student;

	public Address() {
	}

	public Address(int id, String area, String pincode, Student student) {
		this.id = id;
		this.area = area;
		this.pincode = pincode;
		this.student = student;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", area=" + area + ", pincode=" + pincode + "]";
	}
	
	
}
