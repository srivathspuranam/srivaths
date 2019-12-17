<%@page import="com.pro.model.Users"%>
<%@page import="com.pro.conn.connection"%>
<%@page import="org.hibernate.query.Query"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="com.pro.service.PagesService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Task Page</title>
</head>

<body>
	<%
		session = request.getSession(false);
		String name = (String) session.getAttribute("name");
		String task = null;
		String status = null;
		try {
   Users user =(Users) request.getAttribute("result");
			task = user.getTask();
			status = user.getTstatus();
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (task != null) {
	%>
	<form action="task" method="post">
		<br>
		<h1 style="text-align: center;">Assigned task</h1>
		<hr>
		<h3 style="text-align: center;">${fail}</h3>
		<h3 style="text-align: center;">${success}</h3>
		<br> <br>
		<div style="text-align: center;">
			<textarea name="task" id="task" cols="100" rows="50" disabled><%=task%></textarea>
		</div>
		<br>
		<h3 style="text-align: center;">Status</h3>
		<div style="text-align: center;">
			<textarea name="status_value" id="tstatus" cols="100" rows="10">
				<%
					if (status != null) {
				%><%=status%>
				<%
					}
				%>
			</textarea>
		</div>
		<h3 style="text-align: center;">
			Update: <input type="submit" value="Submit">
		</h3>
	</form>
	<%
		} else {
	%>
	<br>
	<br>
	<h1 style="text-align: center;">No Pending Tasks!</h1>
	<hr>
	<%
		}
	%>
	</form>
</body>

</html>