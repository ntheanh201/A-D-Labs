<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Register</title>
</head>
<body>
	<jsp:include page="/common/header.jsp"></jsp:include>
	<h1>Register</h1>
	<div>
		<form action="register" method="POST">
			<div>
				<label>Username</label> <input type="text" name="username" /> <br />
				<label>Password</label> <input type="password" name="password" />
			</div>
			<br />
			<div>
				<label>FirstName</label> <input type="text" name="firstName" /> <br />
				<label>MiddleName</label> <input type="text" name="middleName" /> <br />
				<label>LastName</label> <input type="text" name="lastName" />
			</div>
			<br />
			<div>
			Gender: 
				<input
					type="radio" name="gender" value="Male" />Male <input type="radio"
					name="gender" value="Female" />Female <input type="radio"
					name="gender" value="Undefined" />Undefined <br /> <br /> <label>Date
					Of Birth</label> <input type="date" name="dateOfBirth" />
			</div>
			<br />
			<!-- <div>
				<label>PhoneNumber</label> <input type="text" name="phonenumber" />
				<br /> <label>Email</label> <input type="text" name="email" /> <br />
				<br /> <label style="margin-right: 70px">Address</label> <br />
				<label>HouseNumber</label>
				<input type="text" name="houseNumber" /> <br />
				<label>Street</label>
				<input
					type="text" name="street" /> <br />
				<label>District</label> <input
					type="text" name="district" /> <br />
				<label>Description</label>
				<input
					type="text" name="desciption" />
			</div>
			<br />  -->
			<input type="submit"
				value="Register" />
		</form>
	</div>
</body>
</html>
