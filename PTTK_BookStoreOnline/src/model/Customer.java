package model;

import java.io.Serializable;

public class Customer implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer personID;

	private Cart cartID;

	private Person person;

	public Customer() {
	}

	public Customer(Integer personID) {
		this.personID = personID;
	}

	public Integer getPersonID() {
		return personID;
	}

	public void setPersonID(Integer personID) {
		this.personID = personID;
	}

	public Cart getCartID() {
		return cartID;
	}

	public void setCartID(Cart cartID) {
		this.cartID = cartID;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}
