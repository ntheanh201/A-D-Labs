
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.impl.AddressDAOImpl;
import dao.impl.ShippingAddressDAOImpl;
import model.Address;
import model.Shippingaddress;


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

${pageContext.request.contextPath}    
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
        address.setTown(request.getParameter("town"));
        address.setDescription(request.getParameter("description"));

        int addressID = addressDAOImpl.save(address);
        address.setId(addressID);

        ShippingAddressDAOImpl shippingAddressDAOImpl = new ShippingAddressDAOImpl();
        Shippingaddress shippingaddress = new Shippingaddress();
        shippingaddress.setAddressID(address);
        shippingaddress.setNote(request.getParameter("note"));
        int saID = shippingAddressDAOImpl.save(shippingaddress);

        request.getSession().setAttribute("shippingaddressID", saID);
        response.sendRedirect("payment.jsp");
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
