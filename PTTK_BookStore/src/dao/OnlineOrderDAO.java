
package dao;

import com.mysql.cj.x.protobuf.MysqlxCrud.Order;

import model.Item;
import model.Onlineorder;

import java.util.List;


public interface OnlineOrderDAO extends BaseDAO<Onlineorder>{
    int addItemsToOrder(List<Item> items, int orderID);
}
