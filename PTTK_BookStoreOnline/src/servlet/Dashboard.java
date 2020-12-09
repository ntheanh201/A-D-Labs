package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = { "/dashboard" })
public class Dashboard extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession httpSession = request.getSession();
		if (httpSession.getAttribute("role").toString().equalsIgnoreCase("employee")) {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/employee/dashboard.jsp");
			requestDispatcher.forward(request, response);
		} else {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/customer/dashboard.jsp");
			requestDispatcher.forward(request, response);
		}
	}
}
