<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>User Login Form</h1>
<p>${message} </p>
<form action="LoginServlet" method="post">
<label for="username">Username</label>
<input type="text" id="username" name="username"><br>
<label for="password">Password</label>
<input type="password" id="password" name="password"><br>
<input type="submit" value="login">
</form>
</body>
</html>