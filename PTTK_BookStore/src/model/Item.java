
package model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;

public class Item implements Serializable {

    private List<Cart> cartList;
    private List<Orderline> orderlineList;

    private static final long serialVersionUID = 1L;
    private Integer id;
    private String name;
    private BigInteger salePrice;
    private String description;
    private Integer promotions;
    private Integer feedbacks;
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

    public Integer getPromotions() {
        return promotions;
    }

    public void setPromotions(Integer promotions) {
        this.promotions = promotions;
    }

    public Integer getFeedbacks() {
        return feedbacks;
    }

    public void setFeedbacks(Integer feedbacks) {
        this.feedbacks = feedbacks;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Item)) {
            return false;
        }
        Item other = (Item) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Item[ id=" + id + " ]";
    }

    public List<Cart> getCartList() {
        return cartList;
    }

    public void setCartList(List<Cart> cartList) {
        this.cartList = cartList;
    }

    public List<Orderline> getOrderlineList() {
        return orderlineList;
    }

    public void setOrderlineList(List<Orderline> orderlineList) {
        this.orderlineList = orderlineList;
    }
    
}
