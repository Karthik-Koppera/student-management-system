# Student Management System

A simple web-based CRUD application developed using Java, JDBC, Servlets, JSP, and MySQL.  
This project follows the MVC architecture.

---

## ✅ Features
- Add Student
- View All Students
- Update Student Details
- Delete Student

---

## 🛠 Technologies Used
- Java
- JDBC
- Servlets
- JSP
- MySQL
- Apache Tomcat

---



## 📂 Project Structure
```
StudentManagementSystem/
│
├── src/
│   └── com/
│       └── student/
│           └── management/
│               ├── controller/
│               ├── dao/
│               ├── model/
│
├── WebContent/
│   ├── index.jsp
│   ├── add-student.jsp
│   ├── edit-student.jsp
│   ├── view-students.jsp
│   └── css/
│       └── style.css
│
├── sql/
│   └── studentdb.sql
│
├── README.md
└── .gitignore
```

## 🗄 Database Design
---
CREATE DATABASE studentdb;

USE studentdb;

CREATE TABLE students (id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(100), email VARCHAR(100), mobile VARCHAR(20), course
VARCHAR(100));

---

## ⚙ How to Run the Project
1. Import the project into *Eclipse* as a Dynamic Web Project
2. Add *mysql-connector-j.jar* to the lib folder
3. Update database credentials in DBConnect.java
4. Configure and run the project on *Apache Tomcat*
5. Open browser and visit:
http://localhost:8080/StudentManagement/

---

## 🎯 Learning Outcomes
- Understood MVC architecture in Java web applications
- Implemented CRUD operations using JDBC
- Gained hands-on experience with Servlets and JSP
- Worked with MySQL database and Apache Tomcat server

---

## 📌 Future Enhancements
- Add input validations
- Add login & authentication
- Implement pagination
- Convert project to Spring Boot

---

## 👤 Author
Koppera Karthik
GitHub: https://github.com/Karthik-Koppera
