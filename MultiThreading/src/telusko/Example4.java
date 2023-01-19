package telusko;


public class Example4 {

	public static void main(String[] args) {

		Runnable h1 = () ->
		{		
			for (int i = 0; i <10; i++) {
				System.out.println("Hi...");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		};
		Runnable h2 = () ->
		{		
			for (int i = 0; i <10; i++) {
				System.out.println("Hello...");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		};

		Thread t1 = new Thread(h1);
		Thread t2 = new Thread(h2);

		t1.start();
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
	}
}

