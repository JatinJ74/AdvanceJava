<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="signup" method="post">
		
		<label for="username">Username:</label>
		<input type="text" id="username" name="username" placeholder="Enter your username" required>
		<br><br>
		<label for="email">Email:</label>
		<input type="email" id="email" name="email" placeholder="Enter your email address" required>
		<br><br>
		<label for="password">Password</label>
		<input type="password" id="password" name="password" placeholder="Enter your password" required>
		<br><br>
		
		<label for="gender">Gender:</label>
		<input type="radio" id="gender" name="gender" value="male">
		<label for="male">Male</label>
		<input type="radio" id="gender" name="gender" value="female">
		<label for="female">Female</label>
		<br><br>
		<label for="country">Country</label>
		<select id="country" name="country">
				<option Value="USA">USA</option>
				<option Value="INDIA">India</option>
				<option value="Europe">Europe</option>
		</select>
		<br><br>
		<label for="submit">Submit:</label>
		<input type="submit" id="submit" name="submit">
		<br><br>
		<label for="reset">Reset:</label>
		<input type="reset" id="reset" name="reset">
	</form>
</body>
</html>