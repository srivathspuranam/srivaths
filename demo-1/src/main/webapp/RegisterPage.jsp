<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
	<form action="/register" method="POST">
		<hr>
		<h1 style="text-align: center;">Shopping Portal.in</h1>
		<hr><br><br>
		<h3 style="text-align: center; color: green;">${message}</h3><br><br>
		<h2 style="text-align: center;">Create account</h2><br>
		<h3 style="text-align: center;">
			Name:<input type="text" name="name"><br><br>
			Password:<input type="password" name="password"><br><br>
			Date Of Birth: <input type="date" name="date"><br><br>
			Mobile Number: <input type="text" name="mobilenumber"><br><br>
			Address: <input type="text" name="address"><br><br>
		</h3>
		<h3 style="text-align: center;">
			<input type="submit" value="Submit"> <input type="reset" value="Clear">
		</h3> <br>
		<h4 style="text-align: center;">Already have an account? <a href="LoginPage.jsp">Sign in</a></h4>
	</form>
</body>

</html>