package ExceptionHandling;

public class TryCatchEx2 {

	public static void main(String[] args) {

		String name = null;
		int a = 56;
		int b = 0;

		System.out.println("statement 1");

		try {
			System.out.println("statement 2" + a /b);
			System.out.println("statement 3" + name.length());
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
//			e.printStackTrace();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}

		System.out.println("statement 4");
		System.out.println("statement 5");
		System.out.println("statement 6");
		System.out.println("statement 7");
		System.out.println("statement 8");
	}

}

//one try block can handle the multiple catch block.
