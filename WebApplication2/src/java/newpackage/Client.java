/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author Pasindu Maleesha
 */
public class Client {
    String nicno;
    String email;
    String name;
    String password;
    String confirmpassword;
      
    public Client() {
    }

    public Client(String nicno, String name, String email, String password, String confirmpassword) {
        this.nicno = nicno;
        this.email = email;
        this.email = name;
        this.password = password;
        this.confirmpassword = confirmpassword;
    }

    public Client(String email, String name, String password, String confirmpassword) {
        this.email = email;
        this.name = name;
        this.password = password;
        this.confirmpassword = confirmpassword;

    }

    public Client(String name, String password, String confirmpassword) {
        this.name = name;
        this.password = password;
        this.confirmpassword = confirmpassword;
    }
    
    public Client(String password, String confirmpassword) {        
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
