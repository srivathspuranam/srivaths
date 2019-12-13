<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.pro.user.Users"%>
<%@page import="java.util.Iterator"%>
<%@page import="org.hibernate.query.Query"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="com.pro.conn.connection"%>
<!DOCTYPE html>

<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Registration Form</title>

</head>

<body>
	<div id="message" style="text-align: center;"></div>
	<form action="register" method="POST">
		<hr>
		<h1 style="text-align: center;">Sailotech Pvt. Ltd.</h1>
		<hr>
		<h2 style="text-align: center;">Registration Form</h2>
		<br>
		<h3 style="text-align: center;">
			Name:<input type="text" name="name"><br> <br>
			Password:<input type="password" name="password"><br> <br>
			Re-type Password:<input type="password" name="repassword"><br>
			<br> Date Of Birth: <input type="date" name="date"><br>
			<br> Gender: <select name="gender" id="gender">
				<option value="Male">Male</option>
				<option value="Female">Female</option>

			</select><br> <br> Role: <select name="role" id="role">
				<option value="Employee">Employee</option>
				<option value="Admin">Admin</option>
			</select><br> <br> Manager:<select name="manager" id="manager">
				<%
					SessionFactory sf = connection.getSessionFactory();
					Session s = sf.openSession();
					Query query = s.createQuery("from Users");
					List list = query.list();
					Iterator itr = list.iterator();
					while (itr.hasNext()) {
						Users users = (Users) itr.next();
						if (users.getRole().equals("Manager")) {
				%>
				<option value=<%=users.getId()%>><%=users.getName()%></option>
				<%
					}
					}
				%>
			</select>
		</h3>
		<h3 style="text-align: center;">
			<input type="submit" value="Submit"> <input type="reset"
				value="Clear">
		</h3>
	</form>
</body>

</html>

</html>