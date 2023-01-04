package thread;

public class PlayMusic extends Thread {

	public void run() {
		for(int i=0;i<1000;i++) {
			System.out.println("Music Playing ...... " + i);
		}
	}

	public static void main(String Args[])
	{

		PlayMusic p=new PlayMusic();
		p.start();
		
		
		for(int i=0;i<1000;i++) {
			if (i==10) {
				
			}
			System.out.println("coding");
		}
		p.start();
	}
}