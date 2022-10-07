<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
     <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Account</title>
       <link rel="stylesheet" type="text/css" href="style.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>

    </head>
    <body>
        <div class="container">
            <div class="regbox box">
                
                <h1><center>Register Account</center></h1>
                <center>
<form action="registation" method="post">
                   <p>NICno</p>
<input type="text" placeholder="NIC no" name="nicno" required>
                   <p>email</p>
<input type="text" placeholder="email" name="email" required>
                   <p>Username</p>
<input type="text" placeholder="Username" name="name" required>
                   <p>Staff Grade</p>
<input type="text" placeholder="Staff Grade" name="staffgrade" required>

                   <p>Password</p>
<input type="password" placeholder="Password" name="password" required>
                   <br><br><br>
                   <button type="submit" class="btn btn-success">Register</button><br><br><button type="reset" class="btn btn-success" >RESET</button>
                   <br/><br/>
                   <a href="index.jsp">Already have Account?</a><br/><br/>
                   <a href="http://localhost:8080/clientsignup/registration.jsp"> Client Registration</a>
                </form></center>
</div>
</div>
</body>
</html>