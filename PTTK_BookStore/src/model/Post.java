
package model;

import java.io.Serializable;
import java.util.Date;

public class Post implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Integer id;
    private String title;
    private String content;
    private Date date;
    private String authorName;    
    private Customercarestaff customerCareStaffPersonID;

    public Post() {
    }

    public Post(Integer id) {
        this.id = id;
    }

    public Post(Integer id, String authorName) {
        this.id = id;
        this.authorName = authorName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Customercarestaff getCustomerCareStaffPersonID() {
        return customerCareStaffPersonID;
    }

    public void setCustomerCareStaffPersonID(Customercarestaff customerCareStaffPersonID) {
        this.customerCareStaffPersonID = customerCareStaffPersonID;
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
        if (!(object instanceof Post)) {
            return false;
        }
        Post other = (Post) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Post[ id=" + id + " ]";
    }
    
}
