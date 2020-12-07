<%@page import="java.text.NumberFormat"%>
<%@page import="java.util.Locale"%>
<%@page import="model.Item"%>
<%@page import="dao.impl.ItemDAOImpl"%>
<%@page import="model.OrderDetail"%>
<%@page import="java.util.List"%>
<%@page import="dao.impl.OrderDetailDAOImpl"%>
<%@page import="model.Onlineorder"%>
<%@page import="dao.impl.OnlineOrderDAOImpl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
<style>
html, body {
	height: 100%;
	margin: 0px;
}
</style>
</head>
<body>
	<jsp:include page="/common/header.jsp"></jsp:include>
	<div>
	<%
		OnlineOrderDAOImpl aOImpl = new OnlineOrderDAOImpl();
		Onlineorder onlineorder = aOImpl.searchOnlineOrders(Integer.parseInt(request.getParameter("orderID")));
		OrderDetailDAOImpl orderlineDAOImpl = new OrderDetailDAOImpl();
		List<OrderDetail> list = orderlineDAOImpl.getOrderLinesByOrderId(Integer.parseInt(request.getParameter("orderID")));
		Locale localeVN = new Locale("vi", "VN");
		 		NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
		long total = 0;
	%>
		<br>
		<div>
			<span style="font-weight: bold">Order ID:</span> <span
				style="color: firebrick"><%=onlineorder.getOrderID()%></span>
		</div>
		<div>
			<span style="font-weight: bold">Customer ID:</span> <span
				style="color: firebrick"><%=onlineorder.getCustomerID()%></span>
		</div>
		<div>
			<span style="font-weight: bold">Payment method:</span> <span
				style="color: firebrick"><%=onlineorder.getPaymentmethod()%></span>
		</div>
		<div>
			<span style="font-weight: bold">State:</span> <span
				style="color: firebrick"><%=onlineorder.getState()%></span>
		</div>
		
		<form action="OnlineOrderServlet" method="POST">
			<input type="text" name="orderID"
				value="<%=request.getParameter("orderID")%>" hidden="true" />
			<div>
				<select name="method" onchange="">
					<option value="Wait for payment">Wait for payment</option>
					<option value="Getting in stock">Getting in stock</option>
					<option value="On Delivery">On Delivery</option>
					<option value="Accepted">Accepted</option>
					<option value="Canceled">Canceled</option>
				</select> <input name="ItemID" hidden="true"
					value="<%=onlineorder.getOrderID()%>">
			</div>
			<input type="submit" name="button1" value="Update">

		</form>
	</div>
</body>
</html>
