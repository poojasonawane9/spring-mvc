<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/PersonSpringMVC/app/person/new" method="post">
Enter  your Id<input type="number" name="personId">
Enter Your Name<input type="text" name="personName">
<input type="submit" value="save">
</form>
</body>
</html>