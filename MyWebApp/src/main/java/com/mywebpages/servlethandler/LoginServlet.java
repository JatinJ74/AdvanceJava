package com.mywebpages.servlethandler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String userName = req.getParameter("userName");
		String password = req.getParameter("password");
		
		if(userName.equals("Jatin44") && password.equals("Jatin@123")) {
			
			HttpSession session = req.getSession();
			
			session.setAttribute(userName, userName);
			session.setAttribute(password, password);
			
			resp.sendRedirect("userhome.jsp");
		}else {
			req.setAttribute("errorMessage", "Invalid username or password");
			
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		}
	}
}
