/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Kavinda Udara
 */
@WebServlet("/filter")
public class filter extends HttpServlet
{
    int i;
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        try {
            i++;
            PrintWriter out = response.getWriter();
            response.setContentType("text/html");
            String cityname= request.getParameter("combo");
 
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/phoenix","root","");

            pst = con.prepareStatement("select * from flights where Destination=?");
            pst.setString(1, cityname);
            rs = pst.executeQuery();
            
             out.println("<table width=100% border= 1   >");
             out.println("<tr><td colspan=8 " );
             out.println("<h2><center><b>Flight Details</b></center></h2>");
             out.println("</td></tr>");
             out.println("<tr>");
             out.println("<th>Flight_ID</th>");
             out.println("<th>Departure</th>");
             out.println("<th>Destination</th>");
             out.println("<th>Departure_date</th>");
             out.println("<th>Departure_time</th>");
             out.println("<th>Arrival_date</th>");
             out.println("<th>Arrival_time</th>");
             out.println("<th>Price</th>");
             out.println("</tr>");
              
              while(rs.next())
              {
                  out.println("<tr>");
                  out.println("<td>" + rs.getString("Flight_ID") + "</td> ");
                  out.println("<td>" + rs.getString("Departure") + "</td> ");
                  out.println("<td>" + rs.getString("Destination") + "</td> ");
                  out.println("<td>" + rs.getString("Departure_date") + "</td> ");
                  out.println("<td>" + rs.getString("Departure_time") + "</td> ");
                  out.println("<td>" + rs.getString("Arrival_date") + "</td> ");
                  out.println("<td>" + rs.getString("Arrival_time") + "</td> ");
                  out.println("<td>" + rs.getString("Price") + "</td> ");
                  out.println("</tr>");
 
                  
              }
              out.println("</table>");
        
               }
            catch (ClassNotFoundException ex) {
          
        }catch (Exception e)
        { throw new ServletException("error", e); }
    }
    
    public void destory()
    {
        i = 0;
    }
}


