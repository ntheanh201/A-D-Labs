<%@page import="java.text.NumberFormat"%>
<%@page import="java.util.Locale"%>
<%@page import="model.Item"%>
<%@page import="controller.impl.ItemDAOImpl"%>
<%@page import="model.OrderDetail"%>
<%@page import="java.util.List"%>
<%@page import="controller.impl.OrderDetailDAOImpl"%>
<%@page import="model.Onlineorder"%>
<%@page import="controller.impl.OnlineOrderDAOImpl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Handle Orders</title>
</head>
<body>
	<jsp:include page="/common/header.jsp"></jsp:include>
	<div style="margin-left: 20%">
		<%
			OnlineOrderDAOImpl aOImpl = new OnlineOrderDAOImpl();
		OrderDetailDAOImpl orderlineDAOImpl = new OrderDetailDAOImpl();
		List<OrderDetail> list = orderlineDAOImpl.getAll();
		Locale localeVN = new Locale("vi", "VN");
		NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
		long total = 0;
		%>
		<br>
		<table>
			<tr>
				<td>OrderID</td>
				<td>ItemID</td>
				<td>Name</td>
				<td>Price</td>
			</tr>
			<%
				for (OrderDetail i : list) {
				total += Long.parseLong(i.getItemID().getSalePrice().toString());
			%>
			<tr>
				<td><%=i.getOrderID().getOrderID()%></td>
				<td><%=i.getItemID().getId()%></td>
				<td><%=i.getItemID().getName()%></td>
				<td><%=currencyVN.format(i.getItemID().getSalePrice())%></td>
				<%
					}
				%>
			</tr>
		</table>
		<p style="font-weight: bold">
			Total:
			<%=currencyVN.format(total)%></p>
		<br>
		<form action="handle-order.jsp" method="GET"
			style="text-align: center;">
			<input type="text" name="orderID" placeholder="Order ID...">
			<input type="submit" style="margin-left: 3%" value="Handle">
		</form>

	</div>
</body>
</html>
