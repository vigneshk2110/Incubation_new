package trail;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		//		String s = "Java is best the best programming best language";
		//		
		//		Pattern p = Pattern.compile("language$");
		//		Matcher m = p.matcher(s);
		//		
		//		while (m.find()) {
		//			System.out.println(m.group() + " Starts @ " + m.start() + " & ends @ " + m.end() );
		//		}
// --------------------------------------------------------------------------------
		String s = "01ab@cbcab_cacbac";

		Pattern p = Pattern.compile("\\w");
		Matcher m = p.matcher(s);
		
		
		while (m.find()) {
			
			System.out.println(m.group() + " " + (m.start()+1));
		}
		// --------------------------------------------------------------------------------
		
//		String s = "JavaJaval got the Name from Javalanh Coffee&*  ^& from *&Indonesian Java Coffee Brand 621 7 04";
//		Pattern p = Pattern.compile(".");
//		Matcher m = p.matcher(s);
//		
//		while (m.find()) {
//			System.out.println(m.group() + " " + m.start());
//		}
		
	}
}
