package trail;

import java.util.StringTokenizer;

public class StringToken {


	public static void main(String[] args) {


		String s = "Java is best for mobile app development";
		StringTokenizer sT = new StringTokenizer("www.java.com",".");
		StringTokenizer sT1 = new StringTokenizer("www-java-com","-");
		System.out.println(sT1.countTokens());

		while (sT.hasMoreTokens()) {
			System.out.println(sT1.nextToken());
		}
	}
}
