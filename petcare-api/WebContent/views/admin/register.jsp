<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <link
      rel="stylesheet"
      href="${pageContext.request.contextPath}/static/css/admin-style.css"
    />
    <link
      rel="stylesheet"
      href="${pageContext.request.contextPath}/static/css/pure-min.css"
    />
    <link
      rel="stylesheet"
      href="${pageContext.request.contextPath}/static/css/pure-responsive-min.css"
    />
    <link
      rel="stylesheet"
      href="${pageContext.request.contextPath}/static/css/login.css"
    />
    <title>PetCare Admin Register</title>
    <link
      href="https://fonts.googleapis.com/css2?family=Roboto:wght@100;400;500&display=swap"
      rel="stylesheet"
    />
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
                <img src="" alt="" />
                <span>PetCare Admin</span>
              </div>
              <div class="title">Register</div>
              <form action="./register" method="post" class="login-form">
                <input type="text" placeholder="Username" name="username" />
                <input type="password" placeholder="Password" name="password" />
                <input type="password" placeholder="Re-Enter Password" name="re-password" />
                <div class="forgot-password">
                  <a href="./forgot-password">Forgot password?</a>
                </div>
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
                    <img src="${pageContext.request.contextPath}/static/image/gg.svg" alt="" />
                    <span>Google</span>
                  </button>
                  <button class="btn btn-external btn-fb">
                    <div class="rounded">
                      <img src="${pageContext.request.contextPath}/static/image/fb.svg" alt="" />
                    </div>
                    <span>Facebook</span>
                  </button>
                </div>
              </div>
            </div>
            <!-- <div class="content-footer">
              <span>Don't have an account yet?</span>
              <a href="./register">Register</a>
            </div> -->
          </div>
        </div>
      </div>
    </section>
  </body>
</html>
