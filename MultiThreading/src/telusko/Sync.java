package telusko;

public class Sync {

	public static void main(String[] args) throws InterruptedException {
		Counter c1 = new Counter();


		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					c1.increment();
				}				
			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					c1.increment();
				}				
			}
		});


		t1.start();
		t2.start();
		t1.join();
		t2.join();

		for (int i = 0; i < 10; i++) {
			System.out.println(c1.count);
		}

	}
}

class Counter{


	int count;

	public synchronized void increment() {
		count++;
	}	
}
