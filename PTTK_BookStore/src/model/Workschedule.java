package model;

import java.io.Serializable;
import java.util.List;

public class WorkSchedule implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String month;
    private String year;
    private Integer employeeWorkSchedules;
    private List<EmployeeWorkschedule> employeeWorkscheduleList;

    public WorkSchedule() {
    }

    public WorkSchedule(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Integer getEmployeeWorkSchedules() {
        return employeeWorkSchedules;
    }

    public void setEmployeeWorkSchedules(Integer employeeWorkSchedules) {
        this.employeeWorkSchedules = employeeWorkSchedules;
    }

    
    public List<EmployeeWorkschedule> getEmployeeWorkscheduleList() {
        return employeeWorkscheduleList;
    }

    public void setEmployeeWorkscheduleList(List<EmployeeWorkschedule> employeeWorkscheduleList) {
        this.employeeWorkscheduleList = employeeWorkscheduleList;
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
        if (!(object instanceof WorkSchedule)) {
            return false;
        }
        WorkSchedule other = (WorkSchedule) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Workschedule[ id=" + id + " ]";
    }
    
}
