
package model;

import java.io.Serializable;
import java.util.List;

public class Shipping implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Integer id;
    private String region;
    private String cost;
    private Integer delayDate;
    private List<Onlineorder> onlineorderList;

    public Shipping() {
    }

    public Shipping(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public Integer getDelayDate() {
        return delayDate;
    }

    public void setDelayDate(Integer delayDate) {
        this.delayDate = delayDate;
    }

    
    public List<Onlineorder> getOnlineorderList() {
        return onlineorderList;
    }

    public void setOnlineorderList(List<Onlineorder> onlineorderList) {
        this.onlineorderList = onlineorderList;
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
        if (!(object instanceof Shipping)) {
            return false;
        }
        Shipping other = (Shipping) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Shipping[ id=" + id + " ]";
    }
    
}
