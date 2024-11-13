package ToStringMethod;

public class MainMyDatee {

	public static void main(String[] args) {

		MyDatee m1 = new MyDatee();
		MyDatee m2 = new MyDatee(11, 04, 2003);

		System.out.println("Before Swapping");
		System.out.println(m1);
		System.out.println(m2);
		System.out.println("=======================================");
		MainMyDatee.swap(m1, m2);
//		swap(m1, m2);

	}

	public static void swap(MyDatee mm1, MyDatee mm2) {
		MyDatee temp = mm1;
		mm1 = mm2;
		mm2 = temp;

		System.out.println("After Swapping");
		System.out.println(mm1);
		System.out.println(mm2);

	}

}