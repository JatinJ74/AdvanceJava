package com.gvacharya.main.hibernateassignment;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.gvacharya.main.hibernateassignment.car.Car;

public class App{
	
	public static void main(String[] args) {
		
		Configuration config = new Configuration();
		
		config.configure("hibernatae.cfg.xml");
		
		Car car = new Car();
		
		SessionFactory sFactory = config.buildSessionFactory();
		Session session = sFactory.openSession();
		Transaction transaction = session.getTransaction();
		
		transaction.begin();
//		session.save(car);
		
		transaction.commit();
		
		session.close();
		sFactory.close();
	}
}