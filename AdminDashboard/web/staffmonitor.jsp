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
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
        
    </head>
    <body>
        <header>
        <div class="main">
            <div class="navbar">
                <a href="AdminHome.jsp"><img src="3.png" class="logo"></a>
                <nav>
                    <ul>
                        <li><a href="AdminHome.jsp">Pending Approves</a></li>
                        <li class="active"><a href="staffmonitor.jsp">Monitor Staff</a></li>
                        <li><a href="#">Monitor Clients</a></li>
                        <li><a href="staffadd.html">Add to Staff</a></li
                        <li><a href="#">Log Out</a></li>
                    </ul>
                </nav>
            </div>
            
        </div>
    </header>
        <div class="container">
            
            </br></br></br>
                    <div class="form-group">
                        <h2>Monitor Staff Activities</h2>
                    </div>
               
                <div class="form-group">
            <form method="get" action="staffservlet">    
                      <div class="form-group">
                          <h3>Select the Staff Member</h3></br></br>
       <%
            Connection con;
            PreparedStatement pst;
            ResultSet rs;
         try
{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/phoenix","root","");
            pst = con.prepareStatement("select distinct nic from staff");
    rs=pst.executeQuery();
            
            if(rs.next())
   {
      out.println("<tr>");
              out.println("<td><b>Choose NIC No</b></td>");
      out.println("<td>");
      out.println("<select name='combo'>");
  do{
            String NICno = rs.getString("nic");
    out.println("<option value='"+ NICno   +"'>" +  NICno +  "</option>");
          }
            while(rs.next());
   out.println("</select>");
           rs.close();
   out.println("</td></tr>");
           out.println("</tr><td colspan=2 align=center><input type=submit  value=Retrieve></td></tr>");
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
                    
          
                    
          </form>                    
                    
              </div>      
              
     </div>
</div>
 
    </body>
</html>