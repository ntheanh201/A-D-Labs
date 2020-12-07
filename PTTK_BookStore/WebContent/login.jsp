<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Login</title>
    <style>
      html,
      body {
        height: 100%;
        margin: 0px;
      }
    </style>
  </head>
  <body style="background-color: azure">
    <jsp:include page="/common/header.jsp"></jsp:include>
    <form
      action="login"
      method="POST"
      style="margin-left: 35%; margin-top: 10%"
    >
      <label>Username</label>
      <input type="text" name="username" style="margin-left: 3%" />
      <br />
      <br />
      <label>Password</label>
      <input type="password" name="password" style="margin-left: 31px" />
      <br />
      <br />
      <input type="submit" style="margin-left: 15%" />
    </form>
  </body>
</html>
