
package dao.impl;

import static dao.BaseDAO.con;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import dao.ContactinforDAO;
import model.ContactInfor;

public class ContactInforDAOImpl implements ContactinforDAO {

	@Override
	public List<ContactInfor> getAll() {
		throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
																		// Tools | Templates.
	}

	@Override
	public ContactInfor get(int id) {
		throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
																		// Tools | Templates.
	}

	@Override
	public int save(ContactInfor t) {
		String sql = "INSERT INTO book_store.contactinfor (phonenumber, email, AddressID)" + "VALUES(?,?,?);";
		int key = -1;
		try {
			PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			ps.setString(1, t.getPhoneNumber());
			ps.setString(2, t.getEmail());
			ps.setInt(3, t.getAddressID().getId());

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
	public void update(ContactInfor t) {
		throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
																		// Tools | Templates.
	}

	@Override
	public void delete(ContactInfor t) {
		throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
																		// Tools | Templates.
	}

	public static void main(String[] args) {
		ContactInfor c = new ContactInfor();
		c.getAddressID().setId(2);
		c.setEmail("fafsa");
		c.setPhoneNumber("fsagsaga");

//        System.out.println(c.getAddressID().getId());
//        System.out.println(new ContactInforDAOImpl().save(c));
	}
}
