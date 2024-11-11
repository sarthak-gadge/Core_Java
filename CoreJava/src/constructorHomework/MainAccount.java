package constructorHomework;

public class MainAccount {
	
	public static void main(String[] args) {
		Account a1 = new Account(603712230,"current",78945);
		a1.Print();
		System.out.println("=====================================================");
		Account a2 = new Account();
		a2.Print();
	}

}
