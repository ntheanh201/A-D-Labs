
package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import controller.impl.CartDAOImpl;
import controller.impl.CustomerDAOImpl;
import model.Customer;

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
		HttpSession httpSession = request.getSession();
				
		int itemID = Integer.parseInt(request.getParameter("ItemID"));
		int personID = (int) httpSession.getAttribute("personID");
		System.out.println(itemID);
		System.out.println(personID);
		
		CustomerDAOImpl customerDAOImpl = new CustomerDAOImpl();
		Customer c = customerDAOImpl.get(personID);
		System.out.println(c);
		int cartID = c.getCartID().getId();
		cartDAOImpl.addNewItemToCart(itemID, cartID);
		
		request.setAttribute("message", "Add item to cart successfully");
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/customer/dashboard.jsp");
		requestDispatcher.forward(request, response);
	}

}
