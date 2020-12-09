
package controller;

import model.Cart;

public interface CartDAO extends BaseDAO<Object> {
	Cart findCartByCustomer(String customerId);

	void addNewItemToCart(int ItemID, int CartID);
}
