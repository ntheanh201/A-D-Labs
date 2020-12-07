
package model;

import java.io.Serializable;
import java.util.List;

public class Address implements Serializable {

    private List<Shippingaddress> shippingaddressList;

    private static final long serialVersionUID = 1L;
   
    private Integer id;
    
    private String city;
    
    private String district;
    
    private String town;
    
    private String description;
    
    private List<BranchStore> branchstoreList;
    
    private List<ContactInfor> contactinforList;

    public Address() {
    }

    public Address(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<BranchStore> getBranchstoreList() {
        return branchstoreList;
    }

    public void setBranchstoreList(List<BranchStore> branchstoreList) {
        this.branchstoreList = branchstoreList;
    }

    public List<ContactInfor> getContactinforList() {
        return contactinforList;
    }

    public void setContactinforList(List<ContactInfor> contactinforList) {
        this.contactinforList = contactinforList;
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
        if (!(object instanceof Address)) {
            return false;
        }
        Address other = (Address) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Address{" + "shippingaddressList=" + shippingaddressList + ", id=" + id + ", city=" + city + ", district=" + district + ", town=" + town + ", description=" + description + ", branchstoreList=" + branchstoreList + ", contactinforList=" + contactinforList + '}';
    }


    public List<Shippingaddress> getShippingaddressList() {
        return shippingaddressList;
    }

    public void setShippingaddressList(List<Shippingaddress> shippingaddressList) {
        this.shippingaddressList = shippingaddressList;
    }
    
}
