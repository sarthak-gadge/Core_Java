package introduction_to_java;

public class MainAccount {
//	getsetmethod//
	
	public static void main (String[] args) {
		Account a1 = new Account();
		
	a1.setaccNumber(603712330);
	a1.setaccType("Saving");
	a1.setaccBalance(1000000);
	
	
	int number = a1.getaccNumber();
	String type = a1.getaccType();
	double balance = a1.getaccBalance();
	
	
	System.out.println("Account Details: ");
	System.out.println("account number: "+number);
	System.out.println("account type: "+type);
	System.out.println("account balance: "+balance);
		
	}

}
