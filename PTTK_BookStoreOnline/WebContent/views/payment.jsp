<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Choose Payment Method</title>
</head>
<body>
	<jsp:include page="/common/header.jsp"></jsp:include>
	<h1>How will you pay?</h1>
	<div>
		<form action="../createOrder" method="POST">
			<div>
				<select name="method" onchange="">
					<option value="Cash On Delivery">Cash On Delivery</option>
					<option value="Master Card">Master Card</option>
					<option value="Wallet">Wallet</option>
				</select>
			</div>
			<br /> <input type="submit" value="Submit" />
		</form>
	</div>
	<script></script>
</body>
</html>
