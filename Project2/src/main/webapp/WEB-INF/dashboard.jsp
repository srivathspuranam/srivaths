<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dashboard</title>
</head>
<body>
<body>
	<%
		session = (HttpSession) request.getAttribute("session");
		String name = (String) session.getAttribute("name");
		session.setAttribute("name", name);
		String role = (String) request.getAttribute("role");
		if (session != null) {
			if (role.equals("Admin")) {
	%>
	<br>
	<br>
	<h1 style="text-align: center;">Welcome , Mr. ${name}</h1>
	<hr>
	<h1 style="text-align: end;">
		<input type="button" onclick="window.location.href='Logout.jsp';"
			value="logout">
	</h1>
	<br>
	<br>
	<h3 style="text-align: center;">Adminstartor</h3>
	<br>
	<h3 style="text-align: center;">
		Register : <input type="button"
			onclick="window.location.href='Register.jsp';" value="Register">
	</h3>
	<%
		} else if (role.equals("Manager")) {
	%>
	<br>
	<br>
	<h1 style="text-align: center;">Welcome , Mr. ${name}</h1>
	<hr>
	<h1 style="text-align: end;">
		<input type="button" onclick="window.location.href='logout';"
			value="logout">
	</h1>
	<br>
	<br>
	<h3 style="text-align: center;">Manager</h3>
	<br>
	<h3 style="text-align: center;">
		Create Task : <input type="button"
			onclick="window.location.href='NewTask.jsp';" value="Create Task"><br>
		<br> Check Status : <input type="button"
			onclick="window.location.href='getstatus';" value="Status">
	</h3>
	<%
		} else {
	%>
	<br>
	<br>
	<h1 style="text-align: center;">Welcome , Mr. ${name}</h1>
	<hr>
	<h1 style="text-align: end;">
		<input type="button" onclick="window.location.href='Logout.jsp';"
			value="logout">
	</h1>
	<br>
	<br>
	<h3 style="text-align: center;">Employee</h3>
	<br>
	<h3 style="text-align: center;">
		Check Task : <input type="button"
			onclick="window.location.href='Task.jsp';" value="Task"><br>
		<br>
	</h3>
	<%
		}
		} else {
	%>
	<br>
	<br>
	<br>
	<h1 style="text-align: center; color: red;">Please login first</h1>
	<hr>
	<br>
	<br>
	<h3 style="text-align: center;">
		Existing User <a href="Login.jsp"">Please Login</a>
	</h3>
	<br>
	<%
		}
	%>
</body>
</body>
</html>