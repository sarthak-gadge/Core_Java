package MultiThreading;
//part1
public class MyThread3 extends Thread{
	
	String []arr = {"java","is","Object","Oriented","Programming","Language"};
	
	public MyThread3(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		Display.display(arr);
	}
	

}
