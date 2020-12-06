
package model;

import java.io.Serializable;

public class Onlineseller implements Serializable {

    private static final long serialVersionUID = 1L;
    
    
    
    private Integer personID;
    
    private Onlineorder onlineOrderOrderID;
    
    private Person person;

    public Onlineseller() {
    }

    public Onlineseller(Integer personID) {
        this.personID = personID;
    }

    public Integer getPersonID() {
        return personID;
    }

    public void setPersonID(Integer personID) {
        this.personID = personID;
    }

    public Onlineorder getOnlineOrderOrderID() {
        return onlineOrderOrderID;
    }

    public void setOnlineOrderOrderID(Onlineorder onlineOrderOrderID) {
        this.onlineOrderOrderID = onlineOrderOrderID;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
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
        if (!(object instanceof Onlineseller)) {
            return false;
        }
        Onlineseller other = (Onlineseller) object;
        if ((this.personID == null && other.personID != null) || (this.personID != null && !this.personID.equals(other.personID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Onlineseller[ personID=" + personID + " ]";
    }
    
}
