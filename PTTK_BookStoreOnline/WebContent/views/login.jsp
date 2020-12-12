<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Login</title>
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
						<div class="title">Login</div>
						<form action="" class="login-form" method="POST">
							<input type="text" placeholder="Username" name="username" /> <input type="password"
								placeholder="Password" name="password" />
							<div class="forgot-password">
								<a href="./forgot-password">Forgot password?</a>
							</div>
							<div class="error-message">${message}</div>
							<button class="btn btn-submit">Login</button>
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
						<span>Don't have an account yet?</span> <a href="./register">Register</a>
					</div>
				</div>
			</div>
		</div>
	</section>
</body>
</html>

