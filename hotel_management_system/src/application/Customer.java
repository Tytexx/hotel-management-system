package application;

import java.util.ArrayList;

public class Customer extends Member{
	
	private String customerID;
	private String cardType;
	private ArrayList <Order> orders = new ArrayList<>();
	
	
	public Customer(String name, int age, String phone, String customerID, String cardType) {
		super(name, age, phone);
		this.customerID = customerID;
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
	
	
	
	

}
