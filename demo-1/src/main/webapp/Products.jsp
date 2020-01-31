<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="ISO-8859-1">
	<title>Products Page</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	<script>
		$(document).ready(function () {
			$(".add").click(function () {
				var id = this.id;
				var quantity = "quantity" + id.replace("add", "");
				var value = parseInt($('#' + quantity).val(), 10) + 1;
				$("#" + quantity).val(value);
				return false;
			});
			$(".minus").click(function () {
				var id = this.id;
				var quantity = "quantity" + id.replace("minus", "");
				var value = parseInt($("#" + quantity).val(), 10) - 1;
				if (value < 0) {
					$("#" + quantity).val(0);
				}
				else {
					$("#" + quantity).val(value);
				} return false;
			})
			$('.tocart').click(function () {
				var id = this.id;
				var i = id.replace("tocart", "");
				var name = $("#name" + i).text();
				var quantity = $("#quantity" + i).val();
				var price = $("#price" + i).text();
				if (quantity == 0) {
					alert("Please select some quantity!")
				} else {
					$.ajax({
						url: "addtocart",
						type: "post",
						data: {
							name, quantity, price
						}
					});
					alert("Succesfully added")
				}
			});
			$('.delete').click(function () {
				var d = this.id;
				var i = d.replace("delete", "");
				var id = $("#id" + i).text();
				$.ajax({
					url: "deleteproduct",
					type: "get",
					data: {
						id
					}
				});
				setTimeout(function () {
					location.reload();
				}, 200);
			});
		});
	</script>
</head>

<body>
	<h1 style="text-align: center;">Welcome to Shopping Portal</h1>
	<hr><br>
	<h3 style="text-align: left;">
		Products Available
		<h3 style="text-align: center; color: red;">${message}</h3><br><br>
		<span style="float:right;">
			<c:if test="${user.role == 'Customer'}"> <button onclick="window.location.href = '/yourcart';">View
					Cart</button></c:if>
			<c:if test="${user.role == 'Admin'}"> <button onclick="window.location.href = '/dashboard';">Go
					Home</button></c:if>
			<button onclick="window.location.href = '/logout';"> Logout</button>
		</span>
	</h3><br><br>

	<table style="width:100%" id="product">
		<tr>
			<th>Product Id</th>
			<th>Name</th>
			<c:if test="${user.role == 'Customer'}">
				<th>Quantity</th>
			</c:if>
			<th>About</th>
			<th>Price</th>
			<c:if test="${user.role == 'Admin'}">
				<th>Stock Available</th>
			</c:if>

		</tr>
		<c:forEach items="${products}" var="product" varStatus="roll">
			<tr>
				<td style="text-align: center;" id="id${roll.count}">${product.productid}</td>
				<td style="text-align: center;" id="name${roll.count}">${product.productname}</td>
				<c:if test="${user.role == 'Customer'}">
					<td style="text-align: center;">
						<button id="minus${roll.count}" class="minus">-</button>
						<input type="text" id="quantity${roll.count}" value="0" size="1">
						<button id="add${roll.count}" class="add">+</button>
					</td>
				</c:if>
				<td style="text-align: center;" id="about">${product.about}</td>
				<td style="text-align: center;" id="price${roll.count}">${product.productcost}</td>
				<c:if test="${user.role == 'Admin'}">
					<td style="text-align: center;" id="stock${roll.count}">${product.productstock}</td>
				</c:if>

				<c:if test="${user.role == 'Customer'}">
					<td style="text-align: center;"><input type="button" value="Add to cart" id="tocart${roll.count}"
							class="tocart">
					</td>
				</c:if>
				

				<c:if test="${user.role == 'Admin'}">
					<td style="text-align: center;"><input type="button"
							onclick="window.location='editproduct?id=${product.productid}';" value="Edit"></td>
					<td style="text-align: center;"><input type="button" id="delete${roll.count}" value="delete"
							class="delete"></td>
				</c:if>
			</tr>
		</c:forEach>
	</table>

</body>

</html>