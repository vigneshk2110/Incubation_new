package thread;

public class Son extends Thread {
	
	public void run() {

		for (int i = 1; i <= 50; i++) {
			
			System.out.println("Son Method -  Called - " + i);
		}
	}
	

}
