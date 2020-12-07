
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ItemDAOImpl;
import dao.impl.OnlineOrderDAOImpl;
import dao.impl.OrderlineDAOImpl;
import dao.impl.VoucherDAOImpl;
import model.Item;
import model.Onlineorder;
import model.Orderline;
import model.Shippingaddress;
import model.Voucher;

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
		Shippingaddress s = new Shippingaddress();
		s.setId(shippingaddressID);

		VoucherDAOImpl voucherDAOImpl = new VoucherDAOImpl();
		Voucher v = new Voucher();
		v.setName("0");
		v.setDescription("0");
		v.setDiscountAmount(new BigInteger("0"));
		v.setDiscountPercent(0);

		int voucherID = voucherDAOImpl.save(v);
		v.setId(voucherID);

		OnlineOrderDAOImpl oImpl = new OnlineOrderDAOImpl();
		Onlineorder o = new Onlineorder();
		o.setCustomerID(customerID);
		o.setPaymentmethod(paymentmethod);
		o.setVoucherID(v);
		o.setShippingAddressID(s);
		o.setState("Processing");

		int orderID = oImpl.save(o);
		o.setOrderID(orderID);
		ItemDAOImpl itemDAOImpl = new ItemDAOImpl();
		List<Item> items = itemDAOImpl.findItemInCart(customerID);

		OrderlineDAOImpl orderlineDAOImpl = new OrderlineDAOImpl();
		for (Item i : items) {
			Orderline o1 = new Orderline();
			o1.setItemID(i);
			o1.setOrderID(o);
			orderlineDAOImpl.save(o1);
		}

		String redirectUrl = "result.jsp?status=%s&detail=%s";
		response.sendRedirect(
				redirectUrl.format(redirectUrl, "Success", "Make order successful, our staff will process it soon!"));

	}

	/**
	 * Returns a short description of the servlet.
	 *
	 * @return a String containing servlet description
	 */
	@Override
	public String getServletInfo() {
		return "Short description";
	}// </editor-fold>

}