
<%@page import="model.Address"%>
<%@page import="controller.impl.AddressDAOImpl"%>
<%@page import="model.ShippingAdd"%>
<%@page import="controller.impl.ShippingAddressDAOImpl"%>
<%@page import="model.Person"%>
<%@page import="controller.impl.PersonDAOImpl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Shipping Address</title>
</head>
<body>
	<jsp:include page="/common/header.jsp"></jsp:include>
	<h1>We need shipping information for your order...</h1>
	<div>
		<form action="../createOrder" method="POST">
			Choose an existing address or create new
			<div class="gender-select">
				<input type="radio" name="sa" value="existed" />
				<%
				int saID = 1;
				int personID = Integer.parseInt(session.getAttribute("personID").toString());
				System.out.println("personID: " + personID);
				/* PersonDAOImpl personDAOImpl = new PersonDAOImpl();
				Person person = personDAOImpl.get(Integer.parseInt(session.getAttribute("personID").toString())); */
				ShippingAddressDAOImpl shippingAddressDAOImpl = new ShippingAddressDAOImpl();
				ShippingAdd shipadd = shippingAddressDAOImpl.getByPerson(personID);
				Address add = new Address();
				if (shipadd != null){
					AddressDAOImpl addressDAOImpl = new AddressDAOImpl();
					add = addressDAOImpl.get(shipadd.getAddressID().getId());
					saID = shipadd.getId();
				}
				System.out.println("shipAdd: " + shipadd);
				%>
				<%= add.getStreet() %> - <%= add.getDistrict() %> - <%= add.getCity() %>
				<input hidden="true" name="saID" value="<%= saID %>" />
			</div>
			<div>
				<br /> <label>Street</label> <input type="text" name="street" /> <br />
				<label>District</label> <input type="text" name="district" /> <br />
				<label>City</label> <input type="text" name="city" /> <br /> <label>Description</label>
				<input type="text" name="desciption" /> <br /> <br /> <label>Note:
				</label> <input type="text" name="note" />
			</div>
			<div>
				<select name="method" onchange="">
					<option value="Cash On Delivery">Cash On Delivery</option>
					<option value="Master Card">Master Card</option>
					<option value="Wallet">Wallet</option>
				</select>
			</div>
			<br /> <input type="submit" value="Submit" />
		</form>
	</div>
</body>
</html>
