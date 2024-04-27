<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="fm"%>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Employee Edit Form</h1>
  
    <form action="${pageContext.request.contextPath}/searchEmployee" method="get">
        <label for="eid">Employee ID:</label>
        <input type="number" id="eid" name="eid" required><br>
        <button type="submit">Search</button>
    </form>
</body>
</html>