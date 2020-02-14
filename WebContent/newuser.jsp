<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>NewUser</title>
</head>
<body>

<p>
Thank you ${userNameOut.getfName() } your user name is:  <br /><br>

${userNameOut.getUserName() } <br />

<br><br>

<a href="login.jsp">Enter another Name</a> <br>
<a href="index.jsp">HomePage</a>
</p>

</body>
</html>