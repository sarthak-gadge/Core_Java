package Constructor_and_This;

public class Employee {
	
	int empId;
	String empName;
	int empSalary;
	String empJob;
	
//	default Constructor
	public Employee() {
		empId = 100;
		empName = "Ravi";
		empSalary = 75000;
		empJob = "Manager";
	}
	
//parameterized constructor
    
    public Employee(int id, String name, int salary, String job) {
    empId = id;
    empName = name;
    empSalary = salary;
    empJob = job;
}	
	
	public int getempId() {
		return empId;
	}
	
	public String getempName() {
		return empName;
	}
	
	public int getempSalary() {
		return empSalary;
	}
	
	public String getempJob() {
		return empJob;
	}
	
	
	  public void printInfo()
	    {
	    	System.out.println("Employee ID :"+empId);
			System.out.println("Employee Name :"+empName);
			System.out.println("Employee Salary :"+empSalary);
			System.out.println("Employee Job :"+empJob);
	    }
}
