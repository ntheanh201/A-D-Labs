
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.impl.OnlineOrderDAOImpl;
import model.Onlineorder;

public class OnlineOrderServlet extends HttpServlet {

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		try (PrintWriter out = response.getWriter()) {
			/* TODO output your page here. You may use following sample code. */
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Servlet OnlineOrderServlet</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>Servlet OnlineOrderServlet at " + request.getContextPath() + "</h1>");
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
		try {
			String redirectUrl = "result.jsp?status=%s&detail=%s";
			OnlineOrderDAOImpl aOImpl = new OnlineOrderDAOImpl();
			String orderID = request.getParameter("orderID");
			Onlineorder a = aOImpl.searchOnlineOrders(Integer.parseInt(orderID));
			a.setState(request.getParameter("method").toString());
			aOImpl.update(a);
			response.sendRedirect("handle-order.jsp?orderID=" + request.getParameter("orderID"));
		} catch (SQLException ex) {
			Logger.getLogger(OnlineOrderServlet.class.getName()).log(Level.SEVERE, null, ex);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
