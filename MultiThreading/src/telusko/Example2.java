package telusko;


public class Example2 {
	
	public static void main(String[] args) {

//		Hi1 h1 = new Hi1();
//		Hello1 h2 = new Hello1();
		
		Runnable h1 = new Hi1();
		Runnable h2 = new Hello1();
		
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

class Hi1 implements Runnable{

	public void run(){		
		for (int i = 0; i <10; i++) {
			System.out.println("Hi...");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}


class Hello1 implements Runnable{

	public void run() {
		for (int i = 0; i <10; i++) {
			System.out.println("Hello...");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
