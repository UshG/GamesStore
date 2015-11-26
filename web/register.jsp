<%-- 
    Document   : register
    Created on : 25-Nov-2015, 19:43:16
    Author     : Matt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<script type="text/javascript" src=PasswordValidation.js"></script>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Registration</title>
    </head>
    <body>
        <h1>Register</h1>
    <form id="RegisterUserForm" action="RegisterUser" method="post">
    <table>
        <tr><td>First Name</td><td><input type="text" placeholder="First Name" id = "first_name" name="firstName" required/></td></tr>
        <tr><td>Last Name</td><td><input type="text" placeholder="Surname" id = "last_name" name="lastName" required/></td></tr>
        <tr><td>Username</td><td><input type="text" placeholder="Username" id = "username" name="username" required/></td></tr>
        <tr><td>Email Address</td><td><input type="text" placeholder="Email Address" id = "email" name="email" required/></td></tr>
        <div class="PasswordValidation">
    <form>
            <tr><td>Password</td><td><input type="password" placeholder="Password" name="pass1" id="pass1" required>
        </div>
            <tr><td>Confirm Password</td><td><input type="password" placeholder="Confirm Password" name="pass2" id="pass2" required onkeyup="checkPass(); return false;">
            <span id="confirmMessage" class="confirmMessage"></span>
        </div>
    </form>
</div>
    </table>
    <input type="submit" id="Register" value="Register" /> <a href="login.jsp"><strong>Already a user?</strong></a>
    </form>
    </body>
</html>
