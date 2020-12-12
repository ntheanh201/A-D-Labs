
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

import controller.ShippingAddressDAO;
import model.ShippingAdd;

public class ShippingAddressDAOImpl implements ShippingAddressDAO {

	@Override
	public List<ShippingAdd> getAll() {
//		String sql = "SELECT * FROM shippingaddress";
//		List<ShippingAdd> categories = new ArrayList<ShippingAdd>();
//		try {
//			PreparedStatement ps = con.prepareStatement(sql);
//			ResultSet rs = ps.executeQuery();
//			while (rs.next()) {
//				ShippingAdd category = new ShippingAdd();
//				category.setId(rs.getInt("id"));
//				category.setName(rs.getString("Name"));
//				category.setDescription(rs.getString("Description"));
//
//				categories.add(category);
//			}
//		} catch (SQLException ex) {
//			Logger.getLogger(AccountDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
//			return null;
//		}
//		return categories;
		return null;
	}

	@Override
	public ShippingAdd get(int id) {
		String sql = "SELECT * FROM shippingaddress WHERE ID = ?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			ShippingAdd item = new ShippingAdd();
			AddressDAOImpl addressDAOImpl = new AddressDAOImpl();

			while (rs.next()) {
				item.setId(rs.getInt("ID"));
				item.setNote(rs.getString("Note"));
				item.setAddressID(addressDAOImpl.get(rs.getInt("addressID")));
				return item;
			}
			System.out.println("adderssID: " + rs.getInt("addressID"));
			return item;
		} catch (SQLException ex) {
			return null;
		}
	}

	@Override
	public int post(ShippingAdd t) {
		String sql = "INSERT INTO book_store.shippingaddress (note, addressid)" + "VALUES(?,?);";
		int key = -1;
		try {
			PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			ps.setString(1, t.getNote());
			ps.setInt(2, t.getAddressID().getId());

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
	
	public ShippingAdd getByPerson(int id) {
		String sql = "SELECT * FROM shippingaddress WHERE personID = ?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			ShippingAdd item = new ShippingAdd();
			AddressDAOImpl addressDAOImpl = new AddressDAOImpl();

			while (rs.next()) {
				item.setId(rs.getInt("ID"));
				item.setNote(rs.getString("Note"));
				item.setAddressID(addressDAOImpl.get(rs.getInt("addressID")));
				item.setPersonID(rs.getInt("personID"));
				return item;
			}
			System.out.println("adderssID: " + rs.getInt("addressID"));
			return item;
		} catch (SQLException ex) {
			return null;
		}
	}

	@Override
	public void put(ShippingAdd t) {
		throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
																		// Tools | Templates.
	}

	@Override
	public void delete(ShippingAdd t) {
		throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
																		// Tools | Templates.
	}

}
