/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;
import java.sql.*;
/**
 *
 * @author Pasindu Maleesha
 */
public class ClientDatabase {
    Connection con ;

    public ClientDatabase(Connection con) {
        this.con = con;
    }
    
    //for register user 
    public boolean saveClient(Client client){
        boolean set = false;
        try{
            //Insert register data to database
            String query = "insert into client(nicno,email,name,password,confirmpassword) values(?,?,?,?,?)";
           
           PreparedStatement pt = this.con.prepareStatement(query);
           pt.setString(1, client.getNicno());
           pt.setString(2, client.getEmail());
           pt.setString(3, client.getName());
           pt.setString(3, client.getPassword());
           pt.setString(3, client.getConfirmPassword());
           pt.executeUpdate();
           set = true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return set;
    }
}
