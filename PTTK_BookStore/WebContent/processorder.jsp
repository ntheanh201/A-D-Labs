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
		<form action="onlineorder.jsp" method="GET"
			style="margin-left: 35%; margin-top: 10%">
			<input type="text" name="orderID" style="margin-left: 3%"
				placeholder="Insert Order ID..."> <input type="submit"
				style="margin-left: 3%" value="Search">
		</form>
	</div>
</body>
</html>
