<%-- 
    Document   : AddToStaff
    Created on : Oct 6, 2022, 1:08:51 AM
    Author     : Ridma Navod Local
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Phoenix-Travels</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
    <header>
        <div class="main">
            <div class="navbar">
                <a href="AdminHome.jsp"><img src="3.png" class="logo"></a>
                <nav>
                    <ul>
                        <li><a href="AdminHome.jsp">Pending Approves</a></li>
                        <li><a href="index.html">Monitor Staff</a></li>
                        <li><a href="#">Monitor Clients</a></li>
                        <li class="active"><a href="#">Add to Staff</a></li>
                        <li><a href="#">Log Out</a></li>
                    </ul>
                </nav>
            </div><center>
            <form name="F1" action="message">
                <h4>NIC</h4>
                <input type="text" name="NIC" value="" />
                <br><br>
                <h4>Email</h4>
                <input type="text" name="Email" value="" />
                <br><br>
                <h4>Username</h4>
                <input type="text" name="Username" value="" />
                <br><br>
                <h4>Password</h4>
                <input type="password" name="Password" value="" />
                <br><br>
                <h4>Confirm Password</h4>
                <input type="password" name="Confirm Password" value="" />
            </form>  
            </center>
        </div>
    </header>
</body>
</html>
