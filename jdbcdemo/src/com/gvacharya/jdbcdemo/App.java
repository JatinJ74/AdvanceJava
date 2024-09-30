package com.gvacharya.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class App {

	public static void main(String[] args) throws Exception {
		int t_no = 2;
		String name = "Jaiswal";
		
		//Loading Drivers 
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded Successfully");
		
		//Forming Connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_db","root","Jatin123");
		System.out.println("DB connected successfully");
		
		//Statement preparation
//		PreparedStatement statement =
//				connection.
//							prepareStatement("create table new_table(t_no int primary key, name varchar(50) not null)");
//
//		System.out.println(statement.execute());
		
//		PreparedStatement statement =
//				connection.prepareStatement("insert into new_table values(1,'JAtin')");
//				connection.prepareStatement("insert into new_table values(?,?)");
//				statement.setInt(1, t_no);
//				statement.setString(2, name);
//			
//		statement.execute();
		
		PreparedStatement statement = connection.prepareStatement("Select * from new_table");
		
		ResultSet result = statement.executeQuery();
		while(result.next()) {
			System.out.println("____________________________________");
			System.out.println("t_no:"+ result.getInt(1));
			System.out.println("Name:"+ result.getString(2));
			System.out.println("_____________________________________");
			
		}
		
		
	}
}
