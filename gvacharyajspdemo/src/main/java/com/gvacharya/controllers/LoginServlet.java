package com.gvacharya.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet
{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		resp.setContentType("text/HTML");
		PrintWriter out = resp.getWriter();
		
		out.print("Login Servlet");
		
		if(username.equals("Abc") && password.equals(123)) {
			//profile
			req.setAttribute("username1", username);
			req.setAttribute("password1", password);
			RequestDispatcher dispatcher = req.getRequestDispatcher("login/profile.jsp");
//			dispatcher.forward(req, resp);
			dispatcher.include(req, resp);
		}else {
			RequestDispatcher dispatcher = req.getRequestDispatcher("login/error.jsp");
//			dispatcher.forward(req, resp);
			dispatcher.include(req, resp);
		}
	}
	
}
