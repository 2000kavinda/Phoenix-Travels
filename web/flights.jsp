<%-- 
    Document   : flights
    Created on : Oct 7, 2022, 2:44:37 AM
    Author     : Kavinda Udara
--%>

<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Phoenix-Travels</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="style.css">
       
        
    </head>
    <body>
        <header>
        <div class="main">
            <div class="navbar">
               <a href="dashboard.html"><img src="3.png" class="logo"></a>
                <nav>
                    <ul>
                        <li><a href="dashboard.html">Home</a></li>
                        <li class="active"><a href="flights.jsp">Flights</a></li>
                        <li><a href="bookflight.html">Book Flight</a></li>
                        <li><a href="index.jsp">My Bookings</a></li>
                        <li><a href="#">Log Out</a></li>
                    </ul>
                </nav>
            </div>
    
        <div class="container">
            
            
                    <div class="form-group">
                        <br><br><br>
                        <center><h1>Filter Flights</h1></center>
                    </div>
                <br>
                <div class="form-group">
                    
            <center><form method="get" action="filter">    
                      <div class="form-group">
                          <br><h2>Select the Destination</h2><br>
       <%
            Connection con;
            PreparedStatement pst;
            ResultSet rs;
         try
{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/phoenix","root","");
            pst = con.prepareStatement("select distinct Destination from flights");
    rs=pst.executeQuery();
            
            if(rs.next())
   {
      out.println("<tr>");
              out.println("<td><b>Choose Destination Name</b></td>");
      out.println("<td>");
      out.println("<select name='combo'>");
  do{
            String cityname = rs.getString("Destination");
    out.println("<option value='"+ cityname   +"'>" +  cityname +  "</option>");
          }
            while(rs.next());
   out.println("</select>");
           rs.close();
   out.println("</td></tr>");
           out.println("</tr><td colspan=2 align=center><input type=submit  value=Search></td></tr>");
           }
           else
            {
           out.println("<tr>");
   out.println("<td colspan=2 align=right>");
   out.println("Sorry table is Empty");
           out.println("</td>");
            }
 
   out.println("</form>");
  }
        catch(Exception e)
        {
                 e.printStackTrace(); // Or System.out.println(e);
        }
                              
        %>
         </div>
                    
          
                    
            </form> </center>                   
                    
              </div>      
              
     </div>

 
    </body>
</html>
