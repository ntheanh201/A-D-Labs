
package model;

import java.io.Serializable;
import java.util.List;

public class Cart implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer items;
	private Item itemID;
	private List<Item> itemList;
	private List<OrderDetail> orderlineList;

	public Cart() {
	}

	public Cart(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getItems() {
		return items;
	}

	public void setItems(Integer items) {
		this.items = items;
	}

	public List<Item> getItemList() {
		return itemList;
	}

	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}

	public List<OrderDetail> getOrderlineList() {
		return orderlineList;
	}

	public void setOrderlineList(List<OrderDetail> orderlineList) {
		this.orderlineList = orderlineList;
	}

	public Item getItemID() {
		return itemID;
	}

	public void setItemID(Item itemID) {
		this.itemID = itemID;
	}

}
