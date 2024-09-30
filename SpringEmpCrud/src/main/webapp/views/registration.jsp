<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Registration Page</title>
<style>
body {
	font-family: Arial, sans-serif;
	margin: 0;
	padding: 0;
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
	background-color: #f2f2f2;
}

.form-container {
	background-color: #fff;
	padding: 20px;
	border-radius: 8px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
	width: 500px;
}

.form-container h2 {
	margin-bottom: 20px;
	text-align: center;
}

.form-container label {
	display: block;
	margin-bottom: 8px;
	font-weight: bold;
}

.form-container input[type="text"], .form-container input[type="email"],
	.form-container input[type="tel"], .form-container textarea {
	width: 95%;
	padding: 10px;
	margin-bottom: 15px;
	border: 1px solid #ccc;
	border-radius: 4px;
}

.form-container button {
	width: 100%;
	padding: 10px;
	margin: 10px;
	background-color: #4CAF50;
	border: none;
	border-radius: 4px;
	color: white;
	font-size: 16px;
	cursor: pointer;
	background-color: #4CAF50;
}

.form-container buttion:hover {
	background-color: #45a049;
}
</style>
</head>
<body>
	<div class="form-container">
		<h2>Submit Your Details</h2>
		<form:form action="reg" method="post" modelAttribute="employee">
			<label for="name">Name</label>
			<form:input path="name" type="text" id="name" />
			<form:errors path="name" style="color:red"></form:errors>
			<label for="email">Email</label>
			<form:input path="email" type="email" id="email" />
			<form:errors path="email" style="color:red"></form:errors>

			<label for="phone">Phone Number</label>
			<form:input type="tel" id="phone" path="phoneNo" />
			<form:errors path="phoneNo" style="color:red"></form:errors>

			<label for="area">Area</label>
			<form:textarea id="area" path="address.area" rows="3"></form:textarea>
			<form:errors path="address.area" style="color:red"></form:errors>


			<label for="pincode">Pincode</label>
			<form:input type="text" id="pincode" path="address.pincode" />
			<form:errors path="address.pincode" style="color:red"></form:errors>
			<form:button type="submit" value="Add Employee">Add Employee</form:button>
			<form:button type="reset" value="Reset">Reset</form:button>
		</form:form>
	</div>
</body>
</html>
