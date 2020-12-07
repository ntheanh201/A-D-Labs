package model;

import java.io.Serializable;
import java.util.Date;

public class Bill implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Integer id;
    
    private Integer payment;
    
    private Date date;

    public Bill() {
    }

    public Bill(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPayment() {
        return payment;
    }

    public void setPayment(Integer payment) {
        this.payment = payment;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "model.Bill[ id=" + id + " ]";
    }
    
}
