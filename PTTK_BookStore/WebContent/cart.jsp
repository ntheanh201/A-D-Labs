<%@page import="java.text.NumberFormat"%>
<%@page import="java.util.Locale"%>
<%@page import="model.Item"%>
<%@page import="java.util.List"%>
<%@page import="dao.ItemDAOImpl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Book Store | Cart</title>
        <link rel="stylesheet" href="css/cart.css">
        <style>
            table, td {
                border: 1px solid black;
                border-collapse: collapse;
                text-align: center;
            }
            html, body {
                height: 100%;
                margin: 0px;
            }

            .item {
                box-sizing: border-box;
                border: 0px solid #000;
                height: 150px;
            } 
        </style>
    </head>
    <body style="background-color: azure;">
        <jsp:include page="/common/header.jsp"></jsp:include>
        <h1 style="margin-left: 10%">Your Cart</h1>
        <div id="items">
            <%
                ItemDAOImpl itemDAOImpl = new ItemDAOImpl();
                List<Item> items = itemDAOImpl.findItemInCart(Integer.parseInt(session.getAttribute("customerID").toString()));
                Locale localeVN = new Locale("vi", "VN");
                NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
                long total = 0;
                for (int i = 0; i < items.size(); i++) {
                    int stt = i + 1;
                    Item item = items.get(i);
                    total += Long.parseLong(item.getSalePrice().toString());
            %>            
            <div class="item">
                <div class="itemImg">
                    <img src="<%= "img?ImgUrl=" + item.getUrl()%>" alt="" width="100%" height="100%">
                </div>
                <div class="itemName"><%= item.getName()%></div>
                <div class="itemPrice"><%= currencyVN.format(item.getSalePrice())%></div>
            </div>
            <%}
            %>
        </div>
        <div id="makeOrder">
            <p style="font-weight: bold">Total: <%= currencyVN.format(total)%></p>
            <br>
            <a href="getShippingAddress.jsp"><button>Make Order</button></a>
        </div>
    </body>
</html>
