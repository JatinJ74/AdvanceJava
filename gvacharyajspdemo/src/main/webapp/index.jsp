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
			int i;
		%>
		<%
			for(i=0;i<10;i++) {
		%>
			<h1>
		<%
			out.print(i);
		%>
			</h1>
			</br>
		<%
			}
		%>
		<form action="login" method="post">
			Username: <input name="Username" type="text"  />
			Password: <input name="Password" type="Password"/>
		
			
			<input type="submit">Login</input>
		</form>
</body>
</html>