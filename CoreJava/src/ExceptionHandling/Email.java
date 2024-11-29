package ExceptionHandling;

import java.util.Scanner;

public class Email {
	
	public static void main(String[] args) {
		
		boolean exit = true;
		
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("enter your email:");
		String email = sc.next();
		
		if(email.contains("@")&&email.contains(".com")) {
			System.out.println("youe email : "+email);
			exit = false;
		}else {
			try {
				throw new InvalidEmailException();
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	   }while(exit == true);
  }

}
