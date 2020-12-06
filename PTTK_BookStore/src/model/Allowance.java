
package model;

import java.io.Serializable;
import java.math.BigInteger;

public class Allowance implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Integer id;
    
    private String name;
    
    private BigInteger amount;
    
    private String description;
    
    private Employee employeePersonID;

    public Allowance() {
    }

    public Allowance(Integer id) {
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

    public BigInteger getAmount() {
        return amount;
    }

    public void setAmount(BigInteger amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Employee getEmployeePersonID() {
        return employeePersonID;
    }

    public void setEmployeePersonID(Employee employeePersonID) {
        this.employeePersonID = employeePersonID;
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
        if (!(object instanceof Allowance)) {
            return false;
        }
        Allowance other = (Allowance) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Allowance[ id=" + id + " ]";
    }
    
}
