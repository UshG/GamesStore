<%-- 
    Document   : login
    Created on : 25-Nov-2015, 17:59:46
    Author     : Matt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        
        <h1>User Login</h1>
    <form id="userLoginForm" action="UserLogin" method="post">
    <table>
        <tr><td>Username</td><td><input type="text" id = "username" name="username" /></td></tr>
        <tr><td>Password</td><td><input type="text" id = "password" name="password" /></td></tr>
    </table>
        <input type="submit" id="UserLogin" value="Login" />
    </form>
        
    </body>
</html>
