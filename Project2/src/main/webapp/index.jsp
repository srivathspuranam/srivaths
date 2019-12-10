<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<form action="./login" method="post">
		<br>
		<h1 style="text-align: center;">Welcome to Sailotech Portal</h1>
		<hr>
		<br> <br>
		<h3 style="text-align: center;">
			Name:<input type="text" name="Name"><br> <br>
			Password:<input type="password" name="password">
		</h3>
		<h2 style="text-align: center;">
			<input type="submit" value="Sign in"><br><br>
		</h2>
<h4 style="text-align: center;"> New User? <a href="Register.jsp"">Register Here</a></h4>
		
	</form>
</body>

</html>