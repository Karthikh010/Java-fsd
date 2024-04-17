<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Product</title>
</head>
<body>
    <h1 style="text-align:center;">Add Product</h1><br><br>
    <form action="AddProduct" method="post">
    	 <p align="center">
    	 	 <label>Name:</label><br>
	        <input type="text" name="name"><br><br>
	        <label>Price:</label><br>
	        <input type="text" name="price"><br><br>
	        <label>Brand:</label><br>
	        <input type="text" name="brand"><br><br>
	        <input type="submit" value="Add Product">
    	 </p>
    </form>
</body>
</html>
