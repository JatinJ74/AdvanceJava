
package com.gvacharya.student.studentJDBC.entities;

public class Student {

	
	private String name;
	private int rollNo;
	private String courseName;
	private Address address;
	
	public Student() {
		super();
	}
	
	public Student( int rollNo, String name, String courseName,
			com.gvacharya.student.studentJDBC.entities.Address address) {
		super();
		
		this.name = name;
		this.rollNo = rollNo;
		this.courseName = courseName;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" +rollNo+" name=" + name + "courseName=" + courseName
				+ ", Address=" + address + "]";
	}
	
	
}
