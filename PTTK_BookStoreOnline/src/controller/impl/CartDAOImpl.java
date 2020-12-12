
package controller.impl;

import static controller.BaseDAO.con;

import java.math.BigInteger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

import controller.CartDAO;
import model.Cart;
import model.CartItem;

public class CartDAOImpl implements CartDAO {

	@Override
	public Cart findCartByCustomer(String customerId) {
		throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
																		// Tools | Templates.
	}

	@Override
	public List<Object> getAll() {
		throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
																		// Tools | Templates.
	}

	@Override
	public Optional<Object> get(int id) {
		throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
																		// Tools | Templates.
	}

	@Override
	public int post(Object t) {
		String sql = "INSERT INTO cart ()" + "VALUES();";
		int key = -1;
		try {
			PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

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
	public void put(Object t) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void delete(Object t) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void addNewItemToCart(int ItemID, int CartID) {
		// System.out.println(ItemID+" "+CartID);
		String sql = "INSERT INTO cart_item (CartID, ItemID)" + "VALUES(?,?);";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, CartID);
			ps.setInt(2, ItemID);

			ps.executeUpdate();
		} catch (SQLException ex) {
			Logger.getLogger(AccountDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
	
	public List<CartItem> getCartInfor(int personID) {
		String sql = "SELECT * FROM item, customer, cart, cart_item " + "WHERE customer.PersonID = ? "
				+ "AND customer.CartID = cart.ID " + "AND cart.ID = cart_item.CartID "
				+ "AND cart_item.ItemID = item.ID ORDER BY item.Name";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, personID);

			ResultSet rs = ps.executeQuery();
			List<CartItem> items = new ArrayList<>();
			while (rs.next()) {
				CartItem item = new CartItem();
				item.setId(rs.getInt("item.ID"));
				item.setName(rs.getString("name"));
				item.setDescription(rs.getString("description"));
				item.setSalePrice(BigInteger.valueOf(rs.getLong("saleprice")));
				item.setUrl(rs.getString("url"));
				item.setQuantity(rs.getInt("cart_item.quantity"));
				items.add(item);
			}
			return items;
		} catch (SQLException ex) {
			Logger.getLogger(AccountDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
			return null;
		}
	}

}
