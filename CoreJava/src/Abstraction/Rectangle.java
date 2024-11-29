package Abstraction;

public class Rectangle extends Shape{
	
	private double length;
	private double breadth;
	
	
	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	
	
	@Override
	public double area() {
		
		return length*breadth;
	}
	
	
	
	
	

}
