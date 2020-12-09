<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Login</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/css/style.css" />
</head>
<body>
	<jsp:include page="/common/header.jsp"></jsp:include>
	<div class="error-message">${message}</div>
	<form action="" method="POST">
		<label>Username</label> <input type="text" name="username" /> <br />
		<label>Password</label> <input type="password" name="password" /> <br />
		<input type="submit" value="Login" />
	</form>
</body>
</html>
