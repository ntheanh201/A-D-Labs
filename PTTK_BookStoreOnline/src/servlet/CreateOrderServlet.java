
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.impl.ItemDAOImpl;
import controller.impl.OnlineOrderDAOImpl;
import controller.impl.OrderDetailDAOImpl;
import model.Item;
import model.Onlineorder;
import model.OrderDetail;
import model.ShippingAdd;

public class CreateOrderServlet extends HttpServlet {

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		try (PrintWriter out = response.getWriter()) {
			/* TODO output your page here. You may use following sample code. */
			out.println(request.getParameter("method") + " " + request.getSession().getAttribute("shippingaddressID"));
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
		int shippingaddressID = Integer.parseInt(request.getSession().getAttribute("shippingaddressID").toString());
		int customerID = Integer.parseInt(request.getSession().getAttribute("customerID").toString());
		String paymentmethod = request.getParameter("method");
		ShippingAdd s = new ShippingAdd();
		s.setId(shippingaddressID);

		OnlineOrderDAOImpl oImpl = new OnlineOrderDAOImpl();
		Onlineorder o = new Onlineorder();
		o.setCustomerID(customerID);
		o.setPaymentmethod(paymentmethod);
		o.setShippingAddressID(s);
		o.setState("Processing");

		int orderID = oImpl.post(o);
		o.setOrderID(orderID);
		ItemDAOImpl itemDAOImpl = new ItemDAOImpl();
		List<Item> items = itemDAOImpl.findItemInCart(customerID);

		OrderDetailDAOImpl orderlineDAOImpl = new OrderDetailDAOImpl();
		for (Item i : items) {
			OrderDetail o1 = new OrderDetail();
			o1.setItemID(i);
			o1.setOrderID(o);
			orderlineDAOImpl.post(o1);
		}

		String redirectUrl = "result.jsp?status=%s&detail=%s";
		response.sendRedirect(
				redirectUrl.format(redirectUrl, "Success", "Make order successful, our staff will process it soon!"));

	}
}
