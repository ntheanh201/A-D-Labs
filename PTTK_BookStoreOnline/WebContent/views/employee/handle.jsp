<%@page import="model.FullName"%>
<%@page import="controller.impl.FullnameDAOImpl"%>
<%@page import="model.Person"%>
<%@page import="controller.impl.PersonDAOImpl"%>
<%@page import="model.Customer"%>
<%@page import="controller.impl.CustomerDAOImpl"%>
<%@page import="model.ShippingAdd"%>
<%@page import="controller.impl.ShippingAddressDAOImpl"%>
<%@page import="java.text.NumberFormat"%>
<%@page import="java.util.Locale"%>
<%@page import="model.Item"%>
<%@page import="controller.impl.ItemDAOImpl"%>
<%@page import="model.OrderDetail"%>
<%@page import="java.util.List"%>
<%@page import="controller.impl.OrderDetailDAOImpl"%>
<%@page import="model.OnlineOrder"%>
<%@page import="controller.impl.OnlineOrderDAOImpl"%>
<%@page import="controller.impl.PersonDAOImpl"%>
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
		OnlineOrder onlineorder = aOImpl.searchOnlineOrders(Integer.parseInt(request.getParameter("orderID")));
		OrderDetailDAOImpl orderDetailDAOImpl = new OrderDetailDAOImpl();
		CustomerDAOImpl customerDAOImpl = new CustomerDAOImpl();
		Customer cus = customerDAOImpl.get(onlineorder.getCustomerID());
		PersonDAOImpl personDAOImpl = new PersonDAOImpl();
		Person person = personDAOImpl.get(cus.getPersonID());
		System.out.println(person);
		FullnameDAOImpl fullnameDAOImpl = new FullnameDAOImpl();
		FullName fullName = fullnameDAOImpl.get(person.getFullNameID().getId());
		ShippingAddressDAOImpl shippingAddressDAOImpl = new ShippingAddressDAOImpl();
		ShippingAdd shipadd = shippingAddressDAOImpl.get(onlineorder.getShippingAddressID().getId());
		List<OrderDetail> list = orderDetailDAOImpl.getOrderLinesByOrderId(Integer.parseInt(request.getParameter("orderID")));
		Locale localeVN = new Locale("vi", "VN");
		NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
		long total = 0;
		%>
		<div>
			Order Detail:
			<table>
				<tr>
					<td>ItemID</td>
					<td>Name</td>
					<td>Price</td>
				</tr>
				<%
					for (OrderDetail od : list) {
					total += Long.parseLong(od.getItemID().getSalePrice().toString());
				%>
				<tr>
					<td><%=od.getItemID().getId()%></td>
					<td><%=od.getItemID().getName()%></td>
					<td><%=currencyVN.format(od.getItemID().getSalePrice())%></td>
					<%
						}
					%>
				</tr>
			</table>
			<p style="font-weight: bold">
				Total:
				<%=currencyVN.format(total)%></p>
		</div>
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
			<span style="font-weight: bold">Customer Information:</span> <span
				style="color: firebrick"><%=fullName.getLastName()%> <%=fullName.getMiddleName()%>
				<%=fullName.getFirstName()%> - <%=person.getGender()%> - <%=person.getDateOfBirth()%></span>
		</div>
		<div>
			<span style="font-weight: bold">Payment method:</span> <span
				style="color: firebrick"><%=onlineorder.getPaymentmethod()%></span>
		</div>
		<div>
			<span style="font-weight: bold">Status:</span> <span
				style="color: firebrick"><%=onlineorder.getState()%></span>
		</div>
		<div>
			<span style="font-weight: bold">Shipping Information:</span> <span
				style="color: firebrick"><%=shipadd.getAddressID().getDistrict()%>,
				<%=shipadd.getAddressID().getHouseNumber()%>, <%=shipadd.getAddressID().getCity()%></span>
		</div>
		<div>
			<span style="font-weight: bold">Note:</span> <span
				style="color: firebrick"><%=shipadd.getNote()%></span>
		</div>

		<form action="HandleOrderServlet" method="POST">
			<input type="text" name="orderID"
				value="<%=request.getParameter("orderID")%>" hidden="true" />
			<div>
				Change Status: <select name="method" onchange="">
					<option value="Pending Payment">Pending Payment</option>
					<option value="Checking">Checking</option>
					<option value="Delivering">Delivering</option>
					<option value="Done">Done</option>
					<option value="Canceled">Canceled</option>
				</select> <input name="ItemID" hidden="true"
					value="<%=onlineorder.getOrderID()%>">
			</div>
			<input type="submit" name="button1" value="Update">

		</form>
	</div>
</body>
</html>