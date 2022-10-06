<%@page import="java.io.PrintWriter" %>
<%@page import="java.sql.ResultSet" %>
<%@page import="java.sql.DriverManager" %>
<%@page import="java.sql.PreparedStatement" %>
<%@page import="java.sql.Connection" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Phoenix-Travels</title>
    <link rel="stylesheet" type="text/css" href="style.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</head>
<body>
    <header>
        <div class="main">
            <div class="navbar">
                <a href="AdminHome1.jsp"><img src="3.png" class="logo"></a>
                <nav>
                    <ul>
                        <li class="active"><a href="Flights.jsp">Staff G1</a></li>
                        <li><a href="Flights.jsp">Flights</a></li>
                        <li><a href="index.html">Add Flights</a>
                        <li><a href="#">Tickets</a></li>
                        <li><a href="home.jsp">Clients</a></li>
                        <li><a href="#">Log Out</a></li>
                    </ul>
                </nav>
            </div>
            
        </div>
        <div class="container">
            
            <div class="form-group">
                <h2>Available Flights</h2>
        </div>
            
            <div class="form-group">
                <form method="get" action="flightdata">
                    <div class="form-group">
            <h3>Select Flight</h3>
        <% 
            Connection con;
            PreparedStatement pat;
            ResultSet rs;
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost/flights","root","");
                pat=con.prepareStatement("select distinct Flight_ID from flights");
                rs=pat.executeQuery();
                
                if(rs.next())
                {
                    out.println("<tr>");
                    out.println("<td> Choose Flight</td>");
                    out.println("<td>");
                    out.println("<select Flight_ID='combo'>");
                do{
                    String Flight_ID = rs.getString("Flight_ID");
                    out.println("<option value='"+ Flight_ID + "'>" + Flight_ID + "</option>");
                }
                while(rs.next());
                out.println("</select>");
                rs.close();
                out.println("</td></tr>");
                out.println("</tr><td colspan=2 align=center><input type=submit value=Show></td></tr>");
                }
            
            else
            {
                out.println("<tr>");
                out.println("<td colsppan=2 alingn=right>");
                out.println("Sorry Table is empty");
                out.println("</td");
            }
            out.println("</table");
            out.println("/form");
            }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        %>
        </div>
        
    </form>
    
    </div>
    </div>
    </div>
    
        <br><br>
        
    </header>
    
   
    
</body>

</html>