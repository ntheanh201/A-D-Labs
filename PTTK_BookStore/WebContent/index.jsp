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
<body>
	<jsp:include page="/common/header.jsp"></jsp:include>
	<div id="body" style="width: 100%; height: 600px">
		<div style="width: 10%; height: 100%; float: left">&nbsp;</div>
		<div id="menu">
			<div>Category</div>
			<%
				CategoryDAOImpl categoryDAO = new CategoryDAOImpl();
			List<Category> categories = categoryDAO.getAll();
			for (int i = 0; i < categories.size(); i++) {

				int stt = i + 1;
				Category cate = categories.get(i);
			%>
			<div>
				<%=cate.getName()%></div>
			<%
				}
			%>
		</div>
		<div style="width: 60%; height: 100%; float: left">
			<jsp:include page="/items.jsp"></jsp:include>
		</div>
		<div style="width: 10%; height: 100%; float: left">&nbsp;</div>
	</div>
</body>s
</html>
