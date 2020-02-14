<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create new User</title>
</head>
<body>
<form action = "getUsernameServlet" method="post"> 
	<h3>Create New User</h3>
	Enter First Name: 
	<input type="text" name="userFName" size="15">
	<br>
	Enter Last Name: 
	<input type="text" name="userLName" size="30">
	<br>
	<input type="submit" value="Generate Username"/>
</form>


<br><br>

<a href="index.jsp">Go Back</a>
</body>
</html>