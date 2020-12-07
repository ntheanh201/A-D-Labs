
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.impl.AccountDAOImpl;
import dao.impl.PersonDAOImpl;
import model.Account;
import model.Person;

//@WebServlet(urlPatterns={"/login"})
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	AccountDAOImpl accountDAOImpl = new AccountDAOImpl();
	Account account = new Account();

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		try (PrintWriter out = response.getWriter()) {
			/* TODO output your page here. You may use following sample code. */
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Servlet LoginServlet</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>Servlet LoginServlet at " + request.getContextPath() + "</h1>");
			out.println("</body>");
			out.println("</html>");
		}
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("hihi");
		processRequest(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		account.setUsername(request.getParameter("username"));
		account.setPassword(request.getParameter("password"));

		Account a = accountDAOImpl.checkAccount(account);
		String redirectUrl = "result.jsp?status=%s&detail=%s";
		HttpSession httpSession = request.getSession();
		
		int customerID = a.getId();
		Person p = new PersonDAOImpl().getPersonByAccountID(customerID);
		String name = p.getFullNameID().getLastName() + " " + p.getFullNameID().getMiddleName() + " "
				+ p.getFullNameID().getFirstName();

		System.out.println(customerID);
		System.out.println(name);
		
		httpSession.setAttribute("customerID", customerID);
		httpSession.setAttribute("name", name);
		
		if (a != null) {
			if (a.getRole().equalsIgnoreCase("employee")) {
				httpSession.setAttribute("role", "employee");
				response.sendRedirect("staff-dashboard.jsp");
			} else {
				httpSession.setAttribute("role", "customer");
				response.sendRedirect("customer-dashboard.jsp");
			}
		} else {
			response.sendRedirect(redirectUrl.format(redirectUrl, "Fail", "Authentication failed"));
		}
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
