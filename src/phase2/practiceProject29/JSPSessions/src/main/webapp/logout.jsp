<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>logout</title>
</head>
<body>
	<%
	        session.invalidate();
	%>
	<b>Your session has terminated.</b><br>
	<a href="index.jsp">Login again</a>

</body>
</html>