<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Your Orders</title>
</head>

<body>
    <h1 style="text-align: center;">Your Orders</h1>
    <hr>
    <table style="width:100%" id="product">
        <tr>
            <th>Order No.</th>
            <th>Transaction Id</th>
            <th>Date of Purchase</th>
            <th>Address</th>
            <th>Total</th>
            <th>Status</th>
        </tr>
        <c:forEach items="${transaction}" var="od" varStatus="roll">
            <tr>
                <td style="text-align: center;">${roll.count}</td>
                <td style="text-align: center;">${od.transactionid}</td>
                <td style="text-align: center;">${od.date}</td>
                <td style="text-align: center;">${od.address}</td>
                <td style="text-align: center;">${od.total}</td>
                <td style="text-align: center;">${od.status}</td>
            </tr>
        </c:forEach>
    </table>
    <br><br>
    <h3 style="text-align: center;">
        Go Home : <input type="button" onclick="window.location='dashboard';" value="home">
    </h3>
</body>

</html>