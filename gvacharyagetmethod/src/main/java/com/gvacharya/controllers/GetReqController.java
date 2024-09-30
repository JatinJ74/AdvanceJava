package com.gvacharya.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/reg")
public class GetReqController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		
		String name = req.getParameter("name");
		
		PrintWriter out = resp.getWriter();
		
		out.print("<h1> Id: "+id+" </h1>");
		out.print("<h1> Name: "+name+" </h1>");
	}
}
