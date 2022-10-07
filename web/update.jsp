<%-- 
    Document   : update
    Created on : Oct 6, 2022, 11:07:51 PM
    Author     : Kavinda Udara
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
<%
try{
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement=connection.createStatement();
String sql ="select User_ID,Flight_ID,Departure,Destination,Departure_date from bookings where User_ID="+User_ID;
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<!DOCTYPE html>
<html>
<body>
<h1>Update Data</h1>
<form method="post" action="update-process.jsp">
<input type="hidden" name="User_ID" value="<%=resultSet.getString("User_ID") %>">
<input type="hidden" name="User_ID" value="<%=resultSet.getString("User_ID") %>">
<br>
Flight_ID:<br>
<input type="text" name="Flight_ID" value="<%=resultSet.getString("Flight_ID") %>">
<br>
Departure:<br>
<input type="text" name="Departure" value="<%=resultSet.getString("Departure") %>">
<br>
Destination:<br>
<input type="text" name="Destination" value="<%=resultSet.getString("Destination") %>">
<br>

<input type="submit" value="Upadte" name="Update" />
</form>
<%
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
</body>
</html>