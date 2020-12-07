
package model;

import java.io.Serializable;
import java.util.Date;


public class EmployeeWorkschedule implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Integer id;
    private String shift;
    private Date date;
    private Employee employeePersonID;
    
    private WorkSchedule workScheduleID;

    public EmployeeWorkschedule() {
    }

    public EmployeeWorkschedule(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Employee getEmployeePersonID() {
        return employeePersonID;
    }

    public void setEmployeePersonID(Employee employeePersonID) {
        this.employeePersonID = employeePersonID;
    }

    public WorkSchedule getWorkScheduleID() {
        return workScheduleID;
    }

    public void setWorkScheduleID(WorkSchedule workScheduleID) {
        this.workScheduleID = workScheduleID;
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
        if (!(object instanceof EmployeeWorkschedule)) {
            return false;
        }
        EmployeeWorkschedule other = (EmployeeWorkschedule) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.EmployeeWorkschedule[ id=" + id + " ]";
    }
    
}
