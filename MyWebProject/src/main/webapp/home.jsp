<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
		response.setHeader("Pragma","no-cache");
		response.setHeader("Expires", "0");

		if(session.getAttribute("username")==null)
			response.sendRedirect("index.jsp");

%>
	<h1>Welcome Home!</h1>
	<br><br>
	<h1> <a href="logout"> Logout</a></h1>
</body>
</html>