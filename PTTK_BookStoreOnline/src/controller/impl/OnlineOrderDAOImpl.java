
package controller.impl;

import static controller.BaseDAO.con;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import controller.OnlineOrderDAO;
import model.Item;
import model.OnlineOrder;
import model.ShippingAdd;

public class OnlineOrderDAOImpl implements OnlineOrderDAO {

	@Override
	public List<OnlineOrder> getAll() {
		throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
																		// Tools | Templates.
	}

	@Override
	public OnlineOrder get(int id) {
		throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
																		// Tools | Templates.
	}

	public OnlineOrder searchOnlineOrders(int orderId) throws SQLException, ClassNotFoundException {
		OnlineOrder re = new OnlineOrder();
		String sql = "SELECT * FROM onlineorder WHERE OrderID = ? ";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, orderId);
		ResultSet rs = ps.executeQuery();
		rs.first();
		re.setCustomerID(rs.getInt("CustomerID"));
		re.setPaymentmethod(rs.getString("paymentmethod"));
		re.setOrderID(orderId);
		re.setShippingAddressID(new ShippingAdd(rs.getInt("ShippingAddressID")));
		re.setState(rs.getString("State"));
		return re;
	}

	@Override
	public int post(OnlineOrder t) {
		System.out.println(t);
		String sql = "INSERT INTO book_store.onlineorder (state, customerID, shippingaddressID, paymentmethod)"
				+ " VALUES(?,?,?,?);";
		int key = -1;
		try {
			PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			ps.setString(1, t.getState());
			ps.setInt(2, t.getCustomerID());
			ps.setInt(3, t.getShippingAddressID().getId());
			ps.setString(4, t.getPaymentmethod());

			int affectedRows = ps.executeUpdate();

			if (affectedRows == 0) {
				throw new SQLException("Creating user failed, no rows affected.");
			}

			try (ResultSet generatedKeys = ps.getGeneratedKeys()) {
				if (generatedKeys.next()) {
					key = generatedKeys.getInt(1);
				} else {
					throw new SQLException("Creating order failed, no ID obtained.");
				}
			}
		} catch (SQLException ex) {
			return key;
		}
		return key;
	}

	@Override
	public void put(OnlineOrder t) {
		System.out.println(t.toString());
		String sql = "UPDATE onlineorder SET State = ?  WHERE OrderID = ? ;";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, t.getState());
			ps.setInt(2, t.getOrderID());
			ps.executeUpdate();
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
	}

	@Override
	public void delete(OnlineOrder t) {
		throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
																		// Tools | Templates.
	}

	@Override
	public int addItemsToOrder(List<Item> items, int orderID) {
		int affectedRows = 0;
		for (Item i : items) {
			String sql = "INSERT INTO book_store.order_item (orderID, itemID)" + "VALUES(?,?);";
			int key = -1;
			try {
				PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
				ps.setInt(1, orderID);
				ps.setInt(2, i.getId());

				affectedRows += ps.executeUpdate();

				if (affectedRows == 0) {
					throw new SQLException("Creating order failed, no rows affected.");
				}

				try (ResultSet generatedKeys = ps.getGeneratedKeys()) {
					if (generatedKeys.next()) {
						key = generatedKeys.getInt(1);
					} else {
						throw new SQLException("Creating order failed, no ID obtained.");
					}
				}
			} catch (SQLException ex) {
			}
		}
		return affectedRows;
	}

}
