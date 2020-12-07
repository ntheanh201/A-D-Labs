<%@page import="java.text.NumberFormat"%>
<%@page import="java.util.Locale"%>
<%@page import="model.Item"%>
<%@page import="dao.ItemDAOImpl"%>
<%@page import="model.Orderline"%>
<%@page import="java.util.List"%>
<%@page import="dao.impl.OrderlineDAOImpl"%>
<%@page import="model.Onlineorder"%>
<%@page import="dao.impl.OnlineOrderDAOImpl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Search result</title>
<style>
html, body {
	height: 100%;
	margin: 0px;
}

td, th {
	border: 1px solid #ddd;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: #f2f2f2;
}

tr:hover {
	background-color: #ddd;
}

th {
	padding-top: 12px;
	padding-bottom: 12px;
	text-align: left;
	background-color: #4CAF50;
	color: white;
}
</style>
<title>Book Store</title>
</head>
<body style="background-color: azure;">
	<jsp:include page="/common/header.jsp"></jsp:include>
	<div style="margin-left: 20%">
		<%
			OnlineOrderDAOImpl aOImpl = new OnlineOrderDAOImpl();
		/* Onlineorder onlineorder = aOImpl.searchOnlineOrders(Integer.parseInt(request.getParameter("orderID"))); */
		OrderlineDAOImpl orderlineDAOImpl = new OrderlineDAOImpl();
		List<Orderline> list = orderlineDAOImpl.getAll();
		Locale localeVN = new Locale("vi", "VN");
		NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
		long total = 0;
		%>
		<br>
		<table>
			<tr>
				<td>ID</td>
				<td>Name</td>
				<td>Price</td>
			</tr>
			<%
				for (Orderline i : list) {
				total += Long.parseLong(i.getItemID().getSalePrice().toString());
			%>
			<tr>
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
		<form action="processorder.jsp" method="GET"
			style="margin-left: 35%; margin-top: 10%">
			<input type="text" name="orderID" style="margin-left: 3%"
				placeholder="Insert Order ID..."> <input type="submit"
				style="margin-left: 3%" value="Search">
		</form>

	</div>
</body>
</html>
