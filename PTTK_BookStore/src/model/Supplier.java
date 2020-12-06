
package model;

import java.io.Serializable;
import java.util.List;

public class Supplier implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Integer id;
    private String name;
    private List<Importingrecord> importingrecordList;

    public Supplier() {
    }

    public Supplier(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public List<Importingrecord> getImportingrecordList() {
        return importingrecordList;
    }

    public void setImportingrecordList(List<Importingrecord> importingrecordList) {
        this.importingrecordList = importingrecordList;
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
        if (!(object instanceof Supplier)) {
            return false;
        }
        Supplier other = (Supplier) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Supplier[ id=" + id + " ]";
    }
    
}
