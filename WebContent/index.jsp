<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Convert Temperature</title>
</head>
<body>
<h1>Convert Temperature</h1>
<form action = "getFahrServlet" method="post"> 
	<h3>Celsius to Fahrenheit</h3>
	Enter your Celsius to convert:
	<input type="text" name="userTemp" size="10">
	<br>
	<input type="submit" value="Get Fahrenheit"/>
</form>
<br>
<form action = "getCelsServlet" method="post"> 
	<h3>Fahrenheit to Celsius</h3>
	Enter your Fahrenheit to convert:
	<input type="text" name="userTemp" size="10">
	<br>
	<input type="submit" value="Get Celsius">
</form>
</body>
</html>