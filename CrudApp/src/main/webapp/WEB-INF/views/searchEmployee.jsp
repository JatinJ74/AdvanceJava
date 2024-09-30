<%@ page import="org.springframework.ui.Model"%>
<%@ page import="com.gvacharya.crudapp.entities.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
    <title>View Employee</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            background-color: #e0f7fa;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .container {
            background-color: #ffffff;
            padding: 40px;
            border-radius: 10px;
            box-shadow: 0 8px 16px rgba(0, 0, 0, 0.2);
            max-width: 500px;
            width: 100%;
            text-align: center;
        }

        h1 {
            font-size: 24px;
            color: #00796b;
            margin-bottom: 30px;
        }

        form {
            display: flex;
            flex-direction: column;
            align-items: center;
        }

        label {
            font-size: 16px;
            margin-bottom: 10px;
            color: #004d40;
            width: 100%;
            text-align: left;
        }

        input[type="text"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 20px;
            border: 1px solid #b0bec5;
            border-radius: 5px;
            box-sizing: border-box;
            font-size: 16px;
        }

        button {
            background-color: #00796b;
            color: white;
            padding: 12px 20px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            font-size: 16px;
            width: 100%;
            transition: background-color 0.3s ease;
        }

        button:hover {
            background-color: #004d40;
        }

        .employee-details {
            margin-bottom: 20px;
            text-align: left;
        }

        .employee-details p {
            margin: 5px 0;
            font-size: 16px;
            color: #004d40;
        }

        .error {
            color: red;
            margin-bottom: 20px;
        }

        a {
            color: #00796b;
            text-decoration: none;
        }

        a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Search Employee</h1>
        <hr>
        <form action="searchEmployee" method="post">
            <label for="empId">Enter Employee ID:</label>
            <input type="text" id="empId" name="empId" required>
            <button type="submit">Search</button>
        </form>
		<div>
			<c:if test="${not empty employee}">
            <div class="employee-details">
                <p><strong>Employee ID:</strong> ${employee.empId}</p>
                <p><strong>Name:</strong> ${employee.empName}</p>
                <p><strong>Role:</strong> ${employee.empRole}</p>
                <p><strong>Department:</strong> ${employee.empDepart}</p>
                <p><strong>Salary:</strong> ${employee.empSalary}</p>
            </div>
        </c:if>

        <c:if test="${not empty message}">
            <div class="error">${message}</div>
        </c:if>		
		</div>
        

        <hr>
        <a href="${pageContext.request.contextPath}/index">Back to Menu</a>
    </div>
</body>
</html>
