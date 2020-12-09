
package controller.impl;

import static controller.BaseDAO.con;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import controller.AddressDAO;
import model.Address;


public class AddressDAOImpl implements AddressDAO{

    @Override
    public List<Address> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Address get(int id) {
    	String sql = "SELECT * FROM address WHERE ID = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            Address item = new Address();

            while (rs.next()) {
                item.setId(rs.getInt("ID"));
                item.setCity(rs.getString("City"));
                item.setDistrict(rs.getString("District"));
                item.setHouseNumber(rs.getString("HouseNumber"));
                item.setDescription(rs.getString("Description"));
            }
            return item;
        } catch (SQLException ex) {
            return null;
        }
    }

    @Override
    public int save(Address t) {
        String sql = "INSERT INTO book_store.address (city, district, town, description)"
                + "VALUES(?,?,?,?);";
        int key = -1;
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, t.getCity());
            ps.setString(2, t.getDistrict());
            ps.setString(3, t.getHouseNumber());
            ps.setString(4, t.getDescription());

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
    public void update(Address t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Address t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
