<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.ecommerce.Product" %>


<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Product Information</title>
</head>
<body>
    <h1>Product Information</h1>
    <% 
        Product product = (Product) session.getAttribute("product");
        if(product != null) 
        {
    %>
    <p>Name: <%= product.getName() %></p>
    <p>Price: <%= product.getPrice() %></p>
    <p>Brand: <%= product.getBrand() %></p>
    <% } 
        else 
        {
  	%>
    <p>No product information available.</p>
    <% } %>
</body>
</html>
