package Docu3;

public class segmentedWords {

	//	Given an input string and a dictionary of words, 
	//	ﬁnd out if the input string can be segmented into a space-separated sequence of dictionary words. 

	public static void main(String[] args) {
		String [] dictionary =  { "I", "like", "sam",
				"sung", "samsung", "mobile",
				"ice","cream", "icecream",
				"man", "go", "mango" };

		String s1 = "icelikesamsungI";

		isSegmented(s1, dictionary);
	}


	private static void isSegmented(String s1, String[] dictionary) {
		int startIndex = 0;
		int endIndex = 0;

		String word = "";

		outerLoop:
			while(true) {

				word = returnWord(startIndex,endIndex, s1);

				innerLoop:	
					for (int j = 0; j < dictionary.length; j++) {
						if (word.equals(dictionary[j])) {
							startIndex = endIndex+1;
							endIndex = startIndex;
							break innerLoop;
						}
						if (j == dictionary.length-1) {
							endIndex++;
							break innerLoop;
						}
					}


				if (endIndex == s1.length() && startIndex == s1.length()) {
					System.out.println("yes");
					break outerLoop;
				}

				if (endIndex == s1.length() && startIndex != endIndex) {
					System.out.println("No");
					break outerLoop;
				}
			}
	}

	private static String returnWord(int startIndex, int endIndex, String s1) {
		String s = "";

		while(startIndex<=endIndex) {
			s = s + s1.charAt(startIndex);
			startIndex++;
		}
		return s;
	}
}
