
package model;

import java.io.Serializable;

public class ShippingAdd implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String note;
	private Address addressID;
	private int personID;

	public ShippingAdd() {
	}

	public ShippingAdd(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Address getAddressID() {
		return addressID;
	}

	public void setAddressID(Address addressID) {
		this.addressID = addressID;
	}

	public int getPersonID() {
		return personID;
	}

	public void setPersonID(int personID) {
		this.personID = personID;
	}

	@Override
	public String toString() {
		return "ShippingAdd [id=" + id + ", note=" + note + ", addressID=" + addressID + "]";
	}

}
