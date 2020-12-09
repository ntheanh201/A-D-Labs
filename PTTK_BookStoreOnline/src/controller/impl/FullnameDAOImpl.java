
package controller.impl;

import static controller.BaseDAO.con;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import controller.FullnameDAO;
import model.FullName;

public class FullnameDAOImpl implements FullnameDAO {

	@Override
	public List<FullName> getAll() {
		throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
																		// Tools | Templates.
	}

	@Override
	public FullName get(int id) {
		String sql = "SELECT * FROM fullname WHERE ID = ? ";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();
			FullName fn = new FullName();
			rs.first();
			fn.setFirstName(rs.getString("FirstName"));
			fn.setMiddleName(rs.getString("MiddleName"));
			fn.setLastName(rs.getString("LastName"));
			return fn;
		} catch (SQLException ex) {
			Logger.getLogger(AccountDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
			return null;
		}
	}

	@Override
	public int post(FullName t) {
		String sql = "INSERT INTO book_store.fullname (firstname, middlename, lastname)" + "VALUES(?,?,?);";
		int key = -1;
		try {
			PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			ps.setString(1, t.getFirstName());
			ps.setString(2, t.getMiddleName());
			ps.setString(3, t.getLastName());

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
	public void put(FullName t) {
		throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
																		// Tools | Templates.
	}

	@Override
	public void delete(FullName t) {
		throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
																		// Tools | Templates.
	}

	public static void main(String[] args) {
		FullName f = new FullName();
		f.setFirstName("x");
		f.setMiddleName("y");
		f.setLastName("z");
		System.out.println(new FullnameDAOImpl().post(f));
	}
}
