package ExceptionHandling;

public class Throws {

	public static void main(String[] args) {

		System.out.println("statement 1");
		try {
			demo();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void demo1() throws ClassNotFoundException {
		demo();

	}

	public static void demo() throws ClassNotFoundException {
		Class c = Class.forName("Basic.Employee");
		System.out.println("class loadeed successfully!!!!");
	}

}
