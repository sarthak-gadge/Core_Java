package constructorHomework;

public class Customer {
	
	private int customerId;
	private String customerName;
	private double customerAge;
	
	public Customer() {
		customerId = 12;
		customerName = "Sanket";
		customerAge = 23;
	}
	
	
	public Customer(int id, String name, double age) {
		customerId = id;
		customerName = name;
		customerAge = age;
	}
	
	
	public void Print() {
		System.out.println("Customer Details:");
		System.out.println("Customer Id: "+customerId);
		System.out.println("Customer Name: "+customerName);
		System.out.println("Customer Agw: "+customerAge);
		
	}
	
	

}

