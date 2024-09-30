<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1> Successfully Logged-In</h1>
	<%
		String userName = (String)request.getAttribute("username1");
		String password = (String)request.getAttribute("password1");
	%>
		<h1>
	<%
		out.print(userName);
		out.print(password);
	%>	
		</h1>
</body>
</html>