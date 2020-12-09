<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
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
		<br>
		<table>
			<tr>
				<td>OrderID</td>
				<td>ItemID</td>
				<td>Name</td>
				<td>Price</td>
			</tr>
			<c:forEach var="item" begin="0" items="${list}">
				<tr>
					<td>${item.getOrderID().getOrderID()}</td>
					<td>${item.getItemID().getId()}</td>
					<td>${item.getItemID().getName()}</td>
					<td>
					<fmt:setLocale value = "vi_VN"/>
					<fmt:formatNumber
							value="${item.getItemID().getSalePrice()}" type="currency" /></td>
				</tr>
			</c:forEach>
		</table>
		<p style="font-weight: bold">Total: ${total}</p>
		<br>
		<form action="./handle-order" method="GET" style="text-align: center;">
			<input type="text" name="orderID" placeholder="Order ID...">
			<input type="submit" style="margin-left: 3%" value="Handle">
		</form>

	</div>
</body>
</html>
