package ExceptionHandling;

public class InvalidEmailException extends Exception {
	
	public InvalidEmailException() {
		super("your email is not valid");
	}
	

}
