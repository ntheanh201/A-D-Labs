
package model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;

public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;
    private String position;
    private BigInteger salary;
    private Date startDate;
    private Integer personID;
    private Branchstore branchStoreID;
    private Person person;
    
    private List<EmployeeWorkschedule> employeeWorkscheduleList;
    
    private List<Allowance> allowanceList;

    public Employee() {
    }

    public Employee(Integer personID) {
        this.personID = personID;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public BigInteger getSalary() {
        return salary;
    }

    public void setSalary(BigInteger salary) {
        this.salary = salary;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Integer getPersonID() {
        return personID;
    }

    public void setPersonID(Integer personID) {
        this.personID = personID;
    }

    public Branchstore getBranchStoreID() {
        return branchStoreID;
    }

    public void setBranchStoreID(Branchstore branchStoreID) {
        this.branchStoreID = branchStoreID;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    
    public List<EmployeeWorkschedule> getEmployeeWorkscheduleList() {
        return employeeWorkscheduleList;
    }

    public void setEmployeeWorkscheduleList(List<EmployeeWorkschedule> employeeWorkscheduleList) {
        this.employeeWorkscheduleList = employeeWorkscheduleList;
    }

    
    public List<Allowance> getAllowanceList() {
        return allowanceList;
    }

    public void setAllowanceList(List<Allowance> allowanceList) {
        this.allowanceList = allowanceList;
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
        if (!(object instanceof Employee)) {
            return false;
        }
        Employee other = (Employee) object;
        if ((this.personID == null && other.personID != null) || (this.personID != null && !this.personID.equals(other.personID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Employee[ personID=" + personID + " ]";
    }
    
}
