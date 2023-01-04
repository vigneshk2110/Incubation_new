package sample;

public class JitOFF {

	public static void main(String[] args) {


		long time1= System.currentTimeMillis();
		System.out.println(time1 + "  ---1st");
		
		for (long i = 0; i < 10000000000L; i++) {
			
		}
		long time2 = System.currentTimeMillis();
		
		System.out.println(time2+ "  ---2st");
		System.out.println(time2-time1);
	}

}
