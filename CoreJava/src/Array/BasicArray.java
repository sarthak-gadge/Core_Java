package Array;

public class BasicArray {
	public static void main(String[] args) {

	int []arr = new int[5];
	arr[0]=75;
	arr[1]=78;
	arr[2]=82;
	arr[3]=72;
	arr[4]=77;

	for(int i = 0;i<=5;i++)
	{
		System.out.println(arr[i]);
	}
	
	
//	
//	for using length readonly
	for(int i = 0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
	
	
	
	
	
	
	System.out.println("By Enhance for loop===========================================");
	int []arr2 = {23,45,20,78,40};
	
//	for(data type variableName:ArrayName){----------------}
	
	for(int s:arr2) {
		System.out.println(s);
	}
	
	
	
	
	System.out.println("2D Array");
	
	int [] []arr3 = new int[2][3];
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	

}
}

