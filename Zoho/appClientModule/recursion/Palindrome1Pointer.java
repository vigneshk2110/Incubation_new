package recursion;

public class Palindrome1Pointer {

	public static void main(String[] args) {

		String s = "MADe-eDAM";
		checkPalindrome(s, 0);

	}

	private static void checkPalindrome(String s, int i) {
		if (i == s.length()/2) {
		System.out.println("true");
		return;
		}
		
		if (s.charAt(i) != s.charAt(s.length()-1-i)) {
			System.out.println("False");
			return;
		}
		
		checkPalindrome(s, i+1);
	}

}
