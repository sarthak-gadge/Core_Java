package Interface;

public class Circle extends Shape implements Printable {
	
	private double area;
	private final double PI=3.14;
	private double radius;
	
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	
	@Override
	public void area() {
	    area = PI*radius*radius;
	    print();
	}
	
	
	@Override
	public void print() {
		System.out.println("area of circle is: "+area);
		
	}
	
	
	

}
