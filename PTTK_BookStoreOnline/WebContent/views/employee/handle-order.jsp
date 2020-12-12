<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Handle Orders</title>
</head>
<body>
	<jsp:include page="/common/header.jsp"></jsp:include>
	<div>
		<div>
			Order Detail:
			<table>
				<tr>
					<td>ItemID</td>
					<td>Name</td>
					<td>Price</td>
				</tr>
				<c:forEach var="od" begin="0" items="${list}">
					<tr>
						<td>${od.getItemID().getId()}</td>
						<td>${od.getItemID().getName()}</td>
						<td><fmt:setLocale value="vi_VN" /> <fmt:formatNumber
								value="${od.getItemID().getSalePrice()}" type="currency" /></td>
					</tr>
				</c:forEach>
			</table>
			<p style="font-weight: bold">Total: ${total}</p>
		</div>
		<br>
		<div>
			<span style="font-weight: bold">Order ID:</span> <span
				style="color: firebrick">${onlineorder.getOrderID()}</span>
		</div>
		<div>
			<span style="font-weight: bold">Customer ID:</span> <span
				style="color: firebrick">${onlineorder.getCustomerID()}</span>
		</div>
		<div>
			<span style="font-weight: bold">Customer Information:</span> <span
				style="color: firebrick">${fullName.getLastName()}
				${fullName.getMiddleName()} ${fullName.getFirstName()} -
				${person.getGender()} - ${person.getDateOfBirth()}</span>
		</div>
		<div>
			<span style="font-weight: bold">Payment method:</span> <span
				style="color: firebrick">${onlineorder.getPaymentmethod()}</span>
		</div>
		<div>
			<span style="font-weight: bold">Status:</span> <span
				style="color: firebrick">${onlineorder.getState()}</span>
		</div>
		<div>
			<span style="font-weight: bold">Shipping Information:</span> <span
				style="color: firebrick">${shipadd.getAddressID().getStreet()},
				${shipadd.getAddressID().getDistrict()},
				${shipadd.getAddressID().getCity()}</span>
		</div>
		<div>
			<span style="font-weight: bold">Note:</span> <span
				style="color: firebrick">${shipadd.getNote()}</span>
		</div>

		<form action="" method="POST">
			<input type="text" name="orderID"
				value="${request.getParameter("orderID")}" hidden="true" />
			<div>
				Change Status: <select name="method" onchange="">
					<option value="Pending Payment">Pending Payment</option>
					<option value="Checking">Checking</option>
					<option value="Delivering">Delivering</option>
					<option value="Done">Done</option>
					<option value="Canceled">Canceled</option>
				</select> <input name="ItemID" hidden="true"
					value="${onlineorder.getOrderID()}">
			</div>
			<input type="submit" name="button1" value="Update">

		</form>
	</div>
</body>
</html>
