package typeCasting;

public class Example1Caller {
	
	public static void main1(String[] args) throws InterruptedException {
		Example1 em1 = new Example1();
//		em1.finalize();
//		em1.finalize();
		System.out.println(em1.hashCode());
		em1 = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(Example1.s.hashCode());
		Example1.s = null;
		System.gc();
//		new Example1().finalize();
	//	System.out.println(Example1.s.hashCode());
		Thread.sleep(10000);
		System.out.println("End of main");
		
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println(Runtime.getRuntime().totalMemory() + " Total Memory in bytes");
		
		for (int i = 0; i < 1001; i++) {
			
			if (i%100 == 0) {
//				System.gc();
				Runtime.getRuntime().gc();
			}
			
			Example1 em1 = new Example1();
			System.out.println(i + " th Object created");
			em1 = null;
		}
		
		System.out.println(Runtime.getRuntime().freeMemory()  + " free Memory in bytes");
		System.out.println(Example1.count);
		
	}
}
