<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Employee</title>
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

        input[type="submit"]:hover {
            background-color: #004d40;
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
        <h1>Add Employee</h1>
        <hr>
        <form action="saveEmployee" method="post">
            <label for="employeeId">Employee ID:</label>
            <input type="text" id="employeeId" name="empId" required>

            <label for="empName">Employee Name:</label>
            <input type="text" id="empName" name="empName" required>

            <label for="empRole">Employee Role:</label>
            <input type="text" id="empRole" name="empRole" required>

            <label for="empDepart">Employee Department:</label>
            <input type="text" id="empDepart" name="empDepart" required>

            <label for="empSalary">Employee Salary:</label>
            <input type="number" id="empSalary" name="empSalary" required>

            <input type="submit" value="Add Employee">
        </form>
        <hr>
        <a href="index">Back to Menu</a>
    </div>
</body>
</html>
