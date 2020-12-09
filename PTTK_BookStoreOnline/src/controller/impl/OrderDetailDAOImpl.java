
package controller.impl;

import static controller.BaseDAO.con;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import controller.OrderDetailDAO;
import model.OnlineOrder;
import model.OrderDetail;

public class OrderDetailDAOImpl implements OrderDetailDAO {

	@Override
	public List<OrderDetail> getAll() {
		List<OrderDetail> list = new ArrayList<>();
		ItemDAOImpl aOImpl = new ItemDAOImpl();
		String sql = "Select * from orderline ORDER BY OrderID";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				OrderDetail o = new OrderDetail();
				o.setId(rs.getInt("ID"));
				o.setItemID(aOImpl.get(rs.getInt("ItemID")));
				o.setOrderID(new OnlineOrder(rs.getInt("OrderID")));
				o.setQuantity(rs.getInt("Quantity"));
				System.out.println(o);
				list.add(o);
			}

		} catch (SQLException ex) {
			Logger.getLogger(OrderDetailDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
		}
		return list;
	}

	@Override
	public OrderDetail get(int id) {
//		ItemDAOImpl aOImpl = new ItemDAOImpl();
//		List<OrderDetail> list = new ArrayList<>();
//		String sql = "Select * from orderline WHERE OrderID = ?";
//		try {
//			PreparedStatement ps = con.prepareStatement(sql);
//			ps.setInt(1, id);
//			ResultSet rs = ps.executeQuery();
//			while (rs.next()) {
//				OrderDetail o = new OrderDetail();
//				o.setId(rs.getInt("ID"));
//				o.setItemID(aOImpl.get(rs.getInt("ItemID")));
//				o.setOrderID(new Onlineorder(rs.getInt("OrderID")));
//				o.setQuantity(rs.getInt("Quantity"));
//				list.add(o);
//			}
//
//		} catch (SQLException ex) {
//			Logger.getLogger(OrderDetailDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
//			return null;
//		}
//		return o;
		return null;
	}

	public List<OrderDetail> getOrderLinesByOrderId(int orderID) {
		List<OrderDetail> list = new ArrayList<>();
		ItemDAOImpl aOImpl = new ItemDAOImpl();
		String sql = "Select * from orderline where OrderID = ?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, orderID);
			ResultSet rs = ps.executeQuery();
			// rs.first();
			while (rs.next()) {
				OrderDetail o = new OrderDetail();
				o.setId(rs.getInt("ID"));
				o.setItemID(aOImpl.get(rs.getInt("ItemID")));
				o.setOrderID(new OnlineOrder(orderID));
				o.setQuantity(rs.getInt("Quantity"));
				System.out.println(o);
				list.add(o);
			}

		} catch (SQLException ex) {
			Logger.getLogger(OrderDetailDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
		}
		return list;
	}

	@Override
	public int post(OrderDetail t) {
		System.out.println(t);
		String sql = "INSERT INTO orderline (orderID, itemID)" + " VALUES(?,?);";
		int key = -1;
		try {
			PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			ps.setInt(1, t.getOrderID().getOrderID());
			ps.setInt(2, t.getItemID().getId());

			int affectedRows = ps.executeUpdate();

			if (affectedRows == 0) {
				throw new SQLException("Creating user failed, no rows affected.");
			}

			try (ResultSet generatedKeys = ps.getGeneratedKeys()) {
				if (generatedKeys.next()) {
					key = generatedKeys.getInt(1);
				} else {
					throw new SQLException("Creating user failed, no ID obtained.");
				}
			}
		} catch (SQLException ex) {
			return key;
		}
		return key;
	}

	@Override
	public void put(OrderDetail t) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void delete(OrderDetail t) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public static void main(String[] args) {
//		System.out.println(new OrderDetailDAOImpl().getOrderLinesByOrderId(1));
	}
}
