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
  <body style="background-color: azure">
    <jsp:include page="/common/header.jsp"></jsp:include>
    <h1 style="margin-left: 300px">
      We need shipping information for your order...
    </h1>
    <div style="margin-left: 30%; width: 20%; text-align: right">
      <form action="shippingaddress" method="POST">
        <div>
          <label>City</label>
          <input type="text" name="city" />
          <br />
          <label>District</label>
          <input type="text" name="district" />
          <br />
          <label>Town</label>
          <input type="text" name="town" />
          <br />
          <label>Description</label>
          <input type="text" name="desciption" />
          <br />
          <br />
          <label>Note (Time, Phone number,...)</label>
          <input type="text" name="note" />
        </div>
        <br />
        <input type="submit" style="margin-left: 200px" />
      </form>
    </div>
  </body>
</html>
