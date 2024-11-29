package Abstraction;

public class MainShapeRectCir {
	
	public static void main(String[] args) {
		
		Shape s1 = new Circle(5);
		double areaofcircle = s1.area();
		System.out.println("area of circle is: "+areaofcircle);
		
		
		Shape s2 = new Rectangle(12,5);
		double areaofrectangle = s2.area();
		System.out.println("area of rectangle is: "+areaofrectangle);
		
		
		
	}

}
