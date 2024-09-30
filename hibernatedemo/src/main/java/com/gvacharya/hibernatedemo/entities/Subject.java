package com.gvacharya.hibernatedemo.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.OneToOne;
import javax.persistence.OneToOne;

@Entity
public class Subject {

	@Id
	@Column(name="subject_id")
	private int subjectId;
	
	@Column(name="subject_name")
	private String subjectName;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Student student;
	

	public Subject() {
		super();
	}

	public Subject(int subjectId, String subjectName) {
		super();
		this.subjectId = subjectId;
		this.subjectName = subjectName;
	}

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	@Override
	public String toString() {
		return "Subject [subjectId=" + subjectId + ", subjectName=" + subjectName + "]";
	}
	
	
}
