<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register New User</title>
</head>
<body>
    <h1> Register page </h1>
    <div>
        <form:form modelAttribute="newUser" action="registerUser" method="POST">
            User id: <form:input path="uid" name="uid"/>
            User Name: <form:input path="name" name="name"/>
            Password: <form:input path="password" name="password"/>
            <input type="submit" value="Register"/>
        </form:form>
        <!--
        <form action="/registerUser" method="POST">
            <h4>User Id: </h4>
            <input type ="text" name ="uid"/>
            <h4>User Name: </h4>
            <input type="text" name="uname"/>
            <h4>Password: </h4>
            <input type="password" name="password"/>
            <input type="button" onclick="submit" value="Register"/>
        </form>-->
    </div>
    
    <div>
        <a href = "/"><h3>Back to Home</h3></a>
        <a href = "/listAll"><h3>List all Users</h3></a>
    </div>
</body>
</html>
