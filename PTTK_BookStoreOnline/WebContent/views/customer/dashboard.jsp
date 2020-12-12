<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Book Store Online</title>
</head>
<body>
	<jsp:include page="/common/header.jsp"></jsp:include>
	<div style="margin-left: 20%">
		<h1>Customer Dashboard</h1>
		<div class="message">${message}</div>
		<a href="./orders"><button>
				<span>Orders</span>
			</button></a>
		<a href="./views/cart.jsp"><button>
				<span>Cart</span>
			</button></a>
		<jsp:include page="/views/items.jsp"></jsp:include>
	</div>
</body>
</html>
