package com.gvacharya.student.studentJDBC.entities;

public class Address {

	
	
	private String area;
	private String landMark;
	private String city;
	private int pincode;
	public Address() {
	}
	public Address(String area, String landMark, String city, int pincode) {
		this.area = area;
		this.landMark = landMark;
		this.city = city;
		this.pincode = pincode;
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
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [area=" + area + ", landMark=" + landMark + ", city=" + city + ", pincode=" + pincode + "]";
	}
	
	
}
