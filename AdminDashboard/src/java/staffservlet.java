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
 
@WebServlet("/staffservlet")
public class staffservlet extends HttpServlet
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
            String NICno= request.getParameter("combo");
 
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/phoenix","root","");
            pst = con.prepareStatement("select nic,email,username,staffgrade,Flights,Tickets from staff where nic=?");
            pst.setString(1, NICno);
            rs = pst.executeQuery();
            
             out.println("<table width=60% border= 1   >");
             out.println("<tr><td colspan=4 " );
             out.println("<h2><center><b>Staff Member</b></center></h2></td><td colspan=2</td><h2><center><b>Activities</b>");
             out.println("</tr>");
             out.println("<tr>");
             out.println("<th>NIC</th>");
             out.println("<th>Email</th>");
             out.println("<th>Username</th>");
             out.println("<th>Staff Grade</th>");
             out.println("<th>Flights</th>");
             out.println("<th>Tickets</th>");
             out.println("</tr>");
              
              while(rs.next())
              {
                  out.println("<tr>");
                  out.println("<td>" + rs.getString("nic") + "</td> ");
                  out.println("<td>" + rs.getString("email") + "</td> ");
                  out.println("<td>" + rs.getString("username") + "</td> ");
                  out.println("<td>" + rs.getString("staffgrade") + "</td> ");
                  out.println("<td>" + rs.getString("Flights") + "</td> ");
                  out.println("<td>" + rs.getString("Tickets") + "</td> ");
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