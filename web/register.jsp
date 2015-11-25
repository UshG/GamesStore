<%-- 
    Document   : register
    Created on : 25-Nov-2015, 19:43:16
    Author     : Matt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Registration</title>
    </head>
    <body>
        <h1>Register</h1>
    <form id="createPersonForm" action="CreatePerson" method="post">
    <table>
        <tr><td>First Name</td><td><input type="text" id = "firstName" name="firstName" /></td></tr>
        <tr><td>Last Name</td><td><input type="text" id = "lastName" name="lastName" /></td></tr>
        <tr><td>Username</td><td><input type="text" id = "username" name="username" /></td></tr>
        <tr><td>Email Address</td><td><input type="text" id = "email" name="email" /></td></tr>
    </table>
    <input type="submit" id="Register" value="Register" /> <a href="login.jsp"><strong>Already a user?</strong></a>
    </form>
    </body>
</html>
