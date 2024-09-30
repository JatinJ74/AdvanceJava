<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Softblush Beauty</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
    <style>
        body {
            margin: 0;
            padding: 0;
            font-family: 'Arial', sans-serif;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            background: url('hp1.png') no-repeat center center fixed; 
            background-size: cover;
        }

        .container {
            text-align: center;
            color: #5c3d3d;
        }

        h1 {
            font-size: 24px;
            font-weight: normal;
        }

        h2 {
            font-size: 48px;
            font-weight: normal;
        }

        p {
            font-size: 16px;
            margin: 20px 0;
        }

        .buttons {
            margin: 20px 0;
        }

        button {
            font-size: 16px;
            padding: 10px 20px;
            margin: 0 10px;
            border: none;
            border-radius: 5px;
            background-color: #f1f1f1;
            color: #5c3d3d;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }

        button:hover {
            background-color: #ddd;
        }

        .social-media {
            margin-top: 20px;
        }

        .social-media a {
            margin: 0 10px;
            color: #5c3d3d;
            font-size: 24px;
            text-decoration: none;
        }

        .social-media a:hover {
            color: #333;
        }
    </style>
</head>
<body>
<%
		response.setHeader("Cache-Control", "no-Cache, no-store, must-revalidate");
%>
    <div class="container">
        <h1>SOFTBLUSH BEAUTY</h1>
        <h2>Launching soon!</h2>
        <p>We are currently making some improvements to our website!</p>
        <div class="buttons">
            <a href="index.jsp"><button class="logut">Logout</button></a>
            
        </div>
        <div class="social-media">
            <a href="#"><i class="fab fa-facebook-f"></i></a>
            <a href="#"><i class="fab fa-instagram"></i></a>
            <a href="#"><i class="fab fa-twitter"></i></a>
        </div>
    </div>
</body>
</html>
