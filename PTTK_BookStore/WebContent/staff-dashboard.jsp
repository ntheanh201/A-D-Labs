<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Staff login</title>
<style>
html, body {
	height: 100%;
	margin: 0px;
}

button {
	display: inline-block;
	border-radius: 4px;
	background-color: #f4511e;
	border: none;
	color: #FFFFFF;
	text-align: center;
	font-size: 28px;
	padding: 20px;
	width: 200px;
	transition: all 0.5s;
	cursor: pointer;
	margin: 5px;
	vertical-align: middle;
}

button span {
	cursor: pointer;
	display: inline-block;
	position: relative;
	transition: 0.5s;
}

button span:after {
	content: '\00bb';
	position: absolute;
	opacity: 0;
	top: 0;
	right: -20px;
	transition: 0.5s;
}

button:hover span {
	padding-right: 25px;
}

button:hover span:after {
	opacity: 1;
	right: 0;
}
</style>
</head>
<body>
<body style="background-color: azure;">
	<jsp:include page="/common/header.jsp"></jsp:include>
	<div style="margin-left: 20%">
		<h1>Book Store Staff Page</h1>
		<br> <a href="all-orders.jsp" id="cart"><button>
				<span>Process Order</span>
			</button></a>
	</div>
</body>
</html>
