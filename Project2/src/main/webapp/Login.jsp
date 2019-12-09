<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
    <form  action="LoginServlet" method="post">
        <h2>Login Page</h2>
        Please provide your login credentials.
        <br>
        <br>
        <input name="userId" class="form-login" title="Username" value="" size="30" maxlength="50" />
        </div>
        <input name="password" type="password" class="form-login" title="Password" value="" size="30" maxlength="48" />
        </div>
        <br />

        New User?  <a href="Register.jsp" style="margin-left:30px;">Register Here</a>
    
        </form>
</body>
</html>