package MultiThreading;

//unsynchronized example

public class MyThread extends Thread {
	
//	running state
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i + "  " + Thread.currentThread().getName());
			
//			sleep state
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		
//		new state
		Thread t1 = new MyThread();
		Thread t2 = new MyThread();
		
//		runnable state
		t1.setName("Thread");
		t2.setName("Thread");
		
//		dead state
		t1.start();
		t2.start();

	}

}
