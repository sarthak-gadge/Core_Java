package AnonymousInnerClass;

public class MainShape {
	
	public static void main(String[] args) {
		
		Shape s = new Shape() {
			
			public double area() {
				return 45*5;
			}
			
			
			public double perimeter() {
				return 7+8+9;
			}
        };
        
        double aRect = s.area();
        double aperimeter = s.perimeter();
        
        
        System.out.println("area of rectangle: "+aRect);
        System.out.println("perimeter of triangle: "+aperimeter);
        
   }	
}
