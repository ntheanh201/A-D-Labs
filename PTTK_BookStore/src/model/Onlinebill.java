
package model;

import java.io.Serializable;

public class Onlinebill implements Serializable {

    private static final long serialVersionUID = 1L;
    private String paymentState;
    private Integer billID;
    private Bill bill;
    private Onsiteorder onSiteOrderOrderID;

    public Onlinebill() {
    }

    public Onlinebill(Integer billID) {
        this.billID = billID;
    }

    public String getPaymentState() {
        return paymentState;
    }

    public void setPaymentState(String paymentState) {
        this.paymentState = paymentState;
    }

    public Integer getBillID() {
        return billID;
    }

    public void setBillID(Integer billID) {
        this.billID = billID;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public Onsiteorder getOnSiteOrderOrderID() {
        return onSiteOrderOrderID;
    }

    public void setOnSiteOrderOrderID(Onsiteorder onSiteOrderOrderID) {
        this.onSiteOrderOrderID = onSiteOrderOrderID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (billID != null ? billID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Onlinebill)) {
            return false;
        }
        Onlinebill other = (Onlinebill) object;
        if ((this.billID == null && other.billID != null) || (this.billID != null && !this.billID.equals(other.billID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Onlinebill[ billID=" + billID + " ]";
    }
    
}
