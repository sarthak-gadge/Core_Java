package FunctionalInterface;

public class MainPrint {
	
	public static void main(String[] args) {
		
		Printable  p = ()->{System.out.println("print method by lambda expression");};
		
		p.print();

 }
}
