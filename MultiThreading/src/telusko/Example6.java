package telusko;


public class Example6 {

	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread(() ->
		{		
			for (int i = 0; i <10; i++) {
				System.out.println("Hi...");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}, "Hi Thread");
		
		Thread t2 = new Thread(() ->
		{		
			for (int i = 0; i <10; i++) {
				System.out.println("Hello...");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}, "Hello Thread");

		t1.start();
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println(t1.getName());
		System.out.println(t1.getId());
		System.out.println(t2.getName());
		System.out.println(t2.getId());

		
		t2.start();
		
		t1.join();
		t2.join();
		System.out.println(t1.isAlive());
	
		
		System.out.println("Bye...");
	}
}

