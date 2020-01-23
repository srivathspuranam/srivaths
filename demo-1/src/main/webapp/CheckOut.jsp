<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
        pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
        <meta charset="ISO-8859-1">
        <title>Payment Page</title>
</head>

<body><br><br>
        <h1 style="text-align: center;">Payment Gateway</h1><br>
        <h3 style="text-align: center;color: green;">Your order has been placed<br><br></h3>
        <h3 style="text-align: center;"> Order will be delivered on or before - <c:out value="${day}"></c:out> <br><br>
                Payment Details : <br><br>
                Transaction Id : <c:out value="${tb.transactionid}"></c:out><br><br>
                Date of purchase : <c:out value="${tb.date}"></c:out><br><br>
                Shipping Address : <c:out value="${tb.address}"></c:out><br><br>
                Products : <c:forEach items="${tb.items}" var="Y"><br>
                        Name : <c:out value="${Y.name}"></c:out><br>
                        Quantity : <c:out value="${Y.quantity}"></c:out><br>
                        Price : <c:out value="${Y.price}"></c:out><br>
                </c:forEach><br>
                <hr>
                Total : <c:out value="${tb.total}"></c:out><br><br>
                <hr>
                <input type="button" onclick="window.location.href='dashboard';" value="Home Page">
                </h3>
</body>

</html>