
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.impl.AddressDAOImpl;
import controller.impl.ShippingAddressDAOImpl;
import model.Address;
import model.ShippingAdd;

public class ShippingAddressServlet extends HttpServlet {
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

		AddressDAOImpl addressDAOImpl = new AddressDAOImpl();
		Address address = new Address();
		address.setCity(request.getParameter("city"));
		address.setDistrict(request.getParameter("district"));
		address.setHouseNumber(request.getParameter("houseNumber"));
		address.setDescription(request.getParameter("description"));

		int addressID = addressDAOImpl.post(address);
		address.setId(addressID);

		ShippingAddressDAOImpl shippingAddressDAOImpl = new ShippingAddressDAOImpl();
		ShippingAdd shippingaddress = new ShippingAdd();
		shippingaddress.setAddressID(address);
		shippingaddress.setNote(request.getParameter("note"));
		int saID = shippingAddressDAOImpl.post(shippingaddress);

		request.getSession().setAttribute("shippingaddressID", saID);
		response.sendRedirect("./views/payment.jsp");
	}

}
