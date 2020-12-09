
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnection {

	private static Connection connect = null;

	public static Connection connect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException ex) {
			try {
				throw new Exception("Invalid Driver!!Please check this drver....");
			} catch (Exception ex1) {
				Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex1);
			}
		}
		if (connect == null) {
			String url = "jdbc:mysql://localhost:3306/book_store";
			try {
				connect = DriverManager.getConnection(url, "root", "root");
			} catch (SQLException e) {
				try {
					throw new Exception(e.getMessage() + "Connect failed to database ....");
				} catch (Exception ex) {
					Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
				}
			}
		}
		return connect;
	}

	public static void main(String[] args) {
		System.out.println(DBConnection.connect());
	}
}
