
package model;

import java.io.Serializable;
import java.util.Date;

public class Order implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Integer id;
    private String type;
    private Date date;
    private Onlineorder onlineorder;
    private Payment paymentID;

    public Order() {
    }

    public Order(Integer id) {
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

    @Override
    public String toString() {
        return "model.Order1[ id=" + id + " ]";
    }
    
}
