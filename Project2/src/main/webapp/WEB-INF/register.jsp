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
	<form action="register" method="POST">
		<hr>
		<h1 style="text-align: center;">Sailotech Pvt. Ltd.</h1>
		<hr>
		<h2 style="text-align: center;">Registration Form</h2>
		<br>
		<h3 style="text-align: center;">
			ID:<input type="text" name="id" id="id"><br> <br>
			Name:<input type="text" name="name" id="name"><br> <br>
			Password:<input type="password" name="passwd" id="psswd"><br>
			<br> Re-type Password:<input type="password" name="repasswd"
				id="repasswd"><br> <br> Date Of Birth: <input
				type="date" name="date" id="date"><br> <br>
			Gender: <select name="gender" id="gender" id="gender">
				<option value="Male">Male</option>
				<option value="Female">Female</option>

			</select><br> <br> Role: <select name="role" id="role">
				<option value="Employee">Employee</option>
				<option value="Manager">Manager</option>
				<option value="Admin">Admin</option>
			</select><br> <br>
		</h3>
		<h3 style="text-align: center;">
			<input type="submit" value="Submit" id="submit"> <input
				type="reset" value="Clear">
		</h3>

	</form>

</body>

</html>

</html>