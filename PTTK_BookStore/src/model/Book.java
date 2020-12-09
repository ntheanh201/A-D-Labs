
package model;

import java.io.Serializable;

public class Book implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String name;
	private int publishYear;
	private int quantity;
	private float price;
	private Category category;
	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	private Author authorID;

	public Book() {
	}

	public Book(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPublishYear() {
		return publishYear;
	}

	public void setPublishYear(int publishYear) {
		this.publishYear = publishYear;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public float getPurchasePrice() {
		return price;
	}

	public void setPurchasePrice(float price) {
		this.price = price;
	}

	public Author getAuthorID() {
		return authorID;
	}

	public void setAuthorID(Author authorID) {
		this.authorID = authorID;
	}

}
