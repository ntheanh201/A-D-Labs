
package model;

import java.io.Serializable;
import java.util.List;

public class ShippingAdd implements Serializable {

    private List<Onlineorder> onlineorderList;

    private static final long serialVersionUID = 1L;
    
    private Integer id;
    private String note;
    private Address addressID;

    public ShippingAdd() {
    }

    public ShippingAdd(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Address getAddressID() {
        return addressID;
    }

    public void setAddressID(Address addressID) {
        this.addressID = addressID;
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
        if (!(object instanceof ShippingAdd)) {
            return false;
        }
        ShippingAdd other = (ShippingAdd) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Shippingaddress{" + "onlineorderList=" + onlineorderList + ", id=" + id + ", note=" + note + ", addressID=" + addressID + '}';
    }



    
    public List<Onlineorder> getOnlineorderList() {
        return onlineorderList;
    }

    public void setOnlineorderList(List<Onlineorder> onlineorderList) {
        this.onlineorderList = onlineorderList;
    }
    
}
