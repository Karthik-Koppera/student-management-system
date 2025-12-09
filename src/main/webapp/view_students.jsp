<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page 
	import="com.dao.*,com.model.*,java.util.*"
%>



<%
	StudentDao dao = new StudentDao(DBConnect.get());
	List<Student> list = dao.getAllStudents();
%>

<h2 style="text-align:center;">All Students</h2>

<table border="1" style="width:80%;margin:0 auto;">

	<tr>
		<th>ID</th><th>Name</th><th>Email</th><th>Mobile</th><th>Course</th><th>Action</th>
	</tr>
	
	<% for(Student s: list) { %>
	<tr>
			<td><%=s.getId()%></td>
			<td><%=s.getName()%></td>
			<td><%=s.getEmail()%></td>
			<td><%=s.getMobile()%></td>
			<td><%=s.getCourse()%></td>
		<td><a href="EditStudentServlet?id=<%=s.getId()%>">Edit</a>
		<a href="DeleteStudentServlet?id=<%=s.getId()%>">Delete</a></td>
	</tr>	
	
	<%} %>
</table>

