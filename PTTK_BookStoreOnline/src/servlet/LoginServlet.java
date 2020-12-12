
package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import controller.impl.AccountDAOImpl;
import controller.impl.PersonDAOImpl;
import model.Account;
import model.Person;

public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	AccountDAOImpl accountDAOImpl = new AccountDAOImpl();
	Account account = new Account();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/login.jsp");
		requestDispatcher.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		account.setUsername(request.getParameter("username"));
		account.setPassword(request.getParameter("password"));

		Account a = accountDAOImpl.checkAccount(account);
		HttpSession httpSession = request.getSession();

		if (a != null) {
			int customerID = a.getId();
			Person p = new PersonDAOImpl().getPersonByAccountID(customerID);
			String name = p.getFullNameID().getLastName() + " " + p.getFullNameID().getMiddleName() + " "
					+ p.getFullNameID().getFirstName();

			System.out.println(customerID);
			System.out.println(name);

			httpSession.setAttribute("customerID", customerID);
			httpSession.setAttribute("personID", p.getId());
			httpSession.setAttribute("name", name);
			httpSession.setAttribute("role", a.getRole());
			
			response.sendRedirect("./dashboard");
		} else {
			request.setAttribute("message", "Authentication failed");
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/login.jsp");
			requestDispatcher.forward(request, response);
		}
	}

}
