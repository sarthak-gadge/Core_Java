package Array;


import ToStringMethod.MyDatee;

public class MainMyDate {
	
	public static void main(String[] args) {

		MyDate m1 = new MyDate();
		MyDate m2 = new MyDate(11, 04, 2003);
		
		MyDate[] arr = new MyDate[2];
//		MyDate[]arr = {m1,m2};
		
		arr[0] = m1;
		arr[1] = m2;

		System.out.println("Before Swapping");
		for(MyDate m:arr) {
			System.out.println(m);
		}
		System.out.println("=======================================");
	
	    swap(arr);

	

		System.out.println("After Swapping");
		for(MyDate m:arr) {
			System.out.println(m);
		}
	}
	
	
	public static void swap(MyDate[]arr1) {
		MyDate temp = arr1[0];
		arr1[0] = arr1[1];
		arr1[1] = temp;
	}


}
