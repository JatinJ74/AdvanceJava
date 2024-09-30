package com.gvacharya.servlethandler;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gvacharya.dao.DbDAO;
import com.mysql.cj.xdevapi.PreparableStatement;

@WebServlet("/signup")
public class SignupServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String username = req.getParameter("username");
		String emailId = req.getParameter("email");
		String password = req.getParameter("password");
		String gender = req.getParameter("gender");
		String country = req.getParameter("country");
		
		PrintWriter out = resp.getWriter();
		out.print(username+"\n");
		out.print(emailId+"\n");
		out.print(password+"\n");
		out.print(gender+"\n");
		out.print(country+"\n");
		
		DbDAO dao = new DbDAO();
		String insertQuery = "Insert into users(username,emailId,password,gender,country) "
				+ "values(?,?,?,?,?)";
		
		try {
			
			Connection connection = dao.getConnection();
			
			PreparedStatement statement = connection.prepareStatement(insertQuery);
			statement.setString(1, username);
			statement.setString(2, emailId);
			statement.setString(3, password);
			statement.setString(4, gender);
			statement.setString(5, country);
			statement.execute();
			System.out.println("Inserted successfully");
			
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		resp.sendRedirect("login.jsp");
	}
}
