package model;

import java.io.Serializable;

public class Person implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Integer id;
    private String dateOfBirth;
    private String gender;
    private String idCard;
    private Seller seller;
    private Employee employee;
    private Manager manager;
    private Account accountID;
    private ContactInfor contactInforID;
    
    private FullName fullNameID;
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

    public ContactInfor getContactInforID() {
        return contactInforID;
    }

    public void setContactInforID(ContactInfor contactInforID) {
        this.contactInforID = contactInforID;
    }

    public FullName getFullNameID() {
        return fullNameID;
    }

    public void setFullNameID(FullName fullNameID) {
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
    public String toString() {
        return "Person{" + "id=" + id + ", dateOfBirth=" + dateOfBirth + ", gender=" + gender + ", idCard=" + idCard + ", seller=" + seller + ", employee=" + employee + ", manager=" + manager + ", accountID=" + accountID + ", contactInforID=" + contactInforID + ", fullNameID=" + fullNameID + ", onlineseller=" + onlineseller + ", customer=" + customer + '}';
    }

    
    
}
