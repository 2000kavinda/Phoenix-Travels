/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author Pasindu Maleesha
 */
public class Staff {
    String nicno;
    String email;
    String name;
    String staffgrade;
    String password;
    String confirmpassword;
      
    public Staff() {
    }

    public Staff(String nicno, String email, String name, String staffgrade, String password, String confirmpassword) {
        this.nicno = nicno;
        this.email = email;
        this.email = name;
        this.password = password;
        this.confirmpassword = confirmpassword;
    }

    public Staff(String email, String name, String staffgrade, String password, String confirmpassword) {
        this.email = email;
        this.name = name;
        this.staffgrade = staffgrade;
        this.password = password;
        this.confirmpassword = confirmpassword;

    }

    public Staff(String name, String staffgrade, String password, String confirmpassword) {
        this.name = name;
        this.staffgrade = staffgrade;
        this.password = password;
        this.confirmpassword = confirmpassword;
    }
    
    public Staff(String staffgrade, String password, String confirmpassword) {   
        this.staffgrade = staffgrade;
        this.password = password;
        this.confirmpassword = confirmpassword;
    }
    public Staff(String password, String confirmpassword) {           
        this.password = password;
        this.confirmpassword = confirmpassword;
    }

    public String getNicno() {
        return nicno;
    }

    public void setNicno(String nicno) {
        this.nicno = nicno;
    }

    public String getEmail() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getStaffGrade() {
        return staffgrade;
    }

    public void setStaffGrade(String staffgrade) {
        this.staffgrade = staffgrade;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getConfirmPassword() {
        return confirmpassword;
    }

    public void setConfirmPassword(String confirmpassword) {
        this.confirmpassword = confirmpassword;
    }
}
