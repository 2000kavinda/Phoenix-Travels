/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Pasindu Maleesha
 */
public class StaffDatabase {
    Connection con ;

    public StaffDatabase(Connection con) {
        this.con = con;
    }
    
    //for register user 
    public boolean saveStaff(Staff staff){
        boolean set = false;
        try{
            //Insert register data to database
            String query = "insert into staff(nicno,email,name,staffgrade,password,confirmpassword) values(?,?,?,?,?,?)";
           
           PreparedStatement pt = this.con.prepareStatement(query);
           pt.setString(1, staff.getNicno());
           pt.setString(2, staff.getEmail());
           pt.setString(3, staff.getName());
           pt.setString(4, staff.getStaffGrade());
           pt.setString(5, staff.getPassword());
           pt.setString(6, staff.getConfirmPassword());
           pt.executeUpdate();
           set = true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return set;
    }
}
