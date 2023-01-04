package thread;

public class MainCaller {

	public static void main(String[] args) throws InterruptedException {
		
		Son rajesh = new Son();
		
		rajesh.start();
		rajesh.join();
		
		for (int i = 1; i <= 5; i++) {

			System.out.println("Main Class - For Loop running - " + i);
		}
		
		
	}
}
