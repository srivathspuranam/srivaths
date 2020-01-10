<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="ISO-8859-1">
    <title>Dashboard Page</title>
</head>

<body>
    <h1 style="text-align: center;">Welcome to Shopping Portal</h1>
    <hr>
    <form action="/dashboard" method="get">
        <br>
        <h3 style="text-align: left;">
            Products Available:<input type="text" name="name" />
            <span style="float:right;">
                <button onclick="window.location.href = '/transaction';">View Cart</button>
            </span>
        </h3>
        <!-------------------------------------------->
        </div>
        <div class="item">
            <div class="buttons">
                <span class="delete-btn"></span>
            </div>

            <div class="description">
                <h2 style="text-align: left;">Tailored Jeans</h2>
                <p>Tailored clothes are designed to fit close to the body, rather than being loose.</p>
            </div>

            <div class="quantity">
                <button class="plus-btn" type="button" name="button">
                    <img src="plus.svg" alt="" />
                </button>
                <input type="text" name="name" value="1">
                <button class="minus-btn" type="button" name="button">
                    <img src="minus.svg" alt="" />
                </button>
            </div>

            <div class="total-price">₹​10</div>
        </div>
        <!-------------------------------------------->
        </div>
        <div class="item">
            <div class="buttons">
                <span class="delete-btn"></span>
            </div>

            <div class="description">
                <h2 style="text-align: left;">Bags</h2>
                <p>Light weight and Easily to carry bag.</p>
            </div>

            <div class="quantity">
                <button class="plus-btn" type="button" name="button">
                    <img src="plus.svg" alt="" />
                </button>
                <input type="text" name="name" value="1">
                <button class="minus-btn" type="button" name="button">
                    <img src="minus.svg" alt="" />
                </button>
            </div>

            <div class="total-price">₹​30</div>
        </div>
        <!-------------------------------------------->
        </div>
        <div class="item">
            <div class="buttons">
                <span class="delete-btn"></span>
            </div>

            <div class="description">
                <h2 style="text-align: left;">Pen Drives</h2>
                <p> Pen drives have replaced the floppy drives of old and have become the most popular data-storage
                    devices among consumers.</p>
            </div>

            <div class="quantity">
                <button class="plus-btn" type="button" name="button">
                    <img src="plus.svg" alt="" />
                </button>
                <input type="text" name="name" value="1">
                <button class="minus-btn" type="button" name="button">
                    <img src="minus.svg" alt="" />
                </button>
            </div>

            <div class="total-price">₹​20</div>
        </div>
        <!-------------------------------------------->
        <h3 style="text-align: center;"> New to Shopping Portal?
            <input type="submit" value="Create a Shopping Portal account"
                onclick="window.location='RegisterPage.jsp';" />
        </h3>
    </form>
</body>

</html>