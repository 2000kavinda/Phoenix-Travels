package newpack;



import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/addflights")
public class addflights extends HttpServlet {

   
    Connection con;
    PreparedStatement pst;
    PreparedStatement pst1;
    ResultSet rs;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        
        try {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/flights", "root", "");
            String Flight_ID = request.getParameter("Flight_ID");
            String Departure = request.getParameter("Departure");
            String Destination = request.getParameter("Destination");
            String Departure_date = request.getParameter("Departure_date");
            String Departure_time = request.getParameter("Departure_time");
            String Arrival_date = request.getParameter("Arrival_date");
            String Arrival_time = request.getParameter("Arrival_time");
            String Price = request.getParameter("Price");
            
            
            pst = (PreparedStatement) con.prepareStatement("insert into flights(Flight_ID,Departure,Destination,Departure_date,Departure_time,Arrival_date,Arrival_time,Price)values(?,?,?,?,?,?,?,?)");
            pst.setString(1, Flight_ID);
            pst.setString(2, Departure);
            pst.setString(3, Destination);
            pst.setString(4, Departure_date);
            pst.setString(5, Departure_time);
            pst.setString(6, Arrival_date);
            pst.setString(7, Arrival_time);
            pst.setString(8, Price);
            pst.executeUpdate();
            
            
            out.println("Successfully added the Flight:"+Flight_ID);
            
            
            
           
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(addflights.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(addflights.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        
    }

}
