
package model;

import java.io.Serializable;

public class ContactInfor implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String phoneNumber;
	private String email;

	private Address addressID;

	public ContactInfor() {
	}

	public ContactInfor(String email, String phoneNumber) {
		super();
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public ContactInfor(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddressID() {
		return addressID;
	}

	public void setAddressID(Address addressID) {
		this.addressID = addressID;
	}

}
