
package model;

import java.io.Serializable;
import java.util.List;

public class Importingstaff implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Integer personID;
    private List<Importingrecord> importingrecordList;
    
    private Person person;

    public Importingstaff() {
    }

    public Importingstaff(Integer personID) {
        this.personID = personID;
    }

    public Integer getPersonID() {
        return personID;
    }

    public void setPersonID(Integer personID) {
        this.personID = personID;
    }

    
    public List<Importingrecord> getImportingrecordList() {
        return importingrecordList;
    }

    public void setImportingrecordList(List<Importingrecord> importingrecordList) {
        this.importingrecordList = importingrecordList;
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
        if (!(object instanceof Importingstaff)) {
            return false;
        }
        Importingstaff other = (Importingstaff) object;
        if ((this.personID == null && other.personID != null) || (this.personID != null && !this.personID.equals(other.personID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Importingstaff[ personID=" + personID + " ]";
    }
    
}
