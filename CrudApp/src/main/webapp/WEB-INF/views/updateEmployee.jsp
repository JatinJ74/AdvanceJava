<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Update Employee Info</title>
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

        input[type="text"],
        input[type="number"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 20px;
            border: 1px solid #b0bec5;
            border-radius: 5px;
            box-sizing: border-box;
            font-size: 16px;
        }

        button,
        input[type="submit"] {
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

        button:hover,
        input[type="submit"]:hover {
            background-color: #004d40;
        }

        .success {
            color: green;
            margin-bottom: 20px;
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
        <h1>Update Employee Info - Page</h1>
        <hr>
        <form action="updateEmployee" method="post">
            <label for="empVerify">Enter Employee ID:</label>
            <input type="text" placeholder="Employee ID" id="empVerify" name="empId" required>
            <button type="submit">Fetch Employee Data</button>
        </form>

        <c:if test="${not empty empFound}">
            <div class="success">${empF}</div>
            <div>
                <h2>Fill the form to update Employee Info</h2>
                <form action="saveUpdatedEmployeeInfo" method="post">
                    <input type="hidden" name="empId" value="${employee.empId}">
                    
                    <label for="empName">Employee Name:</label> 
                    <input type="text" id="empName" name="empName" value="${employee.empName}" required> 
                    
                    <label for="empRole">Employee Role:</label> 
                    <input type="text" id="empRole" name="empRole" value="${employee.empRole}" required>

                    <label for="empDepart">Employee Department:</label> 
                    <input type="text" id="empDepart" name="empDepart" value="${employee.empDepart}" required> 
                    
                    <label for="empSalary">Employee Salary:</label> 
                    <input type="number" id="empSalary" name="empSalary" value="${employee.empSalary}" required> 
                    
                    <input type="submit" value="Update Employee Info">
                </form>
            </div>
        </c:if>

        <c:if test="${not empty message}">
            <div class="error">${message}</div>
            <div>
                <a href="${pageContext.request.contextPath}/addEmployee">Add Employee To Update Employee Info</a>
            </div>
        </c:if>
        <hr>
        <a href="${pageContext.request.contextPath}/index">Back to Menu</a>
    </div>
</body>
</html>
