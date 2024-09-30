<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Employee Management</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            background-color: #f5f5dc;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .container {
            background-color: #fff8dc;
            padding: 40px;
            border-radius: 10px;
            box-shadow: 0 8px 16px rgba(0, 0, 0, 0.2);
            max-width: 400px;
            width: 100%;
            text-align: center;
        }

        h1 {
            font-size: 28px;
            color: #8b4513;
            margin-bottom: 30px;
        }

        .menu {
            list-style-type: none;
            padding: 0;
            margin: 0;
        }

        .menu li {
            margin: 15px 0;
        }

        .menu a {
            text-decoration: none;
            background-color: #8b4513;
            color: #fff;
            padding: 12px 20px;
            border-radius: 5px;
            display: block;
            transition: background-color 0.3s ease;
        }

        .menu a:hover {
            background-color: #a0522d;
        }

        .menu a:active {
            background-color: #5a3412;
        }
    </style>
</head>
<body>
    <div class="container">
    	<h1>Welcome to the Employee Management System</h1>
    	<hr>
        <h1>Employee Management</h1>
        <ul class="menu">
            <li><a href="addEmployee">Add Employee</a></li>
            <li><a href="updateEmployee">Update Employee</a></li>
            <li><a href="deleteEmployee">Delete Employee</a></li>
            <li><a href="searchEmployee">Search Employee</a></li>
            <li><a href="employees">Employees List</a></li>
        </ul>
    </div>
</body>
<script>
    // Show alert if message is present
    var alertDiv = document.querySelector('.alert');
    if (alertDiv) {
        alertDiv.style.display = 'block';
    }
</script>
</html>
