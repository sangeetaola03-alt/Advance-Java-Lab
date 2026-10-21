
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registration Result</title>
</head>
<body>
<%
    String name = request.getParameter("name");
    String email = request.getParameter("email");
    String course = request.getParameter("course");
    String age = request.getParameter("age");
    String roll = request.getParameter("roll");

    if (name == null) name = "";
    if (email == null) email = "";
    if (course == null) course = "";
    if (age == null) age = "";
    if (roll == null) roll = "";
%>

<h1>Registration Successful</h1>
<hr>
<h3>Student Details</h3>
<p>Name: <%= name %></p>
<p>Email: <%= email %></p>
<p>Course: <%= course %></p>
<p>Age: <%= age %></p>
<p>Roll No: <%= roll %></p>

<a href="student.jsp">Back to Form</a>
</body>
</html>
