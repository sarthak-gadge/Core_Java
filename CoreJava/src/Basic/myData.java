package Basic;

public class myData {
	
	private int date,month,year;
	
	void detail(){
		date = 27;
		month = 3;
		year = 2002;
	}
	
	void show() {
		System.out.println("Birthdate is: "+date+"/"+month+"/"+year);
	}
	
	
	public static void main (String[] args) {
		myData m1 = new myData();
		
		m1.detail();
		m1.show();
	}

}
