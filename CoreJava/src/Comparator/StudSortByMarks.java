package Comparator;

import java.util.Comparator;

public class StudSortByMarks implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getStudMark()>o2.getStudMark()) {
			return 1;
		}
		else if(o1.getStudMark()<o2.getStudMark()) {
			return -1;
		}else {
			return 0;
		}
		
	}

}
