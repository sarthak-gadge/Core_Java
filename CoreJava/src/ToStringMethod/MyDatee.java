package ToStringMethod;

public class MyDatee {
	private int day;
	private int month;
	private int year;

	public MyDatee() {
		
		day = 21;
		month = 03;
		year = 2002;
		
	}
	
	
	public MyDatee(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public String toString() {		
		return "MyDate day=" + day + "\n month=" + month + "\n year=" + year + "";
	}

}
