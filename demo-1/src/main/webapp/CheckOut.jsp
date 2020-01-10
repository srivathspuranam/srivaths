<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="ISO-8859-1">
	<title>Payment Page</title>
</head>
<script type="text/javascript" language="javascript" src="http://code.jquery.com/jquery-1.8.2.js"></script>
<script type="text/javascript">
</script>

<body><br><br>
	<h1 style="text-align: center;">Payment Gateway</h1><br><br>
	<form action="/checkout" method="get">
		<h3 style="text-align: center;">
			Name:<input type="text" name="name" />
			Mobile Number: <input type="text" name="mobilenumber"><br><br><br>
			Shipping Address:<textarea rows="8" cols="50"></textarea><br><br>
			<input type="checkbox"> Same as Shipping Address<br>
			Billing Address: <textarea rows="8" cols="50"></textarea>
		</h3<br>
		<h3 style="text-align: center;"><input type="submit" value="pay" />
		</h3>
	</form>
</body>

</html>