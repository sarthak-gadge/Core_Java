package GetterSetterHomework;

public class MainCustomer {
	
	public static void main(String[] agrs) {
		Customer c1 = new Customer();
		
		c1.setcustomerId(120);
		c1.setcustomerName("Sarthak");
		c1.setcustomerAge(25);
		
		int id = c1.getcustomerId();
		String name = c1.getcustomerName();
		double age = c1.getcustomerAge();
		
		
		System.out.println("Customer Detail: ");
		System.out.println("Customer id: "+id);
		System.out.println("Customer name: "+name);
		System.out.println("Customer age: "+age);
	}

}
