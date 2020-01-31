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
    <h1 style="text-align: center;">Welcome, <c:out value="${user.name}"></c:out>
    </h1>
    <hr><br><br>
    <h3 style="text-align: center; color: red;">${message}</h3><br><br>
    <span style="float: right;">
        <input type="button" onclick="window.location.href='logout';" value="Logout">
        <input type="button" onclick="window.location.href='profile';" value="Profile">
    </span>
    <br><br><br>

    <c:if test="${user.role == 'Admin'}">
        <h2 style="text-align: center;">Product Data</h2><br>
        <h3 style="text-align: center;">
            <input type="button" onclick="window.location.href='/products';" value="Products"><br><br>
            <input type="button" onclick="window.location.href='addproduct';" value="Add new product"><br><br>
            <input type="button" onclick="window.location.href='register';" value="Create new admin">
        </h3>
    </c:if>

    <c:if test="${user.role == 'Customer'}">
        <h3 style="text-align: center;">
            Shop by Category : <input type="button" onclick="window.location.href='/products';"
                value="Products"><br><br>
            Cart : <input type="button" onclick="window.location.href='/yourcart';" value="Cart"><br><br>
            Your Orders : <input type="button" onclick="window.location.href='/orders';" value="Orders">
        </h3>
    </c:if>
</body>

</html>