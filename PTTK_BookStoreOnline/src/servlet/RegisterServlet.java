
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.impl.AccountDAOImpl;
import controller.impl.AddressDAOImpl;
import controller.impl.CartDAOImpl;
import controller.impl.ContactInforDAOImpl;
import controller.impl.CustomerDAOImpl;
import controller.impl.FullnameDAOImpl;
import controller.impl.PersonDAOImpl;
import model.Account;
import model.Address;
import model.Cart;
import model.ContactInfor;
import model.Customer;
import model.FullName;
import model.Person;

public class RegisterServlet extends HttpServlet {

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		try (PrintWriter out = response.getWriter()) {
			/* TODO output your page here. You may use following sample code. */
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Servlet RegisterServlet</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>Servlet RegisterServlet at " + request.getContextPath() + "</h1>");
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
		AccountDAOImpl accountDAOImpl = new AccountDAOImpl();
		Account account = new Account();
		String redirectUrl = "result.jsp?status=%s&detail=%s";
		account.setUsername(request.getParameter("username"));
		account.setPassword(request.getParameter("password"));
		account.setRole("customer");

		FullnameDAOImpl fullnameDAOImpl = new FullnameDAOImpl();
		FullName fullname = new FullName();
		fullname.setFirstName(request.getParameter("firstname"));
		fullname.setMiddleName(request.getParameter("middlename"));
		fullname.setLastName(request.getParameter("lastname"));

		AddressDAOImpl addressDAOImpl = new AddressDAOImpl();
		Address address = new Address();
		address.setCity(request.getParameter("city"));
		address.setDistrict(request.getParameter("district"));
		address.setHouseNumber(request.getParameter("houseNumber"));
		address.setDescription(request.getParameter("description"));

		ContactInforDAOImpl contactInforDAOImpl = new ContactInforDAOImpl();
		ContactInfor contactinfor = new ContactInfor();
		contactinfor.setEmail(request.getParameter("email"));
		contactinfor.setPhoneNumber(request.getParameter("phonenumber"));

		PersonDAOImpl personDAOImpl = new PersonDAOImpl();
		Person person = new Person();
		person.setGender(request.getParameter("gender"));
		person.setDateOfBirth(request.getParameter("dateofbirth"));
		System.out.println(request.getParameter("dateofbirth"));
		System.out.println(person.getDateOfBirth());
		person.setIdCard(request.getParameter("idcard"));
		if (accountDAOImpl.checkUsernameExist(account.getUsername())) {
			response.sendRedirect(redirectUrl.format(redirectUrl, "Fail", "Username existed"));
		} else {
			int accountID = accountDAOImpl.post(account);
			int fullnameID = fullnameDAOImpl.post(fullname);
			int addressID = addressDAOImpl.post(address);

			contactinfor.setAddressID(address);
			contactinfor.getAddressID().setId(addressID);

			int contactinforID = contactInforDAOImpl.post(contactinfor);

			person.setAccountID(account);
			person.setContactInforID(contactinfor);
			person.setFullNameID(fullname);
			person.getAccountID().setId(accountID);
			person.getContactInforID().setId(contactinforID);
			person.getFullNameID().setId(fullnameID);
			System.out.println(person.toString());

			int personID = personDAOImpl.post(person);

			int cartID = new CartDAOImpl().post(new Cart());

			CustomerDAOImpl customerDAOImpl = new CustomerDAOImpl();
			Customer customer = new Customer();
			customer.setPersonID(personID);
			customer.setCartID(new Cart());
			customer.getCartID().setId(cartID);

			customerDAOImpl.post(customer);
			response.sendRedirect(redirectUrl.format(redirectUrl, "Success", "Register successful!"));
		}
	}
}
