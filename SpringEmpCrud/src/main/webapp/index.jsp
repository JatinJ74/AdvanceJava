<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sidebar Menu</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            display: flex;
            height: 100vh;
            background-color: #f2f2f2;
        }

        .sidebar {
            width: 250px;
            background-color: #333;
            padding-top: 20px;
            position: fixed;
            height: 100vh;
        }

        .sidebar a {
            padding: 15px 20px;
            text-decoration: none;
            font-size: 18px;
            color: white;
            display: block;
            border-radius: 4px;
            margin: 5px 10px;
        }

        .sidebar a:hover {
            background-color: #575757;
        }

        .content {
            margin-left: 250px;
            padding: 20px;
            flex-grow: 1;
        }

        .content h1 {
            font-size: 24px;
            margin-bottom: 20px;
        }

        .content p {
            font-size: 18px;
            color: #333;
        }
    </style>
</head>
<body>
    <div class="sidebar">
        <a href="add">Add Employee</a>
        <a href="#services">Services</a>
        <a href="#about">About</a>
        <a href="#contact">Contact</a>
    </div>

    <div class="content">
        <h1>Welcome to My Website</h1>
        <p>This is the main content area. Here you can put your main content that you want to display.</p>
    </div>
</body>
</html>
