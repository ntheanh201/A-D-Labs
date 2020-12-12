
package model;

import java.io.Serializable;

public class Address implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String street;
	private String district;
	private String city;
	private String description;

	public Address() {
	}

	public Address(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", district=" + district + ", city=" + city
				+ ", description=" + description + "]";
	}

}
