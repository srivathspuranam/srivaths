<html lang="en">

<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta http-equiv="X-UA-Compatible" content="ie=edge">
	<title>Login Page</title>
</head>

<body>
	<h1 style="text-align: center;">Welcome to Shopping Portal</h1>
	<hr>
	<form action="/login" method="POST"><br><br>
		<h3 style="text-align: center; color: red;">${message}</h3><br><br>
		<h3 style="text-align: center;">
			Name:<input type="text" name="name" /><br><br>
			Password:<input type="password" name="password" /><br><br>
			<input type="submit" value="Submit" />
		</h3>
	</form>
	<br><br>
	<h3 style="text-align: center;"><input type="submit" value="View Products" onclick="window.location='/products';" />
	</h3><br>

	<h4 style="text-align: center;"> New Customer?<br>
		<input type="submit" value="Start here" onclick="window.location='/register';" />
	</h4>

</body>

</html>