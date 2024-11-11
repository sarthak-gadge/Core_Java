package MethodOverloading;

public class MainAddition {
	public static void main(String[] args) {
		
		Addition a1 = new Addition();
		
		System.out.println("Addition:");
		
		int addition1 = a1.Add(10,20); 
		System.out.println(addition1);
		
		double addition2 = a1.Add(12.60, 15.40);
		System.out.println(addition2);
		
		int addition3 = a1.Add(12, 15,10);
		System.out.println(addition3);
		
		
		
		
	}

}
