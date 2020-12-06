
package model;

import java.io.Serializable;
import java.util.List;

public class Onsiteorder implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Integer orderID;
    private List<Onlinebill> onlinebillList;    
    private Onsiteseller onSiteSellerPersonID;
    private Order1 order1;
    private List<Onsitebill> onsitebillList;
    private List<Orderline> orderlineList;

    public Onsiteorder() {
    }

    public Onsiteorder(Integer orderID) {
        this.orderID = orderID;
    }

    public Integer getOrderID() {
        return orderID;
    }

    public void setOrderID(Integer orderID) {
        this.orderID = orderID;
    }

    
    public List<Onlinebill> getOnlinebillList() {
        return onlinebillList;
    }

    public void setOnlinebillList(List<Onlinebill> onlinebillList) {
        this.onlinebillList = onlinebillList;
    }

    public Onsiteseller getOnSiteSellerPersonID() {
        return onSiteSellerPersonID;
    }

    public void setOnSiteSellerPersonID(Onsiteseller onSiteSellerPersonID) {
        this.onSiteSellerPersonID = onSiteSellerPersonID;
    }

    public Order1 getOrder1() {
        return order1;
    }

    public void setOrder1(Order1 order1) {
        this.order1 = order1;
    }

    
    public List<Onsitebill> getOnsitebillList() {
        return onsitebillList;
    }

    public void setOnsitebillList(List<Onsitebill> onsitebillList) {
        this.onsitebillList = onsitebillList;
    }

    
    public List<Orderline> getOrderlineList() {
        return orderlineList;
    }

    public void setOrderlineList(List<Orderline> orderlineList) {
        this.orderlineList = orderlineList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderID != null ? orderID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Onsiteorder)) {
            return false;
        }
        Onsiteorder other = (Onsiteorder) object;
        if ((this.orderID == null && other.orderID != null) || (this.orderID != null && !this.orderID.equals(other.orderID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Onsiteorder[ orderID=" + orderID + " ]";
    }
    
}
