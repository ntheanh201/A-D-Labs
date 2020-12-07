<%@page import="model.Category"%>
<%@page import="java.util.List"%>
<%@page import="dao.impl.CategoryDAOImpl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<style>
html, body {
	height: 100%;
	margin: 0px;
}
</style>
<title>Book Store Online</title>
</head>
<body style="background-color: azure">
	<jsp:include page="/common/header.jsp"></jsp:include>
	<div id="body" style="width: 100%; height: 600px">
		<div style="width: 10%; height: 100%; float: left">&nbsp;</div>
		<div id="menu"
			style="width: 20%; height: 100%; float: left; border: 1px solid white; text-align: center; font-size: 15px; text-decoration: underline;">
			<div
				style="width: 100%; height: 10%; background-color: burlywood; font-weight: bold; font-size: 40px; text-decoration: overline;">
				Category</div>
			<%
				CategoryDAOImpl categoryDAO = new CategoryDAOImpl();
                List<Category> categories = categoryDAO.getAll();
                for (int i = 0; i < categories.size(); i++) {

                    int stt = i + 1;
                    Category cate = categories.get(i);
            %>
			<div
				style="width: 100%; height: 10%; border: 1px solid white; background-color: cadetblue; font-family: monospace;">
				<%= cate.getName()%></div>
			<%}
            %>
		</div>
		<div style="width: 60%; height: 100%; float: left">
			<div style="height: 70%">
				<img src="resources/Bannertong_915x423.png" width="800px"
					height="400px" style="border: 6px solid white" />
			</div>
			<div style="height: 30%">
				<div style="float: left">
					<img src="resources/Banner_Coupon_596x186.png" height="120px"
						width="490px" style="border: 6px solid white" />
				</div>
				<div style="float: left">
					<img src="resources/Banner_ngoaivan10_270x186.png" height="120px"
						width="290px" style="border: 6px solid white" />
				</div>
			</div>
		</div>
		<div style="width: 10%; height: 100%; float: left">&nbsp;</div>
	</div>
</body>
</html>
