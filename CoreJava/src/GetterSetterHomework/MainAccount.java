package GetterSetterHomework;

public class MainAccount {
	public static void main(String[] args) {
		Account a1 = new Account();
		
		a1.setaccNo(603712330);
		a1.setaccType("Saving");
		a1.setaccBalance(50000);
		
		int number = a1.getaccNo();
		String Type = a1.getaccType();
		double Balance = a1.getaccBalance();
		
		System.out.println("Account Details: ");
		System.out.println("Account Number : "+number);
		System.out.println("Account Type: "+Type);
		System.out.println("Account Balance: "+Balance);
		
	}

}
