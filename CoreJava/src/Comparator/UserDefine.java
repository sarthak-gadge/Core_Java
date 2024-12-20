package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Reflection.SortByName;

public class UserDefine {

	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<Employee>();
		
		Employee emp1 = new Employee(12, "Sarthak", 85000);
		empList.add(emp1);

		Employee emp2 = new Employee(45, "Sanket", 92000);
		empList.add(emp2);

		Employee emp3 = new Employee(78, "Ravi", 78000);
		empList.add(emp3);

		empList.add(new Employee(14, "Sagar", 88000));

		empList.add(new Employee(25, "Prasad", 50000));

		empList.add(new Employee(36, "Sameer", 99000));

		System.out.println("=================Unsorted Employee List=====================");
		for (Employee emp : empList) {
			System.out.println(emp);
		}

		System.out.println("===================================================");
		Collections.sort(empList,new SortById());
		System.out.println("=================Sorted Employee List by Id=====================");
		for (Employee emp : empList) {
			System.out.println(emp);
		}
		
		
		
		System.out.println("===================================================================");
		Collections.sort(empList,new SortedByName());
		System.out.println("=================Sorted Employee List by Name=====================");
		for (Employee emp : empList) {
			System.out.println(emp);
		}
		
		
		
		System.out.println("===================================================");
		Collections.sort(empList,new SortBySalary());
		System.out.println("=================Sorted Employee List by Salary=====================");
		for (Employee emp : empList) {
			System.out.println(emp);
		}
		
		



	}

}
