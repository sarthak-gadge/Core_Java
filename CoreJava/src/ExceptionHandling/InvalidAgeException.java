package ExceptionHandling;

public class InvalidAgeException extends RuntimeException {
	
	public InvalidAgeException() {
		super("your age is less than 18");
	}
	
	public InvalidAgeException(String s) {
		super(s);
	}

}
