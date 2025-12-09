<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@page 
	import="com.model.Student"
%>

<%
	 Student s = (Student) request.getAttribute("stu");
%>

<h2>Edit Student</h2>

<form action="UpdateStudentServlet" method="post">
	
	ID: <input type="text" name="id" value="<%=s.getId()%>"><br/>
	Name: <input type="text" name="name" value="<%=s.getName()%>"><br/>
	Email: <input type="text" name="email" value="<%=s.getEmail()%>"><br/>
	Mobile: <input type="text" name="mobile" value="<%=s.getMobile()%>"><br/>
	Course: <input type="text" name="course" value="<%=s.getCourse()%>"><br/>
	<button type="submit">Update</button>
	
</form>