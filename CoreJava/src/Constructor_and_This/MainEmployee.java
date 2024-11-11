package Constructor_and_This;

public class MainEmployee {
	
public static void main(String[] args) {
		
		Employee e1 = new Employee();
		
		e1.printInfo();
		System.out.println("========================================");
		
		Employee e2 = new Employee(512,"Sarthak",65000,"HR");
		
		e2.printInfo();
	}

}
