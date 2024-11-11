package Basic;

public class Employee {
	int empId;
	String empName;
	int empSalary;
	String empJob;
	
	void initInfo(){
		empId = 102;
		empName = "Sarthak";
		empSalary = 45000;
		empJob = "Manager";
	}
	
	void print(){
		System.out.println ("Employee Id:"+empId);
		System.out.println ("Employee Name: "+empName);
		System.out.println ("Employee Salary: "+empSalary);
		System.out.println ("Employee Job: "+empJob);
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee();
		
		e1.initInfo();
		e1.print();
	}

}
