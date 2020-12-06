package model;

import java.io.Serializable;
import javax.persistence.Basic;

public class Person implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Integer id;
    private String dateOfBirth;
    private String gender;
    private String idCard;
    private Seller seller;
    private Employee employee;
    private Customercarestaff customercarestaff;
    private Onsiteseller onsiteseller;
    private Importingstaff importingstaff;
    private Manager manager;
    private Account accountID;
    private Contactinfor contactInforID;
    
    private Fullname fullNameID;
    private Onlineseller onlineseller;
    private Customer customer;

    public Person() {
    }

    public Person(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Customercarestaff getCustomercarestaff() {
        return customercarestaff;
    }

    public void setCustomercarestaff(Customercarestaff customercarestaff) {
        this.customercarestaff = customercarestaff;
    }

    public Onsiteseller getOnsiteseller() {
        return onsiteseller;
    }

    public void setOnsiteseller(Onsiteseller onsiteseller) {
        this.onsiteseller = onsiteseller;
    }

    public Importingstaff getImportingstaff() {
        return importingstaff;
    }

    public void setImportingstaff(Importingstaff importingstaff) {
        this.importingstaff = importingstaff;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Account getAccountID() {
        return accountID;
    }

    public void setAccountID(Account accountID) {
        this.accountID = accountID;
    }

    public Contactinfor getContactInforID() {
        return contactInforID;
    }

    public void setContactInforID(Contactinfor contactInforID) {
        this.contactInforID = contactInforID;
    }

    public Fullname getFullNameID() {
        return fullNameID;
    }

    public void setFullNameID(Fullname fullNameID) {
        this.fullNameID = fullNameID;
    }

    public Onlineseller getOnlineseller() {
        return onlineseller;
    }

    public void setOnlineseller(Onlineseller onlineseller) {
        this.onlineseller = onlineseller;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
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
        if (!(object instanceof Person)) {
            return false;
        }
        Person other = (Person) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", dateOfBirth=" + dateOfBirth + ", gender=" + gender + ", idCard=" + idCard + ", seller=" + seller + ", employee=" + employee + ", customercarestaff=" + customercarestaff + ", onsiteseller=" + onsiteseller + ", importingstaff=" + importingstaff + ", manager=" + manager + ", accountID=" + accountID + ", contactInforID=" + contactInforID + ", fullNameID=" + fullNameID + ", onlineseller=" + onlineseller + ", customer=" + customer + '}';
    }

    
    
}
