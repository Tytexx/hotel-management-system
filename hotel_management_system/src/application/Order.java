package application;

import java.time.LocalDate;

public class Order {
	
	private String orderId;
	private LocalDate time;
	private String customerId;
	private CURRENT_STATUS status;
	
	public Order(String orderId, LocalDate time, String customerId, CURRENT_STATUS status) {
		super();
		this.orderId = orderId;
		this.time = time;
		this.customerId = customerId;
		this.status = status;
	}
	
	public void addItem() {
		
	}
	
	public void removeItem() {
		
	}
	
	public boolean searchItem() {
		return true;
	}
	
	public void updateStatus() {
		
	}
	
	public int calculateTotal()
	{
		return 0;
	}
	

}
