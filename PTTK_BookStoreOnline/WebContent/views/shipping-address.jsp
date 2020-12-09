<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Shipping Address</title>
</head>
<body>
	<jsp:include page="/common/header.jsp"></jsp:include>
	<h1>We need shipping information for
		your order...</h1>
	<div>
		<form action="../addShippingAddress" method="POST">
			<div>
				<label>House Number</label> <input type="text" name="houseNumber" />
				<br /> <label>Street</label> <input type="text" name="street" /> <br />
				<label>District</label> <input type="text" name="district" /> <br />
				<label>City</label> <input type="text" name="city" /> <br /> <label>Description</label>
				<input type="text" name="desciption" /> <br /> <br /> <label>Note:
				</label> <input type="text" name="note" />
			</div>
			<br /> <input type="submit" value="Submit" />
		</form>
	</div>
</body>
</html>
