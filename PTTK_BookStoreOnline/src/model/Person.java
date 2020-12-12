package model;

import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String dateOfBirth;
	private String gender;
	private Employee employee;
	private Account accountID;
	private ContactInfor contactInforID;

	private FullName fullNameID;
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

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
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

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", dateOfBirth=" + dateOfBirth + ", gender=" + gender + ", employee=" + employee
				+ ", accountID=" + accountID + ", contactInforID=" + contactInforID + ", fullNameID=" + fullNameID
				+ ", customer=" + customer + "]";
	}
}
