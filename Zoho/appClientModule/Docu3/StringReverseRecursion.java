package Docu3;

public class StringReverseRecursion {

	public static void main(String[] args) {
		String s = "one two three";
		recursiveReverse(s);
	}

	private static void recursiveReverse(String str) {
		String s = "";

		int startIndex = str.length()-1;
		int endIndex = str.length()-1;

		String word = "";

		for(int i = 0; i<str.length(); i++) {

			if((str.charAt(startIndex)==' ')){
				word = word(startIndex+1, endIndex, str);
				if(s.length() == 0) {
					s = word;
				}
				else {
					s = s + " " + word;
				}

				startIndex = startIndex-1;
				endIndex = startIndex;
			}

			else {
				startIndex--;
			}

			if(startIndex < 0) {
				word = word(startIndex+1, endIndex, str);
				if(s.length() == 0) {
					s = word;
				}
				else {
					s = s + " " + word;
				}
				break;
			}
		}
		System.out.println(s);
	}

	private static String word(int startIndex, int endIndex, String s1) {
		String s = "";

		while(startIndex<=endIndex) {
			s = s + s1.charAt(startIndex);
			startIndex++;
		}

		return s;
	}

}
