<%@page import="java.util.ArrayList"%>
<%@page import="com.niraj.SpringBootDemoWithJPA.entity.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All Users List</title>
</head>
<body>
    <h1> List page </h1>
    <div>
        <table>
            <tr>
                <td>User Id</td>
                <td>User Name</td>
                <td>Password</td>
            </tr>
            <%
                ArrayList<User> userList = (ArrayList<User>)request.getAttribute("userList");
                for(User usr: userList){ %>
                    <tr>
                    <td><%out.print(usr.getUid());%></td>
                    <td><%out.print(usr.getName());%></td>
                    <td><%out.print(usr.getPassword());%></td>
                    </tr>
                <%}
            %>
        </table>
    </div>
</body>
</html>
