<%@page import="com.pro.user.Users"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.query.Query"%>
<%@page import="org.hibernate.Session"%>
<%@page import="com.pro.conn.connection"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>New Tasks</title>
</head>

<body>
	<%
		session = request.getSession(false);
		String name = (String) session.getAttribute("name");
	%>
	<form action="newtask" method="post">
		<br>
		<h1 style="text-align: center;">Assign a Task</h1>
		<hr>
		<h3 style="text-align: center;">${fail}</h3>
		<h3 style="text-align: center;">${success}</h3>
		<br> <br>
		<div style="text-align: center;">
			Assignment : <br>
			<textarea name="task" id="task" cols="100" rows="50"></textarea>
		</div>
		<br> <br>
		<div style="text-align: center;">
			Assign to employee :<select name="Employee">
				<%
					SessionFactory sf = connection.getSessionFactory();
					Session s = sf.openSession();
					Query query = s.createQuery("from Users");
					List list = query.list();
					Iterator itr = list.iterator();
					while (itr.hasNext()) {
						Users se = (Users) itr.next();
						if (se.getRole().equals("Employee")) {
				%>
				<option value=<%=se.getId()%>><%=se.getName()%></option>
				<%
					}
					}
				%>

		</div>
		<br> <input type="text" name="assigned" value="<%=name%>" hidden>
		<h3 style="text-align: center;">
			Assign :<button type="submit">Assign</button>
		</h3>
	</form>
</body>

</html>