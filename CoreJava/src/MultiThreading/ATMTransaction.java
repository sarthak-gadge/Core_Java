package MultiThreading;

public class ATMTransaction extends Thread {

	Account ac;
	double amount;
	String flag;

	public ATMTransaction(Account ac, double amount, String flag) {
		super();
		this.ac = ac;
		this.amount = amount;
		this.flag = flag;
	}

	@Override
	public void run() {
		try {
			if (flag.equals("withraw"))
				ac.withdraw(amount);
			else
				ac.deposite(amount);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
