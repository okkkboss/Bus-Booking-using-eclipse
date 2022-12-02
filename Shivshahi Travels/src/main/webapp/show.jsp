<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@page import="java.sql.*" %>
<%@page import="java.io.*" %>
<%@page import= "java.io.IOException" %>
<%@page import = "java.io.PrintWriter" %>
<%@page import ="java.sql.Connection" %>
<%@page import= "java.sql.DriverManager" %>
<%@page import ="java.sql.PreparedStatement" %>
<%@page import ="javax.servlet.ServletException" %>
<%@page import ="javax.servlet.annotation.WebServlet" %>
<%@page import= "javax.servlet.http.HttpServlet" %>
<%@page import ="javax.servlet.http.HttpServletRequest" %>
<%@page import ="javax.servlet.http.HttpServletResponse" %>
<html>
<head>
<title>Welcome form </title>
<style type="text/css">
body {
  background-color: #E6E6FA;
}
<meta charset="ISO-8859-1">
<title>ticket confirmed</title>
</style>
</head>
<body>
<marquee direction="left" ><h4 style="color:blue text-shadow: 1px 1px 1px rgba(0,0,0,0.3);">Shivshahi Tours and Travels...</h4></marquee>
<%
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/BatchB","root","omkar@123");

	System.out.println("Connection created");
	Statement st = con.createStatement();
	String sql = "select * from tic";
	ResultSet rs = st.executeQuery(sql);
	ResultSetMetaData rsmd = rs.getMetaData();
	int cols =rsmd.getColumnCount();
	out.println("<table border = 2><tr>");
	for(int i=1;i<=cols;i++){
		out.println("<th>"+rsmd.getColumnName(i)+"</td>");
	}
	out.print("</tr>");
	
	while(rs.next()) {
		out.print("<tr> ");
		for(int i=1;i<=cols;i++){
			out.print("<td>"+rs.getString(i)+"</td>");
		}
		out.println("</tr>");
	}
	out.println("</table>");
}
catch(Exception e) {
	System.out.println(e);

}

%>

</body>
</html>

