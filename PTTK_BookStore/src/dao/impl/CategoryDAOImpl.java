
package dao.impl;

import static dao.BaseDAO.con;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import dao.CategoryDAO;
import model.Category;


public class CategoryDAOImpl implements CategoryDAO{

	@Override
	public List<Category> getAll() {
		String sql = "SELECT * FROM category";
		List<Category> categories = new ArrayList<Category>();
        try {
        	PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
        	while(rs.next()){
        		Category category = new Category();
        		category.setId(rs.getInt("id"));
        		category.setName(rs.getString("Name"));
        		category.setDescription(rs.getString("Description"));
				
				categories.add(category);
			}
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return categories;
	}

	@Override
	public Category get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Category t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void update(Category t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Category t) {
		// TODO Auto-generated method stub
		
	}

    
    
}
