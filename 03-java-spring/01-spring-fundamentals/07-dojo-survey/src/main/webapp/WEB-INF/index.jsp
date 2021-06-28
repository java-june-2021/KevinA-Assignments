<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tell Me More.</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<div class="wrapper">
		<form method="POST" action="/result">
			<p>
				<label for="name">Name:</label>
				<input type="text" id="name" name="name">
			</p>
			<p>
				<label for="location">Choose a location:</label>
				<select id="location" name="location">
  					<option value="San Jose">San Jose</option>
  					<option value="Boise">Boise</option>
  					<option value="Oakland">Oakland</option>
  					<option value="Dallas">Dallas</option>
				</select>
			</p>
			<p>
				<label for="language">Favorite Language:</label>
				<select id="language" name="language">
  					<option value="Python">Python</option>
  					<option value="JavaScript">JavaScript</option>
  					<option value="Java">Java</option>
  					<option value="HTML">HTML</option>
  					<option value="CSS">CSS</option>
				</select>
			</p>
			<p>Comment: (Optional)</p>
			<p>
				<label for="comment"></label>
				<textarea id="comment" name="comment" rows="4" cols="50"></textarea>
			</p>
			<button>Submit</button>
		</form>
	</div>
</body>
</html>