package ToStringMethod;

public class MyDate {

	private int day;
	private int month;
	private int year;

	public MyDate() {
		
		day = 21;
		month = 03;
		year = 2002;
		
	}

	public MyDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public String toString() {
//		return "MyDate [day=" + day + ", month=" + month + ", year=" + year + "]";
		
		return "MyDate day=" + day + "\n month=" + month + "\n year=" + year + "";
	}

}
