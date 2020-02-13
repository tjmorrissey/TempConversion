<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Conversion Result</title>
</head>
<body>
<h2>Results are in</h2>
<p>
${userTempOut.getOutput() } <br />
<a href="index.jsp"> Enter another Temperature</a>
</p>

</body>
</html>