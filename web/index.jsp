<%-- 
    Document   : index
    Created on : Oct 6, 2022, 10:55:20 PM
    Author     : Kavinda Udara
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ page import="java.sql.*" %> 
<%@ page import="java.io.*" %> 
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
String User_ID = request.getParameter("User_ID");
String driver = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String database = "phoenix";
String userid = "root";
String password = "";
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<html>
<body>

<h1>Retrieve data from bookings</h1>

<table border="1">
<tr>
<td>User_ID</td>
<td>Flight_ID</td>
<td>Departure</td>
<td>Destination</td>
<td>Departure_date</td>
<td>Action</td>
</tr>

<%
try{
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement=connection.createStatement();
String sql ="select User_ID,Flight_ID,Departure,Destination,Departure_date from bookings";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr>
<td><%=resultSet.getString("User_ID") %></td>
<td><%=resultSet.getString("Flight_ID") %></td>
<td><%=resultSet.getString("Departure") %></td>
<td><%=resultSet.getString("Destination") %></td>
<td><%=resultSet.getString("Departure_date") %></td>
<td><a href="update.jsp?User_ID=<%=resultSet.getString("User_ID")%>">update</a></td>
</tr>
<%
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
</table>
</body>
</html>
