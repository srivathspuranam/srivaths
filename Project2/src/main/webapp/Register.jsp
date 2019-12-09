<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="ISO-8859-1">
    <title>Registration Form</title>
</head>

<body>
    <form action="RegisterServlet" method="POST">
        <table align="center" cellpadding="10">
            <tr>
                <td>UserId</td>
                <td><input type="text" name="userid" />

                </td>
            </tr>
            <tr>
                <td>Name</td>
                <td><input type="text" name="name" maxlength="30" />
                    (max 30 characters a-z and A-Z)
                </td>
            </tr>
            <tr>
                <td>Email</td>
                <td><input type="text" name="email" maxlength="100" /></td>
            </tr>
            <tr>
                <td>Password</td>
                <td><input type="text" name="password" maxlength="100" /></td>
            </tr>
            <tr>
                <td>RPassword</td>
                <td><input type="text" name="rpassword" maxlength="100" /></td>
            </tr>
            <tr>
                <td>DOB</td>
                <td><input type="text" name="dob" /></td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="Submit">
                    <input type="reset" value="Reset">
                </td>
            </tr>
        </table>
    </form>
</body>

</html>