
package model;

import java.io.Serializable;

public class Orderline implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Integer id;
    private Integer quantity;
    private Integer cutomerID;
    private Item itemID;    
    private Onlineorder orderID;

    public Orderline() {
    }

    public Orderline(Integer id) {
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
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Orderline)) {
            return false;
        }
        Orderline other = (Orderline) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Orderline{" + "id=" + id + ", quantity=" + quantity + ", cutomerID=" + cutomerID + ", itemID=" + itemID + ", orderID=" + orderID + '}';
    }


    
}
