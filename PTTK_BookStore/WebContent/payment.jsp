<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>JSP Page</title>
    <style>
      html,
      body {
        height: 100%;
        margin: 0px;
      }
    </style>
  </head>
  <body>
    <jsp:include page="/common/header.jsp"></jsp:include>
    <h1 style="margin-left: 300px">How will you pay?</h1>
    <div style="margin-left: 30%; width: 20%; text-align: right">
      <form action="createOrder" method="POST">
        <div>
          <select name="method" onchange="">
            <option value="Cash On Delivery">Cash On Delivery</option>
            <option value="Master Card">Master Card</option>
            <option value="Wallet">Wallet</option>
          </select>
        </div>
        <br />
        <input type="submit" style="margin-left: 200px" />
      </form>
    </div>
    <script></script>
  </body>
</html>
