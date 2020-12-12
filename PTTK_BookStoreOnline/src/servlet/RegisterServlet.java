
package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
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

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/register.jsp");
		requestDispatcher.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		AccountDAOImpl accountDAOImpl = new AccountDAOImpl();
		Account account = new Account(request.getParameter("username"), request.getParameter("password"), "customer");

		FullnameDAOImpl fullnameDAOImpl = new FullnameDAOImpl();
		FullName fullname = new FullName(request.getParameter("firstName"), request.getParameter("middleName"),
				request.getParameter("lastName"));

		AddressDAOImpl addressDAOImpl = new AddressDAOImpl();
		Address address = new Address();
		address.setCity(request.getParameter("city"));
		address.setDistrict(request.getParameter("district"));
		address.setStreet(request.getParameter("street"));
//		address.setDescription(request.getParameter("description"));

		ContactInforDAOImpl contactInforDAOImpl = new ContactInforDAOImpl();
		ContactInfor contactinfor = new ContactInfor(request.getParameter("email"),
				request.getParameter("phoneNumber"));

		PersonDAOImpl personDAOImpl = new PersonDAOImpl();
		
		Person person = new Person();
		person.setGender(request.getParameter("gender"));
		person.setDateOfBirth(request.getParameter("dateOfBirth"));
//		System.out.println(request.getParameter("dateOfBirth"));
//		System.out.println(person.getDateOfBirth());

		if (accountDAOImpl.checkUsernameExist(account.getUsername())) {
			request.setAttribute("message", "Username existed");
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/register.jsp");
			requestDispatcher.forward(request, response);
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
//			System.out.println(person.toString());

			int personID = personDAOImpl.post(person);
			System.out.println(personID);
			int cartID = new CartDAOImpl().post(new Cart());
			System.out.println(cartID);
			CustomerDAOImpl customerDAOImpl = new CustomerDAOImpl();
			Customer customer = new Customer();
			customer.setPersonID(personID);
			customer.setCartID(new Cart());
			customer.getCartID().setId(cartID);

			customerDAOImpl.post(customer);

//			request.setAttribute("message", "Register successfully. Login!");
			response.sendRedirect("./login");
//			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/login.jsp");
//			requestDispatcher.forward(request, response);
		}
	}
}
