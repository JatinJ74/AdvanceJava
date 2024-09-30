<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Softblush Beauty - Login</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
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

        .login-container {
            background-color: rgba(255, 255, 255, 0.8);
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0px 0px 10px 0px rgba(0, 0, 0, 0.1);
            text-align: center;
        }

        .login-container h2 {
            color: #5c3d3d;
            margin-bottom: 20px;
        }

        .login-container .form-control {
            margin-bottom: 15px;
        }

        .login-container .btn {
            background-color: #5c3d3d;
            color: #fff;
            border: none;
            width: 100%;
        }

        .login-container .btn:hover {
            background-color: #333;
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
    <div class="login-container">
        <h2>Login to Softblush Beauty</h2>
        <form action="signup" method="post">
            <div class="form-group">
                <label for="Username">Username</label>
                <input type="text" class="form-control" id="username" name="userName" placeholder="Enter Username">
            </div>
            <div class="form-group">
                <label for="password">Password</label>
                <input type="password" class="form-control" id="password" name="password" placeholder="Password">
            </div>
            <!-- Using <a> tag styled as a button -->
            <!-- <a href="your-redirect-url.html" class="btn">Login</a> -->

            <!-- Using JavaScript for redirection -->
            <button type="button" class="btn" onclick="window.location.href='userhome.jsp'">Signup</button>
        </form>
        <div class="social-media">
            <a href="#"><i class="fab fa-facebook-f"></i></a>
            <a href="#"><i class="fab fa-instagram"></i></a>
            <a href="#"><i class="fab fa-twitter"></i></a>
        </div>
    </div>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>
