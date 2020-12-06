
package model;

import java.io.Serializable;
import java.util.List;


public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;
    
    
    
    private Integer personID;
    
    private List<Feedback> feedbackList;
    
    private List<Notification> notificationList;
    
    private Bookstorecard bookStoreCardID;
    
    private Cart cartID;
    
    private Membershiptype membershipTypeID;
    
    private Person person;
    
    private Wishlist wishlistID;

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

    
    public List<Feedback> getFeedbackList() {
        return feedbackList;
    }

    public void setFeedbackList(List<Feedback> feedbackList) {
        this.feedbackList = feedbackList;
    }

    
    public List<Notification> getNotificationList() {
        return notificationList;
    }

    public void setNotificationList(List<Notification> notificationList) {
        this.notificationList = notificationList;
    }

    public Bookstorecard getBookStoreCardID() {
        return bookStoreCardID;
    }

    public void setBookStoreCardID(Bookstorecard bookStoreCardID) {
        this.bookStoreCardID = bookStoreCardID;
    }

    public Cart getCartID() {
        return cartID;
    }

    public void setCartID(Cart cartID) {
        this.cartID = cartID;
    }

    public Membershiptype getMembershipTypeID() {
        return membershipTypeID;
    }

    public void setMembershipTypeID(Membershiptype membershipTypeID) {
        this.membershipTypeID = membershipTypeID;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Wishlist getWishlistID() {
        return wishlistID;
    }

    public void setWishlistID(Wishlist wishlistID) {
        this.wishlistID = wishlistID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (personID != null ? personID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customer)) {
            return false;
        }
        Customer other = (Customer) object;
        if ((this.personID == null && other.personID != null) || (this.personID != null && !this.personID.equals(other.personID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Customer[ personID=" + personID + " ]";
    }
    
}
