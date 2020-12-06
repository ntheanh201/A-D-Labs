
package model;

import java.io.Serializable;
import java.util.List;

public class Onsiteseller implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Integer personID;
    private Person person;
    private List<Onsiteorder> onsiteorderList;

    public Onsiteseller() {
    }

    public Onsiteseller(Integer personID) {
        this.personID = personID;
    }

    public Integer getPersonID() {
        return personID;
    }

    public void setPersonID(Integer personID) {
        this.personID = personID;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    
    public List<Onsiteorder> getOnsiteorderList() {
        return onsiteorderList;
    }

    public void setOnsiteorderList(List<Onsiteorder> onsiteorderList) {
        this.onsiteorderList = onsiteorderList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (personID != null ? personID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Onsiteseller)) {
            return false;
        }
        Onsiteseller other = (Onsiteseller) object;
        if ((this.personID == null && other.personID != null) || (this.personID != null && !this.personID.equals(other.personID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Onsiteseller[ personID=" + personID + " ]";
    }
    
}
