package com.mywebpages.servlethandler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/userhome")
public class UserHomeServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		if(session != null 
				&& session.getAttribute("userName") != null 
				&& session.getAttribute("password") != null) {
			
			req.getRequestDispatcher("userhome.jsp").forward(req, resp);;
			
		}else {
			resp.sendRedirect("login.jsp");
		}
	}
}
