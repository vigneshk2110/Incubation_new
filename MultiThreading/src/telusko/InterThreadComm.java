package telusko;

public class InterThreadComm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class A{
	int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
}

class Producer implements Runnable{
	A a;

	public Producer(A a) {
		this.a = a;
		Thread t1 = new Thread(this, "Producer");
		t1.start();
	}


	public void run() {

		int i = 0;

		while (true) {
			a.setNum(i++);
			try {Thread.sleep(500);} catch (InterruptedException e) {}
		}
	}
}

class Consumer implements Runnable{
	A a;

	public Consumer(A a) {
		this.a = a;
		Thread t1 = new Thread(this, "Consumer");
		t1.start();
	}




	public void run() {



		while (true) {
			System.out.println(a.getNum());
			try {Thread.sleep(500);} catch (InterruptedException e) {}
		}
	}
}
