
package model;

import java.io.Serializable;

public class Onlineorder implements Serializable {

    private static final long serialVersionUID = 1L;
    private String state;
    private int customerID;
    private Integer orderID;
    private Integer shippingID;
    private String paymentmethod;
    private Shippingaddress shippingAddressID;    
    private Voucher voucherID;

    public Onlineorder() {
    }

    public Onlineorder(Integer orderID) {
        this.orderID = orderID;
    }

    public Onlineorder(Integer orderID, int customerID) {
        this.orderID = orderID;
        this.customerID = customerID;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public Integer getOrderID() {
        return orderID;
    }

    public void setOrderID(Integer orderID) {
        this.orderID = orderID;
    }

    public Integer getShippingID() {
        return shippingID;
    }

    public void setShippingID(Integer shippingID) {
        this.shippingID = shippingID;
    }

    public String getPaymentmethod() {
        return paymentmethod;
    }

    public void setPaymentmethod(String paymentmethod) {
        this.paymentmethod = paymentmethod;
    }

    public Shippingaddress getShippingAddressID() {
        return shippingAddressID;
    }

    public void setShippingAddressID(Shippingaddress shippingAddressID) {
        this.shippingAddressID = shippingAddressID;
    }

    public Voucher getVoucherID() {
        return voucherID;
    }

    public void setVoucherID(Voucher voucherID) {
        this.voucherID = voucherID;
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
        if (!(object instanceof Onlineorder)) {
            return false;
        }
        Onlineorder other = (Onlineorder) object;
        if ((this.orderID == null && other.orderID != null) || (this.orderID != null && !this.orderID.equals(other.orderID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Onlineorder{" + "state=" + state + ", customerID=" + customerID + ", orderID=" + orderID + ", shippingID=" + shippingID + ", paymentmethod=" + paymentmethod + ", shippingAddressID=" + shippingAddressID + ", voucherID=" + voucherID + '}';
    }


    
}
