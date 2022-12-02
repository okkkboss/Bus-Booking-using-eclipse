<%@page contentType="text/html" import="java.sql.*" %>
<html>
<head>
<style type="text/css">
body{
background-image:url("journey1.jpg");
}
</style>
</head>
    <body>
        <h1 style="color:blue;">Congratulations!!! Your ticket is booked</h1>
        <%
        String name = request.getParameter("guestname");    
        String email = request.getParameter("guestemail");
        String phone = request.getParameter("guestelephone");
        String adults = request.getParameter("adults");
        String children = request.getParameter("children");
        String date = request.getParameter("checkin");
        String single = request.getParameter("single");
               try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/BatchB","root","omkar@123");
    System.out.println("Connection created");
    PreparedStatement ps = con.prepareStatement("insert into tic values(?,?,?,?,?,?,?);");
		ps.setString(1, name);
		ps.setString(2, email);
		ps.setString(3, phone);
		ps.setString(4, adults);
		ps.setString(5, children);
		ps.setString(6, date);
		ps.setString(7, single);
        ps.executeUpdate();  
        }catch(Exception e){out.println(e);}
   %>
   <form action=show.jsp >
<pre><h2 style="color:green;">Happy Journey!!!!!!</h2>
	<input type = submit value = Show_Ticket>			
	
	
	
	
		
		
		<a href="booking.jsp">Book another ticket</a>		
</pre>
</form>
    </body>
</html>
