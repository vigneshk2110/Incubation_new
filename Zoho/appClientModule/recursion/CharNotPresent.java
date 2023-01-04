package recursion;

public class CharNotPresent {

	static String s = "abecd";
	public static void main(String[] args) {

		
//		System.out.println(notPresent('d', 0));
		
		System.out.println(notPresent(s , 'z'));

	}
	
	private static boolean notPresent(String s, char c) {
		
		if (s.length()==1 && s.charAt(0) != c) {
			return true;
		}
		else if (s.charAt(0) == c) {
			return false;
		}
//		else if (s.length()>=1 && s.charAt(0) == c) {
//			return false;
//		}
		else if (s.charAt(0) != c) {
			return notPresent(s.substring(1), c);
		}
//		else if (s.length()>=1 && s.charAt(0) != c) {
//			return notPresent(s.substring(1), c);
//		}
		else {
			return true;
		}
	}

	private static boolean notPresent(char c, int index) {

		if (index == s.length()) {
			return true;
		}

		char[] strArr = s.toCharArray();

		if(c == strArr[index]) {
			return false;
		}
		return notPresent(c, index+1);

	}

}
