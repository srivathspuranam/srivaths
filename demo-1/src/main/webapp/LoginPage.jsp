<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="ISO-8859-1">
	<title>Login Page</title>
</head>

<body>
	<h1 style="text-align: center;">Welcome to Shopping Portal</h1>
	<form action="/login" method="POST"><br><br>
		<h3 style="text-align: center; color: red;">${message}</h3><br><br>
		<h3 style="text-align: center;">
			Name:<input type="text" name="name" /><br>
			Password:<input type="password" password="password" /><br><br>
			<input type="submit" value="Submit" />
		</h3>
		<br><br>
		<h3 style="text-align: center;"><input type="submit" value="View Products"
				onclick="window.location='Products.jsp';" /></h3>
		<br><br>
		<h4 style="text-align: center;"> New to Shopping Portal?<br>
			<input type="submit" value="Create a Shopping Portal account"
				onclick="window.location='RegisterPage.jsp';" />
		</h4>
	</form>
</body>

</html>