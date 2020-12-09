
<div style="box-sizing: border-box; height: 150px">
	<div style="float: left; margin-left: 20px">
		<a href="${pageContext.request.contextPath}">BookStore</a>
	</div>
	<div>
		<form action="../views/products.jsp" method="GET">
			<input type="text" name="item_name" placeholder="Search"
				style="width: 600px; height: 40px; float: left; border: none" /> <input
				type="image" style="width: 50px; height: 40px; float: left"
				src="img?url=searchbtn.png" />
		</form>
	</div>
	<%
		if (session.getAttribute("customerID") == null) {
	%>
	<div style="float: left; margin-left: 100px; margin-top: 50px">
		<a href="${pageContext.request.contextPath}/login"
			style="font-size: 24px; text-decoration: none; font-weight: bold; color: darkcyan;">Login</a>
		<br /> Don't have account? <a
			href="${pageContext.request.contextPath}/register" style="color: red">Register</a>
	</div>
	<%
		} else {
	%>
	<div style="float: left; margin-left: 100px; margin-top: 50px">
		Hi
		<%=session.getAttribute("name")%>
		<br /> <a href="${pageContext.request.contextPath}/views/logout.jsp">Logout</a>
		<br /> <a href="${pageContext.request.contextPath}/dashboard">Dashboard</a>
	</div>
	<%
		}
	%>
</div>
