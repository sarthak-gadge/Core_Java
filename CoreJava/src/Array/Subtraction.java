package Array;

public class Subtraction {
	
	public int sub(int a, int... b) {
		for(int s:b) {
			a-=s;
		}
		return a;
		
	}

}







