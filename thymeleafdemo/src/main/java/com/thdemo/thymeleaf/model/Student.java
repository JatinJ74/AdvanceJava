package com.thdemo.thymeleaf.model;

public class Student {

	private String name;
	private int age;
	private String roleNo;
	
	public Student() {
	
	}
	
	public Student(String name, int age, String roleNo) {
	
		this.name = name;
		this.age = age;
		this.roleNo = roleNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getRoleNo() {
		return roleNo;
	}

	public void setRoleNo(String roleNo) {
		this.roleNo = roleNo;
	}
	
	
	
}
