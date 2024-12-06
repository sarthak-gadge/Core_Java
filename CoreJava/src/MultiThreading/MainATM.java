package MultiThreading;

public class MainATM {
	public static void main(String[] args) {

		Account ac = new Account(12345, "Sarthak Gadge", 10000.00);
		Thread t1 = new ATMTransaction(ac, 2000.00, "withdraw");
		Thread t2 = new ATMTransaction(ac, 3000.00, "Deposite");

		t1.start();
		t2.start();

	}

}
