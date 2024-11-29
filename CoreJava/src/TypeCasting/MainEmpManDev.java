package TypeCasting;

public class MainEmpManDev {
	
//		Two type of type casting
//		1.primitive type casting.
//		2.non-primitive type casting.
//		in non primitive:- a)Upcasting.
//                           b)Downcasting
	
	public static void main(String[] args) {
//		1.Upcasting
		
		Employee emp = new Manager(25000,2564,2365,6000);
		
		//2. Downcasting - a)subclass refrence variable holds superclass upcasted object.
		                //b)ClassCastException will be occured at runtime when we try to downcast
//		                    an object which was never upcasted.
		
		Manager mgr = (Manager) emp;
		
		int inc = emp.calculateSalary();
		int sal = mgr.getIncentive();
		
		System.out.println("salary of manager is: "+(sal+inc));
	
		
		
	}
	
		
	

}
