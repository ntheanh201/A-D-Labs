<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Book Store</title>
<style>
html, body {
	height: 100%;
	margin: 0px;
}
</style>
</head>
<body style="background-color: azure">
	<jsp:include page="/common/header.jsp"></jsp:include>
	<%
	String status = request.getParameter("status");
	String detail = request.getParameter("detail");
	%>
	<div style="margin-left: 20%">
		<h1><%=status%></h1>
		<p><%=detail%></p>
	</div>
</body>
</html>
