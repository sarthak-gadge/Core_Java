package Basic;

public class Product {
	int productId;
	String productName;
	int productPrice;
	
	
	void detailProduct() {
		productId = 1;
		productName = "laptop";
		productPrice = 45000;
	}
	
	void showProduct() {
		System.out.println("product id: "+productId);
		System.out.println("product name: "+productName);
		System.out.println("product price: "+productPrice);
	}
	
	public static void main(String[] args) {
		Product p1 = new Product();
		
		p1.detailProduct();
		p1.showProduct();
	}

}
