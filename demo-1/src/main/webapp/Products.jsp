<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="ISO-8859-1">
	<title>Products Page</title>
</head>

<body>
	<h1 style="text-align: center;">Welcome to Shopping Portal</h1>
	<hr>
	<form action="/products" method="POST">
		<br>
		<h3 style="text-align: left;">
			Products Available
			<span style="float:right;">
				<button onclick="window.location.href = '/ycart';">View Cart</button>
				<button onclick="window.location.href = '/logout';"> Logout</button>
			</span>
		</h3><br><br>
		<!-------------------------------------------->
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
		<script>
			function increase() {
				var a = 1;
				var textBox = document.getElementById("text");
				textBox.value++;
			}
			function decrease() {
				var textBox = document.getElementById("text");
				textBox.value--;
			}

			var name = $("#name" + text)
			var name = $("#name" + text)
		</script>
		<table style="width:100%" id="product">
			<tr>
				<th>Product Id</th>
				<th>Name</th>
				<th>Quantity</th>
				<th>About</th>
				<th>Price</th>
			</tr>
			<c:forEach items="${products}" var="product" varStatus="roll">
				<tr>
					<td style="text-align: center;" id="id${roll.count}">${product.id}</td>
					<td style="text-align: center;" id="name${roll.count}">${product.name}</td>
					<td style="text-align: center;">
						<button type="button" onclick="increase()">+</button>
						<input type="text" id="quantity${roll.count}" value="0" size="1">
						<button type="button" onclick="decrease()">-</button>
					</td>
					<td style="text-align: center;" id="about">${product.about}</td>
					<td style="text-align: center;" id="price${roll.count}">${product.price}</td>
					<td style="text-align: center;"><input type="button" value="Add to cart" id="tocart${roll.count}">
					</td>
				</tr>
			</c:forEach>
		</table>

		<h4 style="text-align: center;">Hello, Sign in
			<input type="submit" value="Sign in" onclick="window.location='LoginPage.jsp';" />
		</h4>
	</form>
</body>

</html>