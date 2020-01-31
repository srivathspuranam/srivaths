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
    <hr>
    <h1 style="text-align: center;">Shopping Portal.in</h1>
    <hr><br><br>
    <h2 style="text-align: center;">Your Account</h2><br>
    <h3 style="text-align: center;">
        Name: ${user.name}<br><br>
        Date Of Birth: ${user.date} <br><br>
        Mobile Number: ${user.mobilenumber} <br><br>
        Address: ${user.address} <br><br>

        <input type="button" onclick="window.location='editprofile';" value="edit">
        <input type="button" onclick="window.location='dashboard';" value="Go Home"></h3>

</body>

</html>