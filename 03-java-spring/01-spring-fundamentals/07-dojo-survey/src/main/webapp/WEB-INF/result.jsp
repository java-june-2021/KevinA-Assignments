<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Results</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<div class="wrapper">
		<h2>Submitted Info</h2>
		<p>Name: <c:out value="${nameForResult}"/> </p>
		<p>Location: <c:out value="${locationForResult}"/> </p>
		<p>Favorite Language: <c:out value="${languageForResult}"/> </p>
		<p>Comments: <c:out value="${commentForResult}"/> </p>
	</div>
</body>
</html>