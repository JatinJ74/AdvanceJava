package com.gvacharya.hibernatedemo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.gvacharya.hibernatedemo.entities.Address;
import com.gvacharya.hibernatedemo.entities.Student;
import com.gvacharya.hibernatedemo.entities.Subject;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
    	//for hibernate config 
    	Configuration config = new Configuration();
    	// for xml base config
    	config.configure("hibernate.cfg.xml");
    	//
    	
    	Address address1 = new Address();
    	address1.setAddressId(4);
    	address1.setArea("IIT Shelu College");
    	address1.setCity("Karjat");
    	address1.setLandMark("Shelu");
    	address1.setPincode("401010");
    	List<Subject> subjectList = new ArrayList<>();
    	Student student1 = new Student(6,"Kunal",address1,subjectList);
    	
    	
    	
    	subjectList.add(new Subject(1,"OS"));
    	subjectList.add(new Subject(2,"AOA"));
    	subjectList.add(new Subject(3,"BEE"));
//    	address1.setStudent(student1);
    	
    	//Fetch
    	
    	
    	SessionFactory  sessionFactory = config.buildSessionFactory();
    	Session session = sessionFactory.openSession();
    	Transaction transaction = session.getTransaction();
    	
    	transaction.begin();
    	session.save(student1);
//    	session.save(address1);
    	Student student2 = session.get(Student.class,1);
    	
    	//purpose -
    	//insert
    	//update
    	//delete 
    	transaction.commit();
    	
    	session.close();
    	sessionFactory.close();
    }
}
