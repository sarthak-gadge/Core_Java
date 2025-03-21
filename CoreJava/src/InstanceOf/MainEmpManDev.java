package InstanceOf;

import java.util.Scanner;

public class MainEmpManDev {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
		System.out.println("Menu:");
		System.out.println("1. create Manager");
		System.out.println("2. create Developer");
		System.out.println("3. Exit");
		System.out.println("Enter Your Choice: ");
		choice = sc.nextInt();
		
		
		if(choice == 1) {
			System.out.println("enter base salary for manager: ");
			int managersalary = sc.nextInt();
			System.out.println("enter hra for Manager: ");
			int hra = sc.nextInt();
			System.out.println("enter da for manager: ");
			int da = sc.nextInt();
			System.out.println("enter incentive for manager: ");
			int incentive = sc.nextInt();
			Employee emp1 = new Manager(managersalary,hra,da,incentive);
			printEmployeeSalary(emp1);
		}
		
		else if(choice == 2) {
			System.out.println("enter base salary of Developer: ");
			int developersalary = sc.nextInt();
			System.out.println("enter hra for developer: ");
			int hra = sc.nextInt();
			System.out.println("enter da for developer: ");
			int da = sc.nextInt();
			System.out.println("enter night allownace for developer: ");
			int nightAllowance = sc.nextInt();
			Employee emp2 = new Developer(developersalary,hra,da,nightAllowance);
			printEmployeeSalary(emp2);
		}	
		
		
		else if( choice == 3) {
			System.out.println("Existing the Program.");
		}
		else {
			System.out.println("Invalid choice.Try Again");
		}
		
		System.out.println();
		}while(choice !=3);
		
		sc.close();
	}

	
	private static void printEmployeeSalary(Employee emp) {
//		instance of is used here.
		if(emp instanceof Manager) {
			Manager mgr = (Manager) emp;
			int sal = mgr.calculateSalary();
			System.out.println("salary of manager is: "+sal);
		}
		else if(emp instanceof Developer) {
			Developer dev = (Developer) emp;
			int sal = dev.calculateSalary();
			System.out.println("salary of Developer is: "+sal);
		}
		else {
			System.out.println("employee is neither manager or developer");
		}
			
		
		
		
	}

}
