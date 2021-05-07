<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.niraj.SpringBootDemoWithJPA.entity.User"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dashboard</title>
</head>
<body>
    <h1> Dashboard page </h1>
    <div>
        <%
            User u = (User)request.getAttribute("loggedinuser");
        %>
        Welcome <%out.print(u.getName());%>
    </div>
    <div>
        <a href="/login"><h3>Login</h3></a>
        <a href = "/register"><h3>Register New User</h3></a>
        <a href = "/listAll"><h3>List all Users</h3></a>
    </div>
</body>
</html>
