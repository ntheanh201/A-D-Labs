
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import controller.impl.AddressDAOImpl;
import controller.impl.ItemDAOImpl;
import controller.impl.OnlineOrderDAOImpl;
import controller.impl.OrderDetailDAOImpl;
import controller.impl.ShippingAddressDAOImpl;
import model.Address;
import model.Item;
import model.OnlineOrder;
import model.OrderDetail;
import model.ShippingAdd;

public class CreateOrderServlet extends HttpServlet {
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		try (PrintWriter out = response.getWriter()) {
			/* TODO output your page here. You may use following sample code. */
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Servlet ShippingAddressServlet</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>Servlet ShippingAddressServlet at " + request.getContextPath() + "</h1>");
			out.println("</body>");
			out.println("</html>");
		}
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println(request.getParameter("sa") == null);
		int saID = 0;
		ShippingAdd shippingaddress = new ShippingAdd();
		HttpSession httpSession = request.getSession();
		if (request.getParameter("sa") == null) {
			AddressDAOImpl addressDAOImpl = new AddressDAOImpl();
			Address address = new Address();
			address.setCity(request.getParameter("city"));
			address.setDistrict(request.getParameter("district"));
			address.setStreet(request.getParameter("street"));
			address.setDescription(request.getParameter("description"));

			int addressID = addressDAOImpl.post(address);
			address.setId(addressID);

			ShippingAddressDAOImpl shippingAddressDAOImpl = new ShippingAddressDAOImpl();
			shippingaddress.setAddressID(address);
			shippingaddress.setNote(request.getParameter("note"));
			shippingaddress.setPersonID(Integer.parseInt(httpSession.getAttribute("personID").toString()));
			
			saID = shippingAddressDAOImpl.post(shippingaddress);
		} else {
			saID = Integer.parseInt(request.getParameter("saID"));
		}
		

//		request.getSession().setAttribute("shippingaddressID", saID);
		
		int shippingaddressID = saID;
		int customerID = Integer.parseInt(httpSession.getAttribute("personID").toString());
		String paymentmethod = request.getParameter("method");
		shippingaddress.setId(shippingaddressID);

		OnlineOrderDAOImpl oImpl = new OnlineOrderDAOImpl();
		
		OnlineOrder o = new OnlineOrder();
		o.setCustomerID(customerID);
		o.setPaymentmethod(paymentmethod);
		o.setShippingAddressID(shippingaddress);
		o.setState("Checking");

		int orderID = oImpl.post(o);
		o.setOrderID(orderID);
		System.out.println("Orderid: " + orderID);
		ItemDAOImpl itemDAOImpl = new ItemDAOImpl();
		List<Item> items = itemDAOImpl.findItemInCart(Integer.parseInt(httpSession.getAttribute("personID").toString()));
		System.out.println("items: " + items);
		OrderDetailDAOImpl orderDetailDAOImpl = new OrderDetailDAOImpl();
		for (Item i : items) {
			OrderDetail o1 = new OrderDetail();
			o1.setItemID(i);
			o1.setOrderID(o);
			orderDetailDAOImpl.post(o1);
		}
		
		request.setAttribute("message", "Created order successfully. We will handle it");
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/customer/dashboard.jsp");
		requestDispatcher.forward(request, response);
	}

}
