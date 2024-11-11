package constructorHomework;

public class MainProduct {
	
	public static void main(String[] args) {
		
		Product p1 = new Product(99,"perfume",999);
		p1.print();
		
		System.out.println("================================================================");
		
		Product p2 = new Product();
		p2.print();
	}

}
