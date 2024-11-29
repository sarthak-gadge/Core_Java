package FunctionalInterface;

public interface Printable {
	
	int a= 0;
	
	void print();
	
	public static void demo1() {
		System.out.println("static method from interface");
	}
	
	default void demo() {
		System.out.println("default method from interface");
	}
}
