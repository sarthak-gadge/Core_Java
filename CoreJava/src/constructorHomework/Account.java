package constructorHomework;

public class Account {
	
	private int accNo;
	private String accType;
	private double accBalance;
	
	
	public Account() {
		accNo = 123456;
		accType = "saving";
		accBalance = 1000000;
		
	}
	
	public Account(int no, String type, double balance) {
		accNo = no;
		accType = type;
		accBalance = balance;
	}
	
	public void Print() {
		System.out.println("Account details:");
		System.out.println("Account no: "+accNo);
		System.out.println("Account Type: "+accType);
		System.out.println("Account Balance: "+accBalance);
		
		
	}
	

}
