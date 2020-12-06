package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class ConnectDB {
	public static Connection getJDBCconnection(){
		final String url = "jdbc:mysql://localhost:3306/pet_shop";
		final String user = "root";
		final String password = "root";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			return (Connection) DriverManager.getConnection(url,user,password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
		
	}
	public static void main(String[] args) {
		Connection connection = getJDBCconnection();		
		if(connection != null){
			System.out.println("connect sucessful");
		}else{
			System.out.println("dont connect database");
		}
	}
}
