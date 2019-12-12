<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>logout Page</title>
</head>
<body>
	<%
		session.removeAttribute("id");
		session.removeAttribute("passwd");
		session.invalidate();
	%>
	<center>
		<h1>You have successfully logged out!</h1>
		<%
			String redirectURL = "index.jsp";
			response.sendRedirect(redirectURL);
		%>
	</center>
</body>
</html>