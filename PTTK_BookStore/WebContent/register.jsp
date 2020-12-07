<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>JSP Page</title>
<style>
html, body {
	height: 100%;
	margin: 0px;
}
</style>
</head>
<bodytyle="background-color: azure; height: 200px">
	<jsp:include page="/common/header.jsp"></jsp:include>
	<h1 style="margin-left: 300px; color: red">Register now for your
		First-Super-Discount!</h1>
	<div style="margin-left: 30%; width: 20%; text-align: right">
		<form action="register" method="POST">
			<div>
				<label>Username</label> <input type="text" name="username" /> <br />
				<label>Password</label> <input type="password" name="password" />
			</div>
			<br />
			<div>
				<label>FirstName</label> <input type="text" name="firstname" /> <br />
				<label>MiddleName</label> <input type="text" name="middlename" /> <br />
				<label>LastName</label> <input type="text" name="lastname" />
			</div>
			<br />
			<div>
				<label>IDCard</label> <input type="text" name="idcard" /> <br /> <input
					type="radio" name="gender" value="Male" />Male <input type="radio"
					name="gender" value="Female" />Female <input type="radio"
					name="gender" value="3rd" />3rd <br /> <br /> <label>Date
					Of Birth</label> <input type="date" name="dateofbirth" />
			</div>
			<br />
			<div>
				<label>PhoneNumber</label> <input type="text" name="phonenumber" />
				<br /> <label>Email</label> <input type="text" name="email" /> <br />
				<br /> <label style="margin-right: 70px">Address</label> <br /> <label>City</label>
				<input type="text" name="city" /> <br /> <label>District</label> <input
					type="text" name="district" /> <br /> <label>Town</label> <input
					type="text" name="town" /> <br /> <label>Description</label> <input
					type="text" name="desciption" />
			</div>
			<br /> <input type="submit" style="margin-left: 200px" />
		</form>
	</div>
</body>
</html>
