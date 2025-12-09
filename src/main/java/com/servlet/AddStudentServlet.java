package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.DBConnect;
import com.dao.StudentDao;
import com.model.Student;


@WebServlet("/AddStudentServlet")
public class AddStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		String course = request.getParameter("course");
		
		Student s = new Student();
		
		s.setName(name);
		s.setEmail(email);
		s.setMobile(mobile);
		s.setCourse(course);
		
		StudentDao dao = new StudentDao(DBConnect.get());

		boolean f = dao.addStudent(s);
		
		response.sendRedirect("view_students.jsp");
	}

}
