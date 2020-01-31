<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Customer Cart</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            $(".remove").click(function () {
                var i = this.id;
                var id = i.replace("remove", "");
                $.ajax({
                    url: "removeproduct",
                    type: "post",
                    data: {
                        id
                    }
                });
                setTimeout(function () {
                    location.reload();
                }, 200);
            });
        });
    </script>
</head>

<body>
    <h1 style="text-align: center;">Your Cart</h1>
    <hr>
    <c:set var="total" value="${0}" />
    <table style="width:100%" id="product">
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Quantity</th>
            <th>Price</th>
            <th></th>
        </tr>
        <c:forEach items="${product}" var="product" varStatus="roll">
            <tr>
                <td style="text-align: center;">${product.id}</td>
                <td style="text-align: center;">${product.name}</td>
                <td style="text-align: center;">${product.quantity}</td>
                <td style="text-align: center;" id="price${roll.count}">${product.price}</td>
                <c:set var="total" value="${total + product.price*product.quantity}" />
                <td style="text-align: center;"><input type="button" value="remove" id="remove${product.id}"
                        class="remove"></td>
            </tr>
        </c:forEach>
    </table>
    </script>

    </h3><br><br>
    <hr>
    <h3 style="text-align: right;">
        <button onclick="window.location.href = 'dashboard';">Cancel the Order</button>
        <button onclick="window.location.href = '/logout';"> Logout</button>
        <h3>
            <form action="/pay" method="POST">
                <br>
                <h3 style="text-align: center;">
                    Total : <div id="total">
                        <c:out value="${total}"></c:out>
                    </div>
                    <br><br>
                    Deliver to your Address ?<br><input type="text" name="address" value="${user.address}"
                        readonly><br><br>
                    <input type="text" name="total" id="total" hidden value="<c:out value=" ${total}"></c:out>">
                    change my shipping address:<br>
                    <textarea name="newaddress" cols="50" rows="10"></textarea>
                    <br><br>
                    <input type="submit" value="pay" id="pay">
                </h3>
            </form>
</body>

</html>