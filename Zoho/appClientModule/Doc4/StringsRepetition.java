package Doc4;

public class StringsRepetition {

	public static void main(String[] args) {
		String s = "hello";
		int noOfTimes = 3;
		
		repeatString(s, noOfTimes);
	}

	private static void repeatString(String s, int noOfTimes) {
		
		String str = "";
		
		for (int i = 0; i < noOfTimes; i++) {
			str = str + s;
			
		}
		
		System.out.println(str);
	}

}
