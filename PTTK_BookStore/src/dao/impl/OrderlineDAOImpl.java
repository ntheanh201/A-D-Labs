
package dao.impl;

import static dao.BaseDAO.con;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import dao.ItemDAOImpl;
import dao.OrderlineDAO;
import model.Onlineorder;
import model.Orderline;


public class OrderlineDAOImpl implements OrderlineDAO{

    @Override
    public List<Orderline> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Orderline get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Orderline> getOrderLinesByOrderId(int orderID) {
        List<Orderline> list = new ArrayList<>();
        ItemDAOImpl aOImpl = new ItemDAOImpl();
        String sql = "Select * from book_store.orderline where OrderID = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, orderID);
            ResultSet rs = ps.executeQuery();
            //rs.first();
            while (rs.next()) {
                Orderline o = new Orderline();
                o.setId(rs.getInt("ID"));
                o.setItemID(aOImpl.get(rs.getInt("ItemID")));
                o.setOrderID(new Onlineorder(orderID));
                o.setQuantity(rs.getInt("Quantity"));
                System.out.println(o);
                list.add(o);
            }

        } catch (SQLException ex) {
            Logger.getLogger(OrderlineDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    @Override
    public int save(Orderline t) {
        System.out.println(t);
        String sql = "INSERT INTO book_store.orderline (orderID, itemID)"
                + " VALUES(?,?);";
        int key = -1;
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, t.getOrderID().getOrderID());
            ps.setInt(2, t.getItemID().getId());

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
        return key;}

    @Override
    public void update(Orderline t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Orderline t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void main(String[] args) {
        System.out.println(new OrderlineDAOImpl().getOrderLinesByOrderId(1));
    }
}
