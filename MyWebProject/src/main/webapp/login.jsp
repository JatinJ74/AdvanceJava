<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="login" method="post">
		<label for="username">Username:</label>
		<input type="text" id="username" name="username" placeholder="Enter your username" required>
		<br><br>
		<label for="password">Password:</label>
		<input type="password" id="password" name="password" placeholder="Enter your password" required>
		<label for="submit">Login:</label>
		<input type="submit" id="submit">
	</form>
</body>
</html>