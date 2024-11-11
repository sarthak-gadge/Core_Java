package MethodOverloading;

public class Calculator {
	
	public static void main(String[] args) {
		
		Addition a1 = new Addition();
		
		System.out.println("Addition:");
		
		int addition1 = a1.Add(12, 12);
		System.out.println(addition1);
		
		double addition2 = a1.Add(10.05, 12.60);
		System.out.println(addition2);
		
		int addition3 = a1.Add(12,13,14);
		System.out.println(addition3);
		
		
		System.out.println("===========================================================================================");
		
		
		
		Subtraction s1 = new Subtraction();
		
		System.out.println("Subtraction:");
		
		int subtraction1 = s1.Sub(20, 10);
		System.out.println(subtraction1);
		
		double subtraction2 = s1.Sub(23.10, 12.10);
		System.out.println(subtraction2);
		
		int subtraction3 = s1.Sub(20,10,5);
		System.out.println(subtraction3);
		
		
		System.out.println("============================================================================================");
		
		
		
		Multiplication m1 = new Multiplication();
		
		System.out.println("Multiplication:");
		
		int multiplication1 = m1.Multiply(12,5);
		System.out.println(multiplication1);
		
		double multiplication2 = m1.Multiply(12.30,13.30);
		System.out.println(multiplication2);
		
		int multiplication3 = m1.Multiply(12,13,14);
		System.out.println(multiplication3);
		
		
		
		System.out.println("============================================================================================");
		
		
		Division d1 = new Division();
		
		System.out.println("Division");
		
		int division1 = d1.Div(25,5);
		System.out.println(division1);
		
	}

}
