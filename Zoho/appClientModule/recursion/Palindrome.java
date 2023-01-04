package recursion;

public class Palindrome {

	public static void main(String[] args) {
		
		String s = "MADe-eDAM";
		checkPalindrome(s, 0, s.length()-1);
		
	}

	private static void checkPalindrome(String s, int start, int end) {
		
		if (start>=end) {
			System.out.println("true");
			return;
		}
		
		if (s.charAt(start) != s.charAt(end)) {
			System.out.println("False");
			return;
		}
		
		checkPalindrome(s, start+1, end-1);
	}
}
