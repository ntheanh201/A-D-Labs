
package controller.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import controller.AccountDAO;
import model.Account;

public class AccountDAOImpl implements AccountDAO {

	@Override
	public List<Account> getAll() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public Account get(int id) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public int post(Account t) {
		String sql = "INSERT INTO book_store.account (username, password, role)" + "VALUES(?,?,?);";
		int key = -1;
		try {
			PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			ps.setString(1, t.getUsername());
			ps.setString(2, t.getPassword());
			ps.setString(3, t.getRole());

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
	public void put(Account t) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void delete(Account t) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public Account checkAccount(Account t) {
		String sql = "SELECT * FROM account " + "WHERE username = ? AND password = ?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, t.getUsername());
			ps.setString(2, t.getPassword());

			ResultSet rs = ps.executeQuery();
			if (rs.first()) {
				Account account = new Account();
				account.setId(rs.getInt("ID"));
				account.setUsername(rs.getString("username"));
				account.setRole(rs.getString("role"));
				return account;
			}
			return null;
		} catch (SQLException ex) {
			Logger.getLogger(AccountDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
			return null;
		}
	}

	public boolean checkUsernameExist(String username) {
		String sql = "SELECT * FROM account " + "WHERE username = ?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, username);

			ResultSet rs = ps.executeQuery();
			if (rs.first()) {
				return true;
			}
			return false;
		} catch (SQLException ex) {
			Logger.getLogger(AccountDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
			return false;
		}
	}

	public static void main(String[] args) {
	}
}
