<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
                var id = this.id;
                var productid = id.replace("remove", "");
                $.ajax({
                    url: "removecart",
                    type: "post",
                    data: {
                        productid
                    }
                });
                setTimeout(function () {
                    location.reload();
                }, 50);
            });
        });
    </script>
</head>

<body>
    <h1 style="text-align: center;">Your Cart</h1>
    <c:set var="total" value="${0}" />
    <table style="width:100%" id="product">
        <tr>
            <th>Product Id</th>
            <th>Name</th>
            <th></th>
            <th>Quantity</th>
            <th></th>
            <th>Price</th>
            <th></th>
        </tr>
        <c:forEach items="${cart}" var="product" varStatus="roll">
            <tr>
                <td style="text-align: center;">${product.productid}</td>
                <td style="text-align: center;">${product.name}</td>
                <td style="text-align: center;">${product.quantity}</td>
                <td style="text-align: center;" id="price${roll.count}">${product.price}</td>
                <c:set var="total" value="${total + product.price*product.quantity}" />
                <td style="text-align: center;"><input type="button" value="remove" id="remove${product.productid}"
                        class="remove"></td>
            </tr>
        </c:forEach>
    </table>


    <hr>
    <form action="/pay" method="POST">
        <br>
        <h3 style="text-align: right;">
            <button onclick="window.location.href = '/products';">Cancel the Order</button>
            <button onclick="window.location.href = '/logout';"> Logout</button>
            </span>
        </h3><br><br>

        <h3 style="text-align: center;">
            Total : <div id="total">
                <c:out value="${total}"></c:out>
            </div>
            <br><br>
            Shipping Address : <br><br>
            <c:forEach items="${address}" var="addr" varStatus="roll">
                <input type="radio" name="address" value="${addr.address}" id="address" checked> ${addr.address}<br>
            </c:forEach><br><br>
            <input type="text" name="total" id="total" hidden value="<c:out value= ${total}></c:out>">
            Or Add address: <br><br><br>
            <textarea name="add" id="add" cols="70" rows="10"></textarea>
            <br><br>
            <input type="submit" value="pay" id="pay">
        </h3>
    </form>
</body>

</html>