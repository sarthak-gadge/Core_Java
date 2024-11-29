package ExceptionHandling;

public class TryCatchEx {
	
	public static void main(String[] args) {
		
		String name = null;
		
		System.out.println("statement 1");
		System.out.println("statement 2");
		try {
			System.out.println("statement 3"+name.length());
		}catch(NullPointerException e) {
		System.out.println(e.getMessage());
//			e.printStackTrace();
		}
		
		System.out.println("statement 4");
		System.out.println("statement 5");
		System.out.println("statement 6");
		System.out.println("statement 7");
		System.out.println("statement 8");
	}

}




//TRY :- try contain statement in which the exception occurs and throws exception object towards catch.

//catch :- provide meaningful message to the user.

