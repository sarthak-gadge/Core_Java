package MultiThreading;
//part3
public class MainApp {
	
	public static void main(String[] args) {
		
		Thread t1 = new MyThread3("Shakukh");
		Thread t2 = new MyThread3("Salman");
		
		t1.start();
		t2.start();
		
	}

}
