package com.gvacharya.servlethandler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/home")
public class HomeServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		
		HttpSession session = req.getSession();
		
		if(session.getAttribute("username")==null) {
			try {
				resp.sendRedirect("index.jsp");
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}
}
