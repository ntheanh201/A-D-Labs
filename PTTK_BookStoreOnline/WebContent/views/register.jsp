<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Service Provider</title>
<link rel="stylesheet" href="./assets/css/style.css" />
<link
	href="https://fonts.googleapis.com/css2?family=Roboto:wght@100;400;500&display=swap"
	rel="stylesheet" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/css/style.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/css/auth.css" />
</head>
<body>
	<section class="main-content">
		<div class="row">
			<div class="column barber-bgr"></div>
			<div class="column login-page">
				<div class="content-header">
					<button class="btn btn-get-barber">Button</button>
				</div>
				<div class="content-container">
					<div class="content-body">
						<div class="branding">
							<img src="" alt="" /> <span>Branding</span>
						</div>
						<div class="title">Signup</div>
						<form action="register" class="login-form" method="POST">
							<input
								type="text" placeholder="Username *" required
								name="username" />
							<input type="text" placeholder="First name *" name="firstName"
								required /> <input type="text" placeholder="Middle name *"
								name="middleName" required /> <input type="text"
								placeholder="Last name *" name="lastName" required /><input
								type="password" placeholder="Password *" required
								name="password" />
							<div class="gender-select">
								<input type="radio" name="gender" value="Male" />Male <input
									type="radio" name="gender" value="Female" />Female <input
									type="radio" name="gender" value="Undefined" />Undefined
							</div>
							<div>
								<input type="text" placeholder="Email" name="email" />
								<input type="text" placeholder="Phone Number" name="phoneNumber"
								 />
							</div>
							<input type="date" name="dateOfBirth" placeholder="DateOfBirth" />
							<div class="address">
								<input type="text" placeholder="Street" name="street" />
								<input type="text" placeholder="District" name="district" />
								<input type="text" placeholder="City" name="city" />
							</div>
							<div class="error-message">${message}</div>

							<button class="btn btn-submit">Register</button>
						</form>
						<div class="external-signin">
							<div class="external-signin-title">
								<div class="wing"></div>
								<div class="external-title">Or sign in with</div>
								<div class="wing"></div>
							</div>
							<div class="extern-button">
								<button class="btn btn-external">
									<img src="./assets/image/gg.svg" alt="" /> <span>Google</span>
								</button>
								<button class="btn btn-external btn-fb">
									<div class="rounded">
										<img src="./assets/image/fb.svg" alt="" />
									</div>
									<span>Facebook</span>
								</button>
							</div>
						</div>
					</div>
					<div class="content-footer">
						<span>Have an account?</span> <a href="./login">Login</a>
					</div>
				</div>
			</div>
		</div>
	</section>
</body>
</html>



