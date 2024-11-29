package InnerClass;

public class MainOuter {
	
	public static void main(String[] args) {
		
		Outer o = new Outer();
		o.outerMethod();
		
		Outer.Inner in = o.new Inner();
		in.innerMethod();
		
		
		
	}
	

}
