<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Employee Saved</title>
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
            margin-bottom: 20px;
        }

        p {
            font-size: 18px;
            color: #004d40;
            margin-bottom: 30px;
        }

        a {
            text-decoration: none;
            background-color: #00796b;
            color: white;
            padding: 12px 20px;
            border-radius: 5px;
            display: inline-block;
            transition: background-color 0.3s ease;
        }

        a:hover {
            background-color: #004d40;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Employee Saved</h1>
        <p>Employee data has been successfully saved.</p>
        <a href="index.jsp">Return to Home</a>
    </div>
</body>
</html>
