package application;

public class Customer extends Member{
	
	private String customerID;
	private String cardType;
	
	
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
