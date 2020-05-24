package thread;

public class MyThread implements Runnable {

	private Thread t1;
	private Thread t2;
	private int number;

	public MyThread(int n) {
		number = n;
		t1 = new Thread(this, "incr");
		t2 = new Thread(this, "table");
		t1.start();
		t2.start();

	}

	public void run() {
		int i;
		for (i = 1; i <= 10; i++) {

			if (Thread.currentThread() == t1) {
				System.out.println("increment - " + (number + i));
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else if (Thread.currentThread() == t2) {
				System.out.println("table - " + (number * i));
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}

			}
		}

	}

}
