<div id="header"
	style="background-color: #e8e8e8; box-sizing: border-box; height: 150px">
	<div style="float: left; margin-left: 20px">
		<a href="${pageContext.request.contextPath}/index.jsp">BookStore</a>
	</div>
	<!-- <div
		style="float: left; margin-left: 100px; margin-top: 50px; background-color: white; border: 3px solid coral;">
		<form action="products.jsp" method="GET">
			<input type="text" name="item_name"
				placeholder="Search everything you need..."
				style="width: 600px; height: 40px; float: left; border: none" />
			<input type="image" style="width: 50px; height: 40px; float: left"
				src="resources/searchbtn.png" />
		</form>
	</div> -->
	<%
		if (session.getAttribute("customerID") == null) {
	%>
	<div style="float: left; margin-left: 100px; margin-top: 50px">
		<a href="login.jsp"
			style="font-size: 24px; text-decoration: none; font-weight: bold; color: darkcyan;">Login</a>
		<br /> Don't have account? <a href="register.jsp" style="color: red">Register</a>
	</div>
	<%
		} else {
	%>
	<div style="float: left; margin-left: 100px; margin-top: 50px">
		Hello
		<%=session.getAttribute("name")%>
		<br />
		<a href="${pageContext.request.contextPath}/logout.jsp">Logout</a> <br />
		<%
			String mainPage = session.getAttribute("role") == "employee" ? "staff-dashboard.jsp" : "customer-dashboard.jsp";
		%>
		<a href="<%=mainPage%>">Dashboard</a>
	</div>
	<%
		}
	%>
</div>
