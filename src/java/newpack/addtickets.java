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


@WebServlet("/addtickets")
public class addtickets extends HttpServlet {

   
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
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/tickets", "root", "");
            String Ticket_ID = request.getParameter("Ticket_ID");
            String Flight_ID = request.getParameter("Flight_ID");
            String Client_name = request.getParameter("Client_name");
            String Price = request.getParameter("Price");
            
            
            
            pst = (PreparedStatement) con.prepareStatement("insert into tickets(Ticket_ID,Flight_ID,Client_name,Price)values(?,?,?,?)");
            pst.setString(1, Ticket_ID);
            pst.setString(2, Flight_ID);
            pst.setString(3, Client_name);
            pst.setString(4, Price);
            pst.executeUpdate();
            
            out.println("Successfully added the Flight:"+Ticket_ID);
            
            
            
           
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(addtickets.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(addtickets.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        
    }

}
