package constructorHomework;

public class MainCustomer {
	
	public static void main(String[] args) {
		
		Customer c1 = new Customer();
		c1.Print();
		
		
		System.out.println("====================");
		
		Customer c2 = new Customer(56,"ravi",28);
		c2.Print();
	}

}
