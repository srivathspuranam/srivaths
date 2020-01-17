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
        <h3 style="text-align: center;">Your payment has been successfull<br><br>
                Estimated delivery date - <c:out value="${day}"></c:out> <br><br>
                Payment Details : <br><br>
                Transaction Id : <c:out value="${tx.txid}"></c:out><br><br>
                Date of purchase : <c:out value="${tx.date}"></c:out><br><br>
                Shipping Address : <c:out value="${tx.address}"></c:out><br><br>
                Products : <c:forEach items="${tx.items}" var="i"><br>
                        Name : <c:out value="${i.name}"></c:out><br>
                        Quantity : <c:out value="${i.quantity}"></c:out><br>
                        Price : <c:out value="${i.price}"></c:out><br>
                </c:forEach><br>
                <hr>
                Total : <c:out value="${tx.total}"></c:out><br><br>
                <input type="button" onclick="window.location.href='dashboard';" value="Home Page">
        </h3>
</body>

</html>