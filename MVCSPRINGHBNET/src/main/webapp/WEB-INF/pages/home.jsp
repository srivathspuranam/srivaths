<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.stech.model.Employee" %>
<%@page import="java.util.List" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employee Management Screen</title>
</head>
<body>
	<div align="center">
		<h1>Employee List</h1>
		<h3>
			<a href="newEmployee">New Employee</a>
		</h3>
	<%
	List<Employee> list = (List<Employee>)request.getAttribute("listEmployee");
	%>
		<table border="1">
			<th>ID</th>
			<th>Name</th>
			<th>Email</th>
			<th>Address</th>
			<th>Telephone</th>
			<th>Action</th>
	<%
			for(Employee emp:list)
			{
    		%>
    			<tr>
				<td> <%=emp.getId() %> </td>
				<td> <%=emp.getName() %> </td>
				<td> <%=emp.getEmail() %> </td>
				
				<td> <%=emp.getAddress() %> </td>
				<td> <%=emp.getTelephone() %> </td>
				<td><a href="editEmployee?id=<%=emp.getId()%>">Edit</a>
					<a
						href="deleteEmployee?id=<%=emp.getId()%>">Delete</a></td>
				</tr>
			<% 
			}
			%>
		</table>
	</div>
</body>
</html>