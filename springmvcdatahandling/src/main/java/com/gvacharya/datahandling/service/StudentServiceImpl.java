package com.gvacharya.datahandling.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.gvacharya.datahandling.dao.StudentDao;
import com.gvacharya.datahandling.entities.Student;

public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentDao studentDao;

	@Override
	public String addStudent(Student student) {
		
		return studentDao.addStudent(student);
	}
}
