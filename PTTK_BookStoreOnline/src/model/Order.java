
package model;

import java.io.Serializable;
import java.util.Date;

public class Order implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Integer id;
    private String type;
    private Date date;
    private OnlineOrder onlineorder;

    public Order() {
    }

    public Order(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public OnlineOrder getOnlineorder() {
        return onlineorder;
    }

    public void setOnlineorder(OnlineOrder onlineorder) {
        this.onlineorder = onlineorder;
    }

    @Override
    public String toString() {
        return "model.Order1[ id=" + id + " ]";
    }
    
}
