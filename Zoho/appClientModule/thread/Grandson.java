package thread;

public class Grandson extends Son {

	public void run() {
		for (int i = 1; i <= 50; i++) {
			Thread.yield();
			System.out.println("Grand-Son Method -  Called - " + i);
		}
	}
}
