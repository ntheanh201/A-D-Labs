package model;

import java.io.Serializable;
import java.util.Date;

public class Bill implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Integer id;
    
    private Integer payment;
    
    private Date date;
    private Onlinebill onlinebill;
    private Onsitebill onsitebill;

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

    public Onlinebill getOnlinebill() {
        return onlinebill;
    }

    public void setOnlinebill(Onlinebill onlinebill) {
        this.onlinebill = onlinebill;
    }

    public Onsitebill getOnsitebill() {
        return onsitebill;
    }

    public void setOnsitebill(Onsitebill onsitebill) {
        this.onsitebill = onsitebill;
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
        if (!(object instanceof Bill)) {
            return false;
        }
        Bill other = (Bill) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Bill[ id=" + id + " ]";
    }
    
}
