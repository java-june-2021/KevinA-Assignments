<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product</title>
</head>
<body>	
	<h1><c:out value="${product.name}"/></h1> 
	<p><c:out value="${product.description}"/> </p>
	<p><c:out value="${product.price}"/> </p>
	<hr>
	<h2>Categories:</h2>
	<c:forEach items="${product.categories}" var="cat">
		<li><a href="/categories/${cat.id}">${cat.name}</a></li>
	</c:forEach>
	
	<h3>Add Category to Product</h3>
	<form action="/products/${product.id}" method="POST">
		<select name="showCat">
		<c:forEach items="${category}" var="otherCat">
		<option value="${otherCat.id}">${otherCat.name}</option>
		</c:forEach>
		</select>
		<button>Add</button>
	</form>
</body>
</html>