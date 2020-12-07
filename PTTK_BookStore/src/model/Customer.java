package model;

import java.io.Serializable;
import java.util.List;


public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Integer personID;
    
    private List<Feedback> feedbackList;
    
    private List<Notification> notificationList;
        
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

    @Override
    public String toString() {
        return "model.Customer[ personID=" + personID + " ]";
    }
    
}
