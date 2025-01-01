package application;

import java.io.Serializable;
import java.util.ArrayList;

public class Customer extends Member implements Serializable{
	
	private String customerID;
	private String cardType;
	private ArrayList <Order> orders = new ArrayList<>();
	
	
	public Customer(String name, int age, String phone , String cardType) {
		super(name, age, phone);
		this.cardType = cardType;
	}
	
	public Customer() {
		
	}
	
	public void addOrder() {
		
	}
	
	public void cancelOrder() {
		
	}
	
	public void orderHistory() {
		
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public ArrayList<Order> getOrders() {
		return orders;
	}

	public void setOrders(ArrayList<Order> orders) {
		this.orders = orders;
	}
	
	
	
	
	
	

}
