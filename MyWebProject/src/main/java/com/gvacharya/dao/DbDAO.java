package com.gvacharya.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbDAO {

	private static final String username = "root";
	private static final String password = "Jatin123";
	private static final String url = "jdbc:mysql://localhost:3306/java_db";
	
	public Connection getConnection() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		return DriverManager.getConnection(url,username,password);
	}
	
//	public void insertQuery(String uname, String emailId, String pass, String gender, String country) {
//		
//		String query = "insert into users values("+uname+","+
//	}
}
