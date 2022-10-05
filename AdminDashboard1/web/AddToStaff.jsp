<%-- 
    Document   : AddToStaff
    Created on : Oct 5, 2022, 2:19:44 PM
    Author     : Ridma Navod Local
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Phoenix-Travels</title>
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    <body>
        <header>
        <div class="main">
            <div class="navbar">
                <img src="3.png" class="logo">
                <nav>
                    <ul>
                        <li><a href="AdminHome1.jsp">Pending Approves</a></li>
                        <li><a href="index.html">Monitor Staff</a></li>
                        <li><a href="#">Monitor Clients</a></li>
                        <li class="active"><a href="#">Add to Staff</a></li>
                        <li><a href="#">Log Out</a></li>
                    </ul>
                </nav>
            </div>
            
        </div>
        </header><center>
        <form name="F1" action="messege.jsp">
            <h4>NIC</h4>
            <input type="text" name="NIC" value="" />
            </br></br>
            <h4>Email</h4>
            <input type="text" name="Email" value="" />
            </br></br>
            <h4>Username</h4>
            <input type="text" name="Username" value="" />
            </br></br>
             <h4>password</h4>
            <input type="password" name="Password" value="" />
            </br></br>
            <h4>Confirm Password</h4>
            <input type="password" name="Confirm Password" value="" />
            </br></br>
            <h4>Staff Grade</h4>
            <input type="text" name="StaffGrade" value="" />
        </form></center>

    </body>
</html>
