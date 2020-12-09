package servlet;

import java.io.IOException;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import controller.impl.OrderDetailDAOImpl;
import model.OrderDetail;

@WebServlet(urlPatterns = { "/orders" })
public class OrdersServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession httpSession = request.getSession();
		if (httpSession.getAttribute("role").toString().equalsIgnoreCase("employee")) {
			OrderDetailDAOImpl orderlineDAOImpl = new OrderDetailDAOImpl();
			List<OrderDetail> list = orderlineDAOImpl.getAll();
			Locale localeVN = new Locale("vi", "VN");
			NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
			
			long total = 0;
			
			for (OrderDetail i : list) {
				total += Long.parseLong(i.getItemID().getSalePrice().toString());
			}
			request.setAttribute("list", list);
			request.setAttribute("currency", currencyVN);
			request.setAttribute("total", total);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/employee/orders.jsp");
			requestDispatcher.forward(request, response);
		} else {
			
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/customer/orders.jsp");
			requestDispatcher.forward(request, response);
		}
	}
}
