package Containment;

import ToStringMethod.MyDate;

public class MainEmployee {
	
	public static void main(String[] args) {
		
//		using default constructor
		Employee e1 = new Employee();
		System.out.println(e1);
		
		
		
//		using parametarized constructor
//		MyDate m = new MyDate(01,01,2001);
		Employee e2 = new Employee(147,"Ravi",82000,new MyDate(01,01,2001));
		System.out.println(e2);
		

		
		
	}
}
