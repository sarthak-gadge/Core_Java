package ExceptionHandling;

import java.util.Scanner;

public class Voting {
	
	public static void main(String[] args) {
		
		boolean exit = true;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter your age");
		
		int age = sc.nextInt();
		
		if(age>=18) {
			System.out.println("vote here!!"
					             +"\n1.BJP"
					             +"\n2.SHIVSENA"
					             +"\n3.RASHTRAWADI");
			
		}else {
			
			throw new InvalidAgeException();
		}
		
		
	}

}