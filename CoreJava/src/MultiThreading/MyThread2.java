package MultiThreading;

//unsynchronized example

public class MyThread2 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i + " " + Thread.currentThread().getName());

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {

		Runnable r = new MyThread2();

		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);

		t1.setName("Ping");
		t2.setName("Pong");

		t1.start();
		t2.start();

	}

}
