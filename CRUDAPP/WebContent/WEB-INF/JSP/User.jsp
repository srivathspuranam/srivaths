<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="POST" action='userHandler' name="frmAddUser">
<input type="hidden" name="action" value="insert" />
<p><b>Add New Record</b></p>
<table>

<tr>
<td>First Name</td>
<td><input type="text" name="firstName" /></td>
</tr>
<tr>
<td>Middle Name</td>
<td><input type="text" name="middleName" /></td>
</tr>
<tr>
<td>Last Name</td>
<td><input type="text" name="lastName" /></td>
</tr>
<tr>
<td>Preferred User ID</td>
<td><input type="text" name="userid" /></td>
</tr>

<tr>
<td>Preferred Password</td>
<td><input type="password" name="pwd" /></td>
</tr>

<tr>
<td>Retype Password</td>
<td><input type="text" name="rpwd" /></td>
</tr>

<tr>
<td>Gender</td>
<td>    
<input type="radio" name="gender" value="male" checked> Male<br>
<input type="radio" name="gender" value="female"> Female<br>
<input type="radio" name="gender" value="other"> Other
</td>
</tr>
<tr>
<td>Zip Code</td>
<td><input type="text" name="zip" /></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="Submit" /></td>
</tr>
</table>
</form>

<p><a href="userHandler?action=listUser">View-All-Records</a></p>
</body>
</html>