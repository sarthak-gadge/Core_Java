package Array;

public class Addition {
	
//	Variable Argument Example:
	
	public double add(double a,double... b) {
		for (double m:b) {
			a+=m;
	}
	return a;
	
	
	}
}