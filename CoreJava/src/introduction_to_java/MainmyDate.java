package introduction_to_java;

public class MainmyDate {
	
	public static void main (String[] args) {
		myDate m1 = new myDate();
		
		m1.setbirthDay(27);
		m1.setbirthMonth(3);
		m1.setbirthYear(2002);
		
		int day = m1.getbirthDay();
		int month = m1.getbirthMonth();
		int year = m1.getbirthYear();
		
		System.out.println("birthdate is : "+day+"/"+month+"/"+year);
		
	}

}
