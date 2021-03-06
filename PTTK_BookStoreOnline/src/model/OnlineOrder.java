
package model;

import java.io.Serializable;

public class OnlineOrder implements Serializable {

	private static final long serialVersionUID = 1L;
	private String state;
	private int customerID;
	private Integer orderID;
	private Integer shippingID;
	private String paymentmethod;
	private ShippingAdd shippingAddressID;

	public OnlineOrder() {
	}

	public OnlineOrder(Integer orderID) {
		this.orderID = orderID;
	}

	public OnlineOrder(Integer orderID, int customerID) {
		this.orderID = orderID;
		this.customerID = customerID;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public Integer getOrderID() {
		return orderID;
	}

	public void setOrderID(Integer orderID) {
		this.orderID = orderID;
	}

	public Integer getShippingID() {
		return shippingID;
	}

	public void setShippingID(Integer shippingID) {
		this.shippingID = shippingID;
	}

	public String getPaymentmethod() {
		return paymentmethod;
	}

	public void setPaymentmethod(String paymentmethod) {
		this.paymentmethod = paymentmethod;
	}

	public ShippingAdd getShippingAddressID() {
		return shippingAddressID;
	}

	public void setShippingAddressID(ShippingAdd shippingAddressID) {
		this.shippingAddressID = shippingAddressID;
	}

	@Override
	public String toString() {
		return "OnlineOrder [state=" + state + ", customerID=" + customerID + ", orderID=" + orderID + ", shippingID="
				+ shippingID + ", paymentmethod=" + paymentmethod + ", shippingAddressID=" + shippingAddressID + "]";
	}

}
