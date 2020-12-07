<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Logout</title>
    <style>
      html,
      body {
        height: 100%;
        margin: 0px;
      }
    </style>
  </head>
  <body>
    <% session.removeAttribute("customerID"); session.removeAttribute("name");
    %>
    <jsp:include page="/common/header.jsp"></jsp:include>
    <h1 style="margin-left: 10%">Bye!</h1>
  </body>
</html>
