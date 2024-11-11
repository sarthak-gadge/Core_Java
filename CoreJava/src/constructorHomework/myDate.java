package constructorHomework;

public class myDate {
	
	private int birthDate;
	private String birthMonth;
	private int birthYear;
	
	public myDate() {
		birthDate = 27;
		birthMonth = "March";
		birthYear = 2002;
	}
	
	
	public myDate(int date, String month, int year) {
		birthDate = date;
		birthMonth = month;
		birthYear = year;
	}
	
	
	
	public void printInfo() {
		System.out.println("My Details:");
		System.out.println("My BirthDate: "+birthDate);
		System.out.println("My BirthMonth: "+birthMonth);
		System.out.println("My BirthYear: "+birthYear);
	}

}
