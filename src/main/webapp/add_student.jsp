<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Student</title>
</head>
<body>
	<h2>Add Student</h2>
	
	<form action="AddStudentServlet" method="post">
		Name: <input type="text" name="name"><br/>
		Email: <input type="text" name="email"><br/>
		Mobile: <input type="text" name="mobile"><br/>
		Course: <input type="text" name="course"><br/>
		<button type="submit">Add</button>
	</form>
	
</body>
</html>