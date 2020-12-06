package controller.dao;

import java.math.BigInteger;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Vector;

import model.Timekeeper;

public class DAOTimeKeeper extends IDAO<Timekeeper> {
	public DAOTimeKeeper(Connection conn) {
		this.conn = conn;
		try {
			this.statement = this.conn.createStatement();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public Timekeeper[] selectAll() {
		Vector<Timekeeper> ee = new Vector<Timekeeper>();
		Timekeeper[] result;
		try {
			String sql = "Select * from TIMEKEEPER";

			rs = statement.executeQuery(sql);
			int i = 0;
			while (rs.next()) {
				Timekeeper e = new Timekeeper(
						rs.getString(1), 
						rs.getDate(2),
						BigInteger.valueOf(rs.getInt(3)),
						rs.getString(4));
				ee.add(e);

				i++;
			}
			result = new Timekeeper[i];
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

		return ee.toArray(result);
	}

	@Override
	public Timekeeper[] selectByName(String name) {
		Vector<Timekeeper> ee = new Vector<Timekeeper>();
		Timekeeper[] result;
		try {
			String sql = "Select * from TIMEKEEPER where Date_Time='" + name+"'" ;

			rs = statement.executeQuery(sql);
			int i = 0;
			while (rs.next()) {
				Timekeeper e = new Timekeeper(
						rs.getString(1), 
						rs.getDate(2),
						BigInteger.valueOf(rs.getInt(3)),
						rs.getString(4));
				ee.add(e);

				i++;
			}
			result = new Timekeeper[i];
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

		return ee.toArray(result);
	}

	@Override
	public int insert(Timekeeper e) {
		String sql = "INSERT INTO TIMEKEEPER (Timekeeper_Id,"+
				"Date_Time,"+
				"In_Out,"+
				"EMP_ID)"+
				"VALUES (?,?,?,?)";
		try {
			this.preStatement = this.conn.prepareStatement(sql);
			this.preStatement.setString(1, e.getTimekeeper_Id());
			this.preStatement.setDate(2, new java.sql.Date(e.getDate_Time().getTime()));
			this.preStatement.setString(3, e.getIn_Out());
			this.preStatement.setLong(4, e.getEmpId().longValue());
			int rowCount=this.preStatement.executeUpdate();
			
			return rowCount;
		} catch (SQLException e1) {
			e1.printStackTrace();
			return 0;
			
		}
		
	}

	@Override
	public int update(Timekeeper e) {
		String sql = "UPDATE TIMEKEEPER set "+
				"Date_Time = ?,"+
				"In_Out = ?,"+
				"EMP_ID = ? "+
				"Where Timekeeper_Id = ?";
		try {
			this.preStatement = this.conn.prepareStatement(sql);
			this.preStatement.setDate(1, new java.sql.Date(e.getDate_Time().getTime()));
			this.preStatement.setString(2, e.getIn_Out());
			this.preStatement.setLong(3, e.getEmpId().longValue());
			this.preStatement.setString(4, e.getTimekeeper_Id());
			
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
