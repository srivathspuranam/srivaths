<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Products Data</title>
</head>

<body>
    <div id="message" style="text-align: center;"></div>
    <form action="/addproduct" method="POST">
        <hr>
        <h1 style="text-align: center;">Shopping Portal.in</h1>
        <hr><br><br>
        <h3 style="text-align: center; color: green;">${message}</h3><br>
        <h2 style="text-align: center;">Product Details</h2><br>
        <h3 style="text-align: center;">
            Product Name: <input type="text" name="productname"><br><br>
            Product Cost:<input type="text" name="productcost"><br><br>
            Product Category :<input type="text" name="productcategory"><br><br>
            Product Stock:<input type="text" name="productstock"><br><br>
            About:<textarea name="about" cols="50" rows="10"></textarea><br><br>

        </h3>
        <h3 style="text-align: center;">
            <input type="submit" value="Add to list"> <input type="reset" value="Clear">
            <input type="button" onclick="window.location.href='dashboard';" value="Go Home"></h3>
            <input type="button" onclick="window.location.href='products';" value="products"></h3>
        </h3> <br>

    </form>
</body>

</html>