package Polymorphism;

public class MainEmpMan {
	
	public static void main(String[] args) {
		
		Manager m1 = new Manager(12500,4562,3542,8000);
		
		int sal = m1.calculateSalary();
		
		System.out.println("Manager Salary: "+sal);
	}

}
