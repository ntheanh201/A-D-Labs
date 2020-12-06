
package model;

import java.io.Serializable;
import java.util.Date;

public class Importingrecord implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Integer id;
    private Date date;    
    private Book bookID;    
    private Importingstaff importingStaffPersonID;
    
    private Supplier supplierID;

    public Importingrecord() {
    }

    public Importingrecord(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Book getBookID() {
        return bookID;
    }

    public void setBookID(Book bookID) {
        this.bookID = bookID;
    }

    public Importingstaff getImportingStaffPersonID() {
        return importingStaffPersonID;
    }

    public void setImportingStaffPersonID(Importingstaff importingStaffPersonID) {
        this.importingStaffPersonID = importingStaffPersonID;
    }

    public Supplier getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(Supplier supplierID) {
        this.supplierID = supplierID;
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
        if (!(object instanceof Importingrecord)) {
            return false;
        }
        Importingrecord other = (Importingrecord) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Importingrecord[ id=" + id + " ]";
    }
    
}
