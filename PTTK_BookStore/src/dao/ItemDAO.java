
package dao;

import java.util.List;

import model.Item;


public interface ItemDAO extends BaseDAO<Item> {

    List<Item> findItemInCart(int customerId);

    List<Item> findAll();

    List<Item> getItemByName(String name);
}
