package com.gvacharya.datahandling.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.gvacharya.datahandling.entities.Student;

public class StudentDaoImpl implements StudentDao{

	@Override
	public String addStudent(Student student) {
		try(Session session = sessionFactory().openSession()){
			Transaction transaction = session.getTransaction();
			
			transaction.begin();
			session.save(student);
			transaction.commit();
			}
		
		return "Student Info Saved Successfully";
	}

	public SessionFactory sessionFactory() {
		return new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	}
}
