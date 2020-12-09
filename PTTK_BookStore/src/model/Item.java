
package model;

import java.io.Serializable;
import java.math.BigInteger;

public class Item implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private BigInteger salePrice;
	private String description;
	private Integer books;
	private String url;

	public Item() {
	}

	public Item(Integer id) {
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

	public BigInteger getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(BigInteger salePrice) {
		this.salePrice = salePrice;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getBooks() {
		return books;
	}

	public void setBooks(Integer books) {
		this.books = books;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
