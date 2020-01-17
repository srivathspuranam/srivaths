<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Dashboard page</title>
</head>

<body>
    <h1 style="text-align: center;">Welcome, <c:out value="${customer.name}"></c:out>
    </h1>
    <hr><br><br>
    <h3 style="text-align: center; color: red;">${message}</h3><br><br>
    <span style="float: right;">
        <input type="button" onclick="window.location.href='logout';" value="Logout">
    </span>
    <br><br><br>
    <h3 style="text-align: center;">
        View Products : <input type="button" onclick="window.location.href='products';" value="Products"><br><br>
        Cart : <input type="button" onclick="window.location.href='ycart';" value="Cart"><br><br>
        Your Orders : <input type="button" onclick="window.location.href='orders';" value="Orders">
    </h3>
</body>

</html>