package trail;

import java.util.regex.Pattern;

public class Split {

	public static void main(String[] args) {
		
		String s = "Java is the Best, Programming Language.";
		
		String [] sA = s.split("\\s");
		
//		for (String string : sA) {
//			System.out.println(string);
//		}
		
		
		String s2 = "www.pichumani.com";
		String [] s2A = s2.split("\\.");
		
//		for (String string : s2A) {
//			System.out.println(string);
//		}
		
		
		Pattern p = Pattern.compile("\\.");
		
		String [] s3A = p.split(s2);
		
		for (String string : s3A) {
			System.out.println(string);
		}
		
	}
}
