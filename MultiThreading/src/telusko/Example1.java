package telusko;


public class Example1 {
	
	public static void main(String[] args) {

		Hi h1 = new Hi();
		Hello h2 = new Hello();
		
		h1.start();
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		h2.start();
	}
}

class Hi extends Thread{

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


class Hello extends Thread{

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
