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

@WebServlet("/flightdata")
public class flightdata extends HttpServlet{
    
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
            con=DriverManager.getConnection("jdbc:mysql://localhost/flights","root","");

            pst = con.prepareStatement("select Flight_ID,Departure,Destination,Departure_date,Departure_time,Arrival_date,Arrival_time,Price from flights where Departure=?");
            pst.setString(1, cityname);
            rs = pst.executeQuery();
           
             out.println("<table width=60% border= 1   >");
             out.println("<tr><td colspan=8 " );
             out.println("<center><h2>Flight Results</h2></center>");
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

