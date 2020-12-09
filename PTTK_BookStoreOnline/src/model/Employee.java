
package model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;
    private String position;
    private BigInteger salary;
    private Date startDate;
    private Integer personID;
    private Person person;

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

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    
}
