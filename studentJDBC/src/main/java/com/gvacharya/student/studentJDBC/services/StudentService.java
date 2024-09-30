package com.gvacharya.student.studentJDBC.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.gvacharya.student.studentJDBC.entities.Address;
import com.gvacharya.student.studentJDBC.entities.Student;

public class StudentService {

	public String insertStudent(Student student) {
		String returnMessage = "Problem occured during insertion";
		int addressId = 0;
		String insertAddressQuery = "INSERT INTO "
				+ "address(area,landMark,city,pincode)"
				+ "values(?,?,?,?)";
		
		String insertStudentQuery = "INSERT INTO "
				+ "student(rollNo,name,courseName,addressId) "
				+ "values(?,?,?,?)";
		try {
			Connection connection = getJDBCConnection();
			PreparedStatement statement = connection.prepareStatement(insertAddressQuery,Statement.RETURN_GENERATED_KEYS);
			Address address = student.getAddress();
			statement.setString(1, address.getArea());
			statement.setString(2, address.getLandMark());
			statement.setString(3, address.getCity());
			statement.setInt(4, address.getPincode());
			statement.execute();
			ResultSet result = statement.getGeneratedKeys();
			while(result.next())
				addressId = result.getInt(1);
			
			PreparedStatement statement1 = connection.prepareStatement(insertStudentQuery);
			statement1.setInt(1, student.getRollNo());
			statement1.setString(2, student.getName());
			statement1.setString(3, student.getCourseName());
			if(addressId>0)
				statement1.setInt(4, addressId);
			else
				statement1.setString(4, null);
			
			if(statement1.executeUpdate()>0) {
				returnMessage = "Successfully inserted data. ";
			}
			
			connection.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return returnMessage;
		
	}
	
	public String deleteStudent(int id) {
		String returnMsg = null;
		String selectQuery = "select * from student where student.id = ?";
		String deleteAddressQuery = "delete from address where addressId = ?";
		String deleteStudentQuery = "delete from student where student.id = ?";
		int addressId = 0;
		
		try (Connection connection = getJDBCConnection();){
			
			PreparedStatement statement = connection.prepareStatement(selectQuery);
			statement.setInt(1, id);
			ResultSet result = statement.executeQuery();
			
			while(result.next())
				addressId = result.getInt(5);
			
			PreparedStatement statement1 = connection.prepareStatement(deleteStudentQuery);
			statement1.setInt(1, id);
			statement1.execute();
			
			PreparedStatement statement2 = connection.prepareStatement(deleteAddressQuery);
			statement2.setInt(1, addressId);
			if(statement2.executeUpdate()>0) {
				returnMsg = "Deletion is SuccessFull";
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public String updateStudent(Student student, int id) {
	
		try (
			Connection connection = getJDBCConnection();
			){
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	public Student selectStudent(int id) {
		Student student = null;
		String selectStudent = "Select t1.rollNo,t1.Name,t1.courseName,t2.area,t2.landMark,t2.city,t2.pincode"
				+ " from student t1 join address t2 "
				+ " on t1.addressId = t2.addressId "
				+ " where t1.id = ?";
		try {
			Connection connection = getJDBCConnection();
			PreparedStatement statement = connection.prepareStatement(selectStudent);
			statement.setInt(1, id);
			
			ResultSet result = statement.executeQuery();
			while(result.next()) {
				Address address = new Address(result.getString(4),result.getString(5),result.getString(6),result.getInt(7));
				student = new Student(result.getInt(1),result.getString(2),result.getString(3),address);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return student;
	}
	
	public List<Student> selectAllStudent(){
		List<Student> studentList = new ArrayList<>();
		Student student = null;
		String selectQuery = "select t1.rollNo,t1.name,t1.courseName,t2.area,t2.landMark,t2.city,t2.pincode from student t1 inner join address t2 on t1.addressId = t2.addressId";
		try (
			Connection connection = getJDBCConnection();
				){
			PreparedStatement statement = connection.prepareStatement(selectQuery);
			ResultSet result = statement.executeQuery();
			while(result.next()) {
				Address address = new Address(result.getString(4),result.getString(5),result.getString(6),result.getInt(7));
				student = new Student(result.getInt(1),result.getString(2),result.getString(3),address);
				studentList.add(student);
			}
		} catch (Exception e) {
		     e.printStackTrace();
		}
		
		return studentList;
	}
	
	private Connection getJDBCConnection() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/java_db","root","Jatin123");
	}
	
	
}
