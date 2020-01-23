<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Profile</title>
</head>

<body>
    <div id="message" style="text-align: center;"></div>
    <form action="/register" method="POST">
        <hr>
        <h1 style="text-align: center;">Shopping Portal.in</h1>
        <hr><br><br>
        <h2 style="text-align: center;">Your Account</h2><br>
        <h3 style="text-align: center;">
            Name:<input type="text" name="name" value="${user.name}" disabled> <br><br>
            Password:<input type="password" name="password" value="${user.password}" disabled> <br><br>
            Date Of Birth:<input type="date" name="date" value="${user.date}"> <br><br>
            Mobile Number:<input type="text" name="mobilenumber" value="${user.mobilenumber}"> <br><br>
            Address: <input type="text" name="address" value="${user.address}"> <br><br>

            <input type="submit" value="update"> <input type="reset" value="Clear">
        </h3>
    </form>
</body>

</html>