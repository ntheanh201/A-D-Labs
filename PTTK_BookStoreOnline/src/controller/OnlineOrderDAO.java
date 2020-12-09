
package controller;

import model.Item;
import model.OnlineOrder;

import java.util.List;

public interface OnlineOrderDAO extends BaseDAO<OnlineOrder> {
	int addItemsToOrder(List<Item> items, int orderID);
}
