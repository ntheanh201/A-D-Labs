
package model;

import java.io.Serializable;
import java.util.Date;

public class Order1 implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Integer id;
    private String type;
    private Date date;
    private Onlineorder onlineorder;
    private Payment paymentID;
    private Onsiteorder onsiteorder;

    public Order1() {
    }

    public Order1(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Onlineorder getOnlineorder() {
        return onlineorder;
    }

    public void setOnlineorder(Onlineorder onlineorder) {
        this.onlineorder = onlineorder;
    }

    public Payment getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(Payment paymentID) {
        this.paymentID = paymentID;
    }

    public Onsiteorder getOnsiteorder() {
        return onsiteorder;
    }

    public void setOnsiteorder(Onsiteorder onsiteorder) {
        this.onsiteorder = onsiteorder;
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
        if (!(object instanceof Order1)) {
            return false;
        }
        Order1 other = (Order1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Order1[ id=" + id + " ]";
    }
    
}
