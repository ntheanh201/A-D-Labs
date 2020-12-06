package model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;


public class Bookstorecard implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Integer id;
    private BigInteger point;
    private BigInteger usedPoint;
    private List<Customer> customerList;

    public Bookstorecard() {
    }

    public Bookstorecard(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigInteger getPoint() {
        return point;
    }

    public void setPoint(BigInteger point) {
        this.point = point;
    }

    public BigInteger getUsedPoint() {
        return usedPoint;
    }

    public void setUsedPoint(BigInteger usedPoint) {
        this.usedPoint = usedPoint;
    }

    
    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
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
        if (!(object instanceof Bookstorecard)) {
            return false;
        }
        Bookstorecard other = (Bookstorecard) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Bookstorecard[ id=" + id + " ]";
    }
    
}
