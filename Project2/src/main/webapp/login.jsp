<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="ISO-8859-1">
	<title>Login Page</title>
</head>

<body>
	<form action="login" method="post">
		<br>
		<h1 style="text-align: center;">Sailotech Portal</h1>
		<hr>
		<h3 style="text-align: center; ">${message}</h3>
        <h3 style="text-align: center; ">${logout}</h3>
		<br> <br>
		<h3 style="text-align: center;">
			Name:<input type="text" name="name"><br> <br>
			Password:<input type="password" name="password">
		</h3>
		<h2 style="text-align: center;">
			<input type="submit" value="Sign in"><br> <br>
		</h2>
	</form>
</body>

</html>