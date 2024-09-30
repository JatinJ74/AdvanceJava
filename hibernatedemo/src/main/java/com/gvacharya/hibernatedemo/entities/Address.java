package com.gvacharya.hibernatedemo.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address {

	@Id
	@Column(name="address_id")
	private int addressId;
	
	private String area;
	
	private String landMark;
	
	private String city;
	
	private String pincode;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "address")
	private Student student;  

	public Address() {
		super();
	}

	public Address(int addressId, String area, String landMark, String city, String pincode, Student student) {
		super();
		this.addressId = addressId;
		this.area = area;
		this.landMark = landMark;
		this.city = city;
		this.pincode = pincode;
		this.student = student;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getLandMark() {
		return landMark;
	}

	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
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
		return "Address [addressId=" + addressId + ", area=" + area + ", landMark=" + landMark + ", city=" + city
				+ ", pincode=" + pincode + ", student=" + student + "]";
	}
	
	
}
