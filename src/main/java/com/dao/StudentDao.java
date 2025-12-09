package com.dao;
import java.sql.*;
import java.util.*;

import com.model.Student;

public class StudentDao 
{
	private Connection conn;
	
	public StudentDao(Connection conn)
	{
		this.conn = conn;
	}
	
	// Add Student
	public boolean addStudent(Student s)
	{
		boolean f = false;
		try
		{
			String sql = "INSERT INTO students(name,email,mobile,course) VALUES(?,?,?,?)";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1,s.getName());
			ps.setString(2,s.getEmail());
			ps.setString(3,s.getMobile());
			ps.setString(4,s.getCourse());
			
			f = ps.executeUpdate() > 0; // get record
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	
	// Get All students
	public List<Student> getAllStudents()
	{
		List<Student> list = new ArrayList<>();
		
		try
		{
			String sql = "SELECT * FROM students";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				Student s1 = new Student();
				
				s1.setId(rs.getInt(1));
				s1.setName(rs.getString(2));
				s1.setEmail(rs.getString(3));
				s1.setMobile(rs.getString(4));
				s1.setCourse(rs.getString(5));
				
				list.add(s1);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return list;
	}
	
	// Get single student
	public Student getStudent(int id)
	{
		Student s = null;
		
		try
		{
			String sql = "SELECT * FROM students WHERE id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next())
			{
				s = new Student();
				
				s.setId(rs.getInt(1));
				s.setName(rs.getString(2));
				s.setEmail(rs.getString(3));
				s.setMobile(rs.getString(4));
				s.setCourse(rs.getString(5));	
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return s;
	}
	
	//Update
	public boolean updateStudent(Student s)
	{
		boolean f = false;
		
		try
		{
			String sql = "UPDATE students SET name=?,email=?,mobile=?,course=? WHERE id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			
			ps.setString(1,s.getName());
			ps.setString(2, s.getEmail());
			ps.setString(3,s.getMobile());
			ps.setString(4, s.getCourse());
			ps.setInt(5, s.getId());
			
			f = ps.executeUpdate() > 0;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return f;
	}
	
	// delete
	public boolean deleteStudent(int id)
	{
		boolean f = false;
		
		try
		{
			String sql = "DELETE FROM students WHERE id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setInt(1,id);
			
			f = ps.executeUpdate() > 0;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return f;
	}
	
}
