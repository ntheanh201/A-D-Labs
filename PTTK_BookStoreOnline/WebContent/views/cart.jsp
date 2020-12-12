<%@page import="model.CartItem"%>
<%@page import="controller.impl.CartDAOImpl"%>
<%@page import="java.text.NumberFormat"%>
<%@page import="java.util.Locale"%>
<%@page import="java.util.List"%>
<%@page import="controller.impl.ItemDAOImpl"%>
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
<body>
	<jsp:include page="/common/header.jsp"></jsp:include>
	<h1 style="margin-left: 10%">Your Cart</h1>
	<div id="items">
		<%
			String customerID = "1";
		String personID = "1";
		if (session.getAttribute("customerID") != null) {
			customerID = session.getAttribute("customerID").toString();
		}
		if (session.getAttribute("personID") != null) {
			personID = session.getAttribute("personID").toString();
		}
		CartDAOImpl cartDAOImpl = new CartDAOImpl();
		ItemDAOImpl itemDAOImpl = new ItemDAOImpl();

		List<CartItem> items = cartDAOImpl.getCartInfor(Integer.parseInt(personID));
		Locale localeVN = new Locale("vi", "VN");
		NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
		long total = 0;
		System.out.println(items.size());
		for (int i = 0; i < items.size(); i++) {
			int stt = i + 1;
			CartItem item = items.get(i);
			total += Long.parseLong(item.getSalePrice().toString());
		%>
		<div class="item">
			<div class="itemImg">
				<img
					src="${pageContext.request.contextPath}/<%="img?url=" + item.getUrl()%>"
					alt="" width="100%" height="100%">
			</div>
			<div class="itemName"><%=item.getName()%></div>
			<div class="itemName">
				Quantity:
				<%=item.getQuantity()%></div>
			<div class="itemPrice"><%=currencyVN.format(item.getSalePrice())%></div>
		</div>
		<%
			}
		%>
	</div>
	<div id="makeOrder">
		<p style="font-weight: bold">
			Total:
			<%=currencyVN.format(total)%></p>
		<br> <a href="create-order.jsp"><button>Create Order</button></a>
	</div>
</body>
</html>
<style>
#items {
	align-content: center;
	margin-left: 10%;
	margin-right: 10%;
}

#makeOrder {
	clear: both;
	margin-left: 10%;
	margin-right: 10%;
	float: right;
}

.itemImg {
	box-sizing: border-box;
	border: 1px solid #000;
	width: 10%;
	height: 100%;
	float: left;
}

.itemName {
	box-sizing: border-box;
	border: 1px solid #000;
	width: 80%;
	height: 100%;
	float: left;
}

.itemPrice {
	box-sizing: border-box;
	border: 1px solid #000;
	width: 10%;
	height: 100%;
	float: left;
}
</style>
