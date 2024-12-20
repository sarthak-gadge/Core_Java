package Comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class UserDefineStudentssss {
	
	public static void main(String[] args) {
		
		List<Student> studList = new ArrayList<Student>();
		
		Student stud1 = new Student(10,"Sanket",90.80);
		studList.add(stud1);
		
		Student stud2 = new Student(55,"Ravi",75.20);
		studList.add(stud2);
		
		Student stud3 = new Student(40,"Sagar",60.60);
		studList.add(stud3);
		
		studList.add(new Student(8,"Amar",95.60));
		
		studList.add(new Student(30,"Ketan",70.20));
		
		studList.add(new Student(45,"Om",62.12));
		
		
		System.out.println("===============Unordered List================================");
		for(Student stud:studList) {
			System.out.println(stud);
		}
		
		
		
		System.out.println("==============================================================");
		Collections.sort(studList ,new StudSortById());
		System.out.println("=========================Sorted By Student ID:====================");
		for(Student stud:studList) {
			System.out.println(stud);
		}
		
		System.out.println("=======================================================================");
		Collections.sort(studList , new StudSortByName());
		System.out.println("====================Sorted By Student Name:=================================");
		for(Student stud:studList) {
			System.out.println(stud);
		}
		
		
		System.out.println("=====================================================================");
		Collections.sort(studList,new StudSortByMarks());
		System.out.println("=====================Sort By Student Marks:============================");
		for(Student stud:studList) {
			System.out.println(stud);
		}
		
		
		
	}

}
