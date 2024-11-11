package GetterSetterHomework;

public class MainProduct {
	
	public static void main(String[] args) {
		Product p1 = new Product();
		
		p1.setproductId(25);
		p1.setproductName("Laptop");
		p1.setproductPrice(75000);
		
		
		int id = p1.getproductId();
		String name = p1.getproductName();
		double price = p1.getproductPrice();
		
		
		System.out.println("product detail:");
		System.out.println("product id: "+id);
		System.out.println("product name: "+name);
		System.out.println("product price: "+price);
	}
}
