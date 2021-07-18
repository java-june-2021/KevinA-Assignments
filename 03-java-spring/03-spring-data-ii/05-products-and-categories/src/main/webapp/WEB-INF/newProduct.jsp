<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Product</title>
</head>
<body>
	<h1>New Product</h1>
	<form action="/newProd" method="post">
		<div>
			<label for="name">Name:</label>
			<input type="text" name="name">
		</div>
		<div>
			<label for="desc">Description:</label>
			<input type="text" name="desc">
		</div>
		<div>
			<label for="price">Price:</label>
			<input type="text" name="price">
		</div>
		<button>Create</button>
	</form>
</body>
</html>