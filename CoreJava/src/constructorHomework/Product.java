package constructorHomework;

public class Product {
	
	private int productId;
	private String productName;
	private double productPrice;
	
	
	public Product() {
		productId = 55;
		productName = "Bag";
		productPrice = 2000;
	}
	
	
	public Product(int id,String name,double price) {
		productId = id;
		productName = name;
		productPrice = price;
	}
	
	
	public void print() {
		System.out.println("Product Details:");
		System.out.println("Product Id: "+productId);
		System.out.println("Product Name: "+productName);
		System.out.println("Product Price: "+productPrice);
	}

}
