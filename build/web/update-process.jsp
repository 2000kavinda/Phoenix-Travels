<%-- 
    Document   : update-process
    Created on : Oct 6, 2022, 11:09:36 PM
    Author     : Kavinda Udara
--%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>
<%! String driverName = "com.mysql.jdbc.Driver";%>
<%!String url = "jdbc:mysql://localhost:3306/phoenix";%>
<%!String user = "root";%>
<%!String psw = "";%>
<%
String User_ID = request.getParameter("User_ID");
String Flight_ID=request.getParameter("Flight_ID");
String Departure=request.getParameter("Departure");
String Destination=request.getParameter("Destination");
String Deaprture_date=request.getParameter("Deaprture_date");
if(User_ID != null)
{
Connection con = null;
PreparedStatement ps = null;
int personID = Integer.parseInt(User_ID);
try
{
Class.forName(driverName);
con = DriverManager.getConnection(url,user,psw);
String sql="Update bookings set User_ID=?,Flight_ID=?,Departure=?,Destination=? where User_ID="+User_ID;
ps = con.prepareStatement(sql);
ps.setString(1,User_ID);
ps.setString(2, Flight_ID);
ps.setString(3, Departure);
ps.setString(4, Destination);

int i = ps.executeUpdate();
if(i > 0)
{
out.print("Record Updated Successfully");
}
else
{
out.print("There is a problem in updating Record.");
} 
}
catch(SQLException sql)
{
request.setAttribute("error", sql);
out.println(sql);
}
}
%>