
package model;

import java.io.Serializable;
import java.util.Date;

public class ImportingRecord implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Integer id;
    private Date date;    
    private Book bookID;    
    
    private Supplier supplierID;

    public ImportingRecord() {
    }

    public ImportingRecord(Integer id) {
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

    public Supplier getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(Supplier supplierID) {
        this.supplierID = supplierID;
    }

    @Override
    public String toString() {
        return "model.Importingrecord[ id=" + id + " ]";
    }
    
}
