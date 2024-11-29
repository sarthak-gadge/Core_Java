package Interface;

public class Rectangle extends Shape implements Printable {
	
	private double length;
	private double breadth;
	private double area;
	
	
	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	
	@Override
	public void area() {
		
		area = length*breadth;
		print();
	}

	@Override
	public void print() {
		System.out.println("area of rectangle: "+area);
		
	}
	
	
	
	
	

}
