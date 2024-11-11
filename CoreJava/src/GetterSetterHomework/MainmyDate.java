package GetterSetterHomework;

public class MainmyDate {
	
	public static void main(String[] args) {
		myDate m1 = new myDate();
		
		m1.setbirthDate(27);
		m1.setbirthMonth("March");
		m1.setbirthYear(2002);
		
		int date = m1.getbirthDate();
		String month = m1.getbirthMonth();
		int year = m1.getbirthYear();
		
		
		System.out.println("My Details:");
		System.out.println("Birthdate is: "+date);
		System.out.println("birthj month is: "+month);
		System.out.println("birth year is: "+year);
	}

}
