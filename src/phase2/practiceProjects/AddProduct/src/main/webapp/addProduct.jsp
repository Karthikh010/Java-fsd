<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Add Product</title>
</head>
<body>
    <h1>Add Product</h1>
    <br><br>
    <form action="AddProductServlet" method="post">
        Name: <input type="text" name="name" required><br><br>
        Price: <input type="text" name="price" required><br><br>
        HDD: <input type="text" name="partsHdd" required><br><br>
        CPU: <input type="text" name="partsCpu" required><br><br>
        RAM: <input type="text" name="partsRam" required><br><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
