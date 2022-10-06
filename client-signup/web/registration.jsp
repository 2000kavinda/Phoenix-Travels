<%-- 
    Document   : registration
    Created on : Oct 6, 2022, 10:57:27 AM
    Author     : Pasindu Maleesha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
     <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Account</title>
        <link href="https://fonts.googleapis.com/css?family=ZCOOL+XiaoWei" rel="stylesheet">
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="container">
            <div class="regbox box">
                <img class="avatar" src="img/pngfind.com-phoenix-bird-logos-png-6672664.png">
                <h1>Register Account</h1>
<form action="RegisterServlet1" method="post">
                   <p>NICno</p>
<input type="text" placeholder="NIC no" name="nicno" required>
                   <p>email</p>
<input type="text" placeholder="email" name="nicno" required>
                   <p>Username</p>
<input type="text" placeholder="Username" name="name" required>
                   <p>Password</p>
                   <input type="password" placeholder="Password" name="password" required>
                   <p>Confirm Password</p>
                   <input type="password" placeholder="Confirm Password" name="confirmpassword" required>
                   <input type="submit" value="Register">
                   <a href="index.jsp">Already have Account?</a><br/>
                   <a href="http://localhost:8080/WebApplication3/registration.jsp"> staff members registration</a>
                </form>
</div>
</div>
</body>
</html>
