
package model;

import java.io.Serializable;

public class OrderDetail implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Integer id;
    private Integer quantity;
    private Integer cutomerID;
    private Item itemID;    
    private Onlineorder orderID;

    public OrderDetail() {
    }

    public OrderDetail(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getCutomerID() {
        return cutomerID;
    }

    public void setCutomerID(Integer cutomerID) {
        this.cutomerID = cutomerID;
    }

    public Item getItemID() {
        return itemID;
    }

    public void setItemID(Item itemID) {
        this.itemID = itemID;
    }

    public Onlineorder getOrderID() {
        return orderID;
    }

    public void setOrderID(Onlineorder orderID) {
        this.orderID = orderID;
    }
    
    @Override
    public String toString() {
        return "OrderDetail{" + "id=" + id + ", quantity=" + quantity + ", cutomerID=" + cutomerID + ", itemID=" + itemID + ", orderID=" + orderID + '}';
    }


    
}
