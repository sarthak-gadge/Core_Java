package ExceptionHandling;

public class Throw {
	
	public static void main(String[] args) {
		
		int a=23;
		int b=5;
		
		if(b==5) {
			throw new ArithmeticException();
		}else {
			System.out.println(a/b);
		}
	}

}
