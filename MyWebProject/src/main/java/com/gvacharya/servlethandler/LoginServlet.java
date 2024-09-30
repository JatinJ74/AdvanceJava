package com.gvacharya.servlethandler;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.gvacharya.dao.DbDAO;
import com.mysql.cj.protocol.Resultset;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		
		String selectQuery = "Select username from users WHERE users.username= ? and users.password= ?";
		
		DbDAO dao = new DbDAO();
		try (
			Connection con = dao.getConnection();
			PreparedStatement statement = con.prepareStatement(selectQuery)){
			statement.setString(1, username);
			statement.setString(2, password);
			try(ResultSet set = statement.executeQuery()){
				if(set.next()) {
					HttpSession session = req.getSession();
					session.setAttribute("username", username);
					resp.sendRedirect("home.jsp");
				}else {
					resp.sendRedirect("signup.jsp");
				}
				
			}
				
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
