package servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.impl.CustomerDAOImpl;
import controller.impl.FullnameDAOImpl;
import controller.impl.OnlineOrderDAOImpl;
import controller.impl.OrderDetailDAOImpl;
import controller.impl.PersonDAOImpl;
import controller.impl.ShippingAddressDAOImpl;
import model.Customer;
import model.FullName;
import model.OnlineOrder;
import model.OrderDetail;
import model.Person;
import model.ShippingAdd;

@WebServlet(urlPatterns = { "/handle-order" })
public class HandleOrderServlet extends HttpServlet {
	private List<OrderDetail> list;
	private FullName fullName;
	private ShippingAdd shipadd;
	private NumberFormat currencyVN;
	private long total = 0;

	private void handleOrder(HttpServletRequest request) {
		String orderID = request.getParameter("orderID");

		try {
			OnlineOrderDAOImpl aOImpl = new OnlineOrderDAOImpl();
			OnlineOrder onlineorder = aOImpl.searchOnlineOrders(Integer.parseInt(orderID));
			OrderDetailDAOImpl orderDetailDAOImpl = new OrderDetailDAOImpl();
			CustomerDAOImpl customerDAOImpl = new CustomerDAOImpl();
			Customer cus = customerDAOImpl.get(onlineorder.getCustomerID());
			PersonDAOImpl personDAOImpl = new PersonDAOImpl();
			
			Person person = personDAOImpl.get(cus.getPersonID());
			
			FullnameDAOImpl fullnameDAOImpl = new FullnameDAOImpl();
			fullName = fullnameDAOImpl.get(person.getFullNameID().getId());
			ShippingAddressDAOImpl shippingAddressDAOImpl = new ShippingAddressDAOImpl();
			shipadd = shippingAddressDAOImpl.get(onlineorder.getShippingAddressID().getId());
			list = orderDetailDAOImpl.getOrderLinesByOrderId(Integer.parseInt(orderID));
			Locale localeVN = new Locale("vi", "VN");
			currencyVN = NumberFormat.getCurrencyInstance(localeVN);
			for (OrderDetail i : list) {
				total += Long.parseLong(i.getItemID().getSalePrice().toString());
			}
			
			System.out.println(shipadd);
			
			request.setAttribute("list", list);
			request.setAttribute("currency", currencyVN);
			request.setAttribute("total", currencyVN.format(total));
			request.setAttribute("fullName", fullName);
			request.setAttribute("shipadd", shipadd);
			request.setAttribute("onlineorder", onlineorder);
		} catch (SQLException ex) {
			Logger.getLogger(HandleOrderServlet.class.getName()).log(Level.SEVERE, null, ex);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		response.sendRedirect("./views/employee/handle.jsp?orderID=" + request.getParameter("orderID"));

		handleOrder(request);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/employee/handle-order.jsp");
		requestDispatcher.forward(request, response);

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String orderID = request.getParameter("orderID");

			OnlineOrderDAOImpl aOImpl = new OnlineOrderDAOImpl();
			OnlineOrder a = aOImpl.searchOnlineOrders(Integer.parseInt(orderID));
			a.setState(request.getParameter("method").toString());
			aOImpl.put(a);
			
//			response.sendRedirect("./views/employee/handle.jsp?orderID=" + request.getParameter("orderID"));

			handleOrder(request);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/employee/handle-order.jsp");
			requestDispatcher.forward(request, response);
		} catch (SQLException ex) {
			Logger.getLogger(HandleOrderServlet.class.getName()).log(Level.SEVERE, null, ex);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
