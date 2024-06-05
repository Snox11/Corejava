<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SignUp</title>
</head>
<body>
<h1>Signup Form</h1>
<p> ${message}</p>
<form action="SignUpServlet" method="post">
First Name<input type="text" name="fname">
Last Name<input type="text" name="lname">
<hr>
Username<input type="text" name="username">
<hr>
Password<input type="password" name="password">
Confirm Password<input type="password" name="conpass">
<input type="submit" value="Signup">
</form>
</body>
</html>