package typeCasting;

public class Example1 {
	
	int x = 10;
	static int y = 15;
	static Example1 s;
	static int count = 0;
	
	public void name() {
		System.out.println("Name1");
	}
	
	public static void m1() {
		System.out.println("m1 - Static");
	}
	
	 protected void finalize()  {
//		    try {
//		    	int x = 10/0;
		 count++;
//		      System.out.println("Inside finalize method of Example1 Class.");
		 System.out.println(count  + " Finalize called");
		     
//		    } 
//		    catch (Throwable e) {
//		      throw e;
//		    } 
		    
		  }
}
