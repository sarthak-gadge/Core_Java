package GetterSetterHomework;

public class Product {
	
	private int productId;
	private String productName;
	private double productPrice;
	
	public void setproductId(int productId) {
		this.productId = productId;
	}
	public int getproductId() {
		return productId;
	}
	
	
	public void setproductName(String productName) {
		this.productName = productName;
	}
	public String getproductName() {
		return productName;
	}
	
	
	public void setproductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public double getproductPrice() {
		return productPrice;
	}
}
