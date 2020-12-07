
package model;

import java.io.Serializable;
import java.util.List;


public class Cart implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Integer id;
    
    private Integer items;
    
    private Item itemID;
    
    private List<Onlineorder> onlineorderList;
    
    private List<Item> itemList;
    
    private List<OrderDetail> orderlineList;
    
    private List<Customer> customerList;

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

    
    public List<Onlineorder> getOnlineorderList() {
        return onlineorderList;
    }

    public void setOnlineorderList(List<Onlineorder> onlineorderList) {
        this.onlineorderList = onlineorderList;
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

    
    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cart)) {
            return false;
        }
        Cart other = (Cart) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Cart[ id=" + id + " ]";
    }

    public Item getItemID() {
        return itemID;
    }

    public void setItemID(Item itemID) {
        this.itemID = itemID;
    }
    
}
