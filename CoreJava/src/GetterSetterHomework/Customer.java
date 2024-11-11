package GetterSetterHomework;

public class Customer {
	
	private int customerId;
	private String customerName;
	private double customerAge;
	
	
	public void setcustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getcustomerId() {
		return customerId;
	}
	
	
	public void setcustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getcustomerName() {
		return customerName;
	}
	
	
	public void setcustomerAge(double customerAge) {
		this.customerAge = customerAge;
	}
	public double getcustomerAge() {
		return customerAge;
	}

}
