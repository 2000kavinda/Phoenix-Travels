package newpack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
 
@WebServlet("/registation")
public class registation1 extends HttpServlet {
 
    Connection con;
    PreparedStatement pst;
    PreparedStatement pst1;
    ResultSet rs;
  
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
        try
        {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/phoenix", "root", "");
            String nicno = request.getParameter("nicno");
            String email = request.getParameter("email");
            String name = request.getParameter("name");
            String password = request.getParameter("password");
            
            
            pst = con.prepareStatement("insert into client(nicno,email,name,password)values(?,?,?,?)");
            pst.setString(1, nicno);
            pst.setString(2, email);
            pst.setString(3, name);
         
            pst.setString(4, password);
            pst.executeUpdate();
            
           
            
            
            out.println("Registered Successfully");
            
            
        } catch (ClassNotFoundException ex) {
           ex.printStackTrace();
        } catch (SQLException ex) {
           ex.printStackTrace();
        }
    }
}