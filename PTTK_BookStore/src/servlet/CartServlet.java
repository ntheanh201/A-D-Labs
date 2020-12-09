
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.impl.CartDAOImpl;
import controller.impl.CustomerDAOImpl;

public class CartServlet extends HttpServlet {
	CartDAOImpl cartDAOImpl = new CartDAOImpl();

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		try (PrintWriter out = response.getWriter()) {
			/* TODO output your page here. You may use following sample code. */
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Servlet CartServlet</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>Servlet CartServlet at " + request.getContextPath() + "</h1>");
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
		String redirectUrl = "result.jsp?status=%s&detail=%s";
		int itemID = Integer.parseInt(request.getParameter("ItemID"));
		int customerID = Integer.parseInt(request.getParameter("CustomerID"));
		CustomerDAOImpl customerDAOImpl = new CustomerDAOImpl();
		int cartID = customerDAOImpl.get(customerID).getCartID().getId();
		System.out.println(itemID + " " + cartID);
		cartDAOImpl.addNewItemToCart(itemID, cartID);
		response.sendRedirect(redirectUrl.format(redirectUrl, "Success", "Added Item To Cart!"));
	}

}
