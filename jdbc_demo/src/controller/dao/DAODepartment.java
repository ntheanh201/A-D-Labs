package controller.dao;

import java.math.BigInteger;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Vector;

import model.Department;

public class DAODepartment extends IDAO<Department> {
	public DAODepartment(Connection conn) {
		this.conn = conn;
		try {
			this.statement = this.conn.createStatement();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public Department[] selectAll() {
		Vector<Department> ee = new Vector<Department>();
		Department[] result;
		try {
			String sql = "Select * from DEPARTMENT";

			rs = statement.executeQuery(sql);
			int i = 0;
			while (rs.next()) {
				Department e = new Department(
						rs.getInt(1), 
						rs.getString(2),
						rs.getString(3),
						rs.getString(4));
				ee.add(e);

				i++;
			}
			result = new Department[i];
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

		return ee.toArray(result);
	}

	@Override
	public Department[] selectByName(String name) {
		Vector<Department> ee = new Vector<Department>();
		Department[] result;
		try {
			String sql = "Select * from DEPARTMENT where DEPT_NAME='" + name+"'" ;

			rs = statement.executeQuery(sql);
			int i = 0;
			while (rs.next()) {
				Department e = new Department(
						rs.getInt(1), 
						rs.getString(2),
						rs.getString(3),
						rs.getString(4));
				ee.add(e);

				i++;
			}
			result = new Department[i];
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

		return ee.toArray(result);
	}

	@Override
	public int insert(Department e) {
		String sql = "INSERT INTO DEPARTMENT (DEPT_ID,"+
				"DEPT_NAME,"+
				"DEPT_NO,"+
				"LOCATION)"+
				"VALUES (?,?,?,?)";
		try {
			this.preStatement = this.conn.prepareStatement(sql);
			this.preStatement.setInt(1, e.getDeptId());
			this.preStatement.setString(2, e.getDeptName());
			this.preStatement.setString(3, e.getDeptNo());
			this.preStatement.setString(4, e.getLocation());
			int rowCount=this.preStatement.executeUpdate();
			
			return rowCount;
		} catch (SQLException e1) {
			e1.printStackTrace();
			return 0;
			
		}
		
	}

	@Override
	public int update(Department e) {
		String sql = "UPDATE DEPARTMENT set "+
				"DEPT_NAME = ?,"+
				"DEPT_NO = ?,"+
				"LOCATION= ? "+
				"Where DEPT_ID = ?";
		try {
			this.preStatement = this.conn.prepareStatement(sql);
			this.preStatement.setString(1, e.getDeptName());
			this.preStatement.setString(2, e.getDeptNo());
			this.preStatement.setString(3, e.getLocation());
			this.preStatement.setInt(4, e.getDeptId());

			int rowCount=this.preStatement.executeUpdate();
			
			return rowCount;
		} catch (SQLException e1) {
			e1.printStackTrace();
			return 0;
			
		}
	}

	@Override
	public void closeConnection() {
		try {
			this.conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	

}
