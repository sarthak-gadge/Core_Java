package Polymorphism;

public class MainEmpDev {
	
	public static void main(String[] args) {
		
		Developer d1 = new Developer(22500,5245,1234,3000);
		
		 int sal = d1.calculateSalary();
		 
		 System.out.println("salary of Developer is: "+sal);
		
	}

}
